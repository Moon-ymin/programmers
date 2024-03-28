/* 오랜 기간 보호한 동물(2)
- https://school.programmers.co.kr/learn/courses/30/lessons/59411
*/
select animal_id, name
from 
    (SELECT o.animal_id, o.name, (o.datetime - i.datetime + 1) as diff
    from animal_outs o join animal_ins i
    on o.animal_id = i.animal_id
    order by 3 desc)
where rownum <= 2;
