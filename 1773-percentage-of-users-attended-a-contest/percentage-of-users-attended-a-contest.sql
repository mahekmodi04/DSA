# Write your MySQL query statement below
SELECT r.contest_id, 
ROUND((count(r.contest_id) / (select count(*) from Users))*100 ,2)
AS percentage
FROM Register as r
LEFT JOIN Users as u
ON u.user_id = r.user_id
group by r.contest_id
ORDER BY percentage desc, r.contest_id asc;