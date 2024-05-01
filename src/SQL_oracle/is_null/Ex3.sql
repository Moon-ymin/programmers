/* 이름이 있는 동물의 아이디
- https://school.programmers.co.kr/learn/courses/30/lessons/59407
*/
SELECT animal_id
from animal_ins
where name is not null
order by 1;
