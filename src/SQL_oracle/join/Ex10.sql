/* 상품 별 오프라인 매출 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131533
*/
select a.product_code, b.sales_amount * a.price as sales
from product a join ( select product_id, sum(sales_amount) as sales_amount
from offline_sale
group by product_id ) b
on a.product_id = b.product_id
order by 2 desc, 1;
