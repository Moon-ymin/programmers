/* 대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/151139
*/
SELECT extract(month from start_date) as month, car_id, count(*) as records
from car_rental_company_rental_history
where car_id in (
    select car_id
    from car_rental_company_rental_history
    where extract(month from start_date) in (8,9,10) and extract(year from start_date) = 2022
    group by car_id
    having count(*) >= 5
    ) and extract(month from start_date) in (8,9,10) 
group by extract(month from start_date), car_id
having count(*) <> 0
order by month, car_id desc;
