/* 성분으로 구분한 아이스크림 총 주문량
- https://school.programmers.co.kr/learn/courses/30/lessons/133026
*/
SELECT ingredient_type, sum(total_order) as total_order
from first_half a join icecream_info b
on a.flavor = b.flavor
group by ingredient_type
order by total_order asc;
