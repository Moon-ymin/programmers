/* 년, 월, 성별 별 상품 구매 회원 수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131532
*/
select extract(year from sales_date) as year, 
  extract(month from sales_date) as month, 
  gender, 
  count(distinct(u.user_id)) as users
from online_sale o inner join
( SELECT user_id, gender
    from user_info
    where gender is not null ) u
    on o.user_id = u.user_id
group by extract(year from sales_date),
  extract(month from sales_date),
  gender
order by 1, 2, 3;
