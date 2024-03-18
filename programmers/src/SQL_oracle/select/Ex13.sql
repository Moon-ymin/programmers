/* 오프라인/온라인 판매 데이터 통합하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131537
*/
SELECT sales_date, product_id, user_id, sales_amount
from (
    select to_char(sales_date, 'yyyy-mm-dd') sales_date, product_id, user_id, sales_amount 
    from online_sale
    where to_char(sales_date, 'yyyy-mm')='2022-03'
    union All
    select to_char(sales_date, 'yyyy-mm-dd') sales_date, product_id, NULL, sales_amount 
    from offline_sale
    where to_char(sales_date, 'yyyy-mm')='2022-03' 
    )
order by 1,2,3;
