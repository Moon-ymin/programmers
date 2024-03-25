/* 가격대 별 상품 개수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131530
*/
SELECT floor(price/10000) * 10000 as price_group, count(*) as products
from product
group by floor(price/10000) * 10000
order by price_group;
