# Write your MySQL query statement below
select   e1.Name AS 'Employee'
from Employee e1  JOIN Employee e2
ON e1.managerId = e2.id  AND e1.salary>e2.salary;
