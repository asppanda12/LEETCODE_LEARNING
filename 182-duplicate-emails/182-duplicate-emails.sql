SELECT DISTINCT p1.Email
FROM Person as p1 JOIN Person as p2
ON p1.Email = p2.Email and p1.id != p2.id
;