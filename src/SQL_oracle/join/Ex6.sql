/* 없어진 기록 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59042?language=oracle
*/
select o.animal_id, o.name
from animal_ins i right outer join animal_outs o
on i.animal_id = o.animal_id
where i.animal_id is null
order by animal_id;
