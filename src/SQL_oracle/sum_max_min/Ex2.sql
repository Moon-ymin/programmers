/* 가격이 제일 비싼 식품의 정보 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131115
*/ 
SELECT *
from (select * from food_product order by price desc)
where rownum = 1;
