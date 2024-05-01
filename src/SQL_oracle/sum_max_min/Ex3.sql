/* 최댓값 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/59415?language=oracle
*/
select datetime
from (SELECT *
from animal_ins
order by datetime desc)
where rownum = 1;
