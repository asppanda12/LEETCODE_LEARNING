CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;
  RETURN (
      select IFNULL(NULL,(select  DISTINCT(SALARY) 
        from Employee 
        ORDER BY SALARY DESC
        LIMIT N,1        
      )) AS 'getNthHighestSalary'
                         
  );
END