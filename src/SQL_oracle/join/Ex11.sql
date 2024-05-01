/* 상품을 구매한 회원 비율 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131534
*/
select to_char(sales_date, 'yyyy') as year, 
to_number(to_char(sales_date, 'mm')) as month,
count(unique(a.user_id)) as purchased_user,
round(count(unique(a.user_id)) / c.cnt, 1) as purchased_ratio
from online_sale a, user_info b, 
    ( SELECT COUNT(*) AS CNT
    from user_info
    where to_char(joined,'yyyy') = '2021' ) c
where a.user_id = b.user_id
and to_char(b.joined, 'yyyy') = '2021'
group by to_char(sales_date, 'yyyy'), to_char(sales_date, 'mm'), c.cnt
order by 1, 2
