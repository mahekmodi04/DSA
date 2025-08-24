# Write your MySQL query statement below
-- select product_id, IFNULL(avg(p.price * u.units),0) as average_price 
-- from Prices as p
-- join UnitsSold as u
-- ON p.product_id = u.product_id
-- group by p.product_id;

select p.product_id, 
IFNULL(ROUND(SUM(u.units * p.price)* 1.0 / SUM(u.units),2), 0)
AS average_price
from Prices as p
LEFT JOIN UnitsSold as u 
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id
order by p.product_id;
