/* 고양이와 개는 몇 마리 있을까
- https://school.programmers.co.kr/learn/courses/30/lessons/59040
*/
SELECT animal_type, count(*) as count
from animal_ins
group by animal_type
order by 1;
