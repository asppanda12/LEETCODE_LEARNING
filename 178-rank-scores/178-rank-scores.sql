# Write your MySQL query statement below
SELECT score,
DENSE_RANK() OVER (
ORDER BY score desc
) AS 'rank' 
FROM Scores;

# SELECT 
#     score,
#     DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
# FROM Scores
