# Write your MySQL query statement below
select e.name , b.bonus 
from Employee as e
LEFT JOIN Bonus as b
ON e.empId = b.empId
where b.bonus < 1000 || b.bonus IS NULL;