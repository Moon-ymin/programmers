/* 최솟값 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/59038
*/
select datetime 
from (SELECT * 
from animal_ins
order by datetime)
where rownum=1;
