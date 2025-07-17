# Write your MySQL query statement below
select s.student_id , s.student_name , sub.subject_name , count(e.subject_name) as attended_exams
from Students as s 
CROSS JOIN Subjects as sub
LEFT JOIN Examinations as e 
    ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
group by s.student_id , s.student_name , sub.subject_name
order by s.student_id ;
-- group by s.student_id , sub.subject_name;