/* 5월 식품들의 총매출 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131117
*/
SELECT o.product_id, p.product_name, sum(amount*price) as total_sales
from food_order o join food_product p on o.product_id = p.product_id 
where to_char(produce_date, 'yyyymm') = '202205'
group by o.product_id, p.product_name
order by 3 desc, 1
