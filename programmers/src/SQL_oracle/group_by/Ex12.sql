/* 동명 동물 수 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59041
*/
SELECT name, count(*) as count
from animal_ins
where name is not NULL
group by name
having count(*) > 1
order by 1;
