/* 주문량이 많은 아이스크림들 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/133027?language=oracle
*/
select flavor
from 
( SELECT f.flavor, sum(f.total_order + j.total_order) as sum_total
from first_half f join july j 
on f.flavor = j.flavor
group by f.flavor
order by 2 desc)
where rownum <= 3;
