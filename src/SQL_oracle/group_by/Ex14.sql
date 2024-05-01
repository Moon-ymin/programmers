/* 입양 시각 구하기(1)
- https://school.programmers.co.kr/learn/courses/30/lessons/59412
*/
select ltrim(hour, 0) as hour, count
from (
  SELECT to_char(datetime, 'hh24') as hour, count(animal_id) as count
  from animal_outs
  group by to_char(datetime, 'hh24')
  having to_char(datetime, 'hh24') between '09' and '19'
  order by 1
  );
