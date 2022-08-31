# Write your MySQL query statement below
SELECT Distinct(l1.num) as 'ConsecutiveNums'
FROM logs as l1,logs as l2,logs as l3
where l1.num=l2.num and l2.num=l3.num and l1.id=l2.id+1 and l2.id=l3.id+1;