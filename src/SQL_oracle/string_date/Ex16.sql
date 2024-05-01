/* 카테고리 별 상품 개수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131529
*/
SELECT substr(product_code,1,2) as category, count(*) as products
from product
group by substr(product_code,1,2)
order by 1; 
