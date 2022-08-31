select table2.Department,e2.name as'Employee',table2.salary as 'Salary'
from Employee as e2 INNER JOIN (
select Department.id as 'id',Department.name as 'Department',table1.max_salary as 'salary'
from Department inner join
(select e1.departmentId as 'id',MAX(e1.salary) as 'max_salary'
from Employee as e1
group by departmentId)table1
on table1.id=Department.id) table2 
ON e2.departmentId =table2.id and e2.salary=table2.salary;