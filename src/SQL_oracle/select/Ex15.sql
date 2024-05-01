/* 아픈 동물 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59036
*/
SELECT animal_id, name
from animal_ins
where intake_condition = 'Sick'
order by animal_id;
