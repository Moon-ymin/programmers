/* 이름이 없는 동물의 아이디
- https://school.programmers.co.kr/learn/courses/30/lessons/59039
*/
SELECT animal_id
from animal_ins
where name is null
order by 1;
