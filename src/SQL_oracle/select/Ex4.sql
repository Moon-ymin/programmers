/* 평균 일일 대여 요금 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/151136
*/
SELECT round(avg(daily_fee),0) as average_fee
from car_rental_company_car
where car_type = 'SUV';
