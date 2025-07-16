# Write your MySQL query statement below

-- select customer_id , count(*) from Visits
-- group by customer_id;


select customer_id, count(*) as count_no_trans
from Visits 
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
where Transactions.visit_id  IS NULL
group by customer_id;