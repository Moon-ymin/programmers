/* 어린 동물 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59037?language=oracle#fn1
*/
SELECT animal_id, name
from animal_ins
where intake_condition <> 'Aged'
order by animal_id;
