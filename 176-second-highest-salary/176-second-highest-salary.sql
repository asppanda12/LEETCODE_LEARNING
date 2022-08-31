# Write your MySQL query statement below
select ifnull(NULL,
(
select t1.salary 
from(
    (select  salary,Dense_Rank() OVER (ORDER BY salary desc) as 'rank'
    from Employee)
  )t1
  where t1.rank = 2
  limit 1
) )as 'SecondHighestSalary';