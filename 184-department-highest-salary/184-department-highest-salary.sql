# Write your MySQL query statement 
select s.department as 'Department',Employee.name as 'Employee',s.salary as 'Salary'

    from Employee JOIN (



select table1.DepartmentId,table1.salary, Department.name as department
from Department  inner join
(SELECT DepartmentId, name,MAX(salary) as 'Salary'
from Employee 
group by departmentId)table1 on Department.id = table1.DepartmentId)



s on Employee.departmentId=s.DepartmentId AND Employee.salary =s.salary ; 
