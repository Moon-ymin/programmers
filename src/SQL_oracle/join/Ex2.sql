/* 특정 기간동안 대여 가능한 자동차들의 대여비용 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/157339
*/
select a.car_id, a.car_type, daily_fee*30*(1-b.discount_rate/100) as fee
from car_rental_company_car a join car_rental_company_discount_plan b
on a.car_type = b.car_type
and a.car_type in ('세단', 'SUV')
and b.duration_type = '30일 이상'
and a.car_id
not in ( select c.car_id
from car_rental_company_rental_history c
where '202211' between to_char(start_date, 'yyyymm') and to_char(end_date, 'yyyymm')
and a.car_id = c.car_id )
and daily_fee*30*(1-b.discount_rate/100) between 500000 and 2000000-1
order by 3 desc, 2, 1 desc
