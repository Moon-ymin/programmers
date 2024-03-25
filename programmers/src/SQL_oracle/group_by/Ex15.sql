/* 입양 시각 구하기(2)
- https://school.programmers.co.kr/learn/courses/30/lessons/59413?language=oracle
*/
select L.hour, NVL(count, 0) as count
from (select to_char(datetime, 'hh24') as hour, count(*) as count 
     from animal_outs
     group by to_char(datetime, 'hh24')
     order by hour) R,
(select (level-1) as hour from dual connect by level <= 24) L
where L.hour = R.hour(+)
order by L.hour;

-- level() 함수
-- nvl() 함수
-- 열(+) 
