/* 대여 기록이 존재하는 자동차 리스트 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/157341
*/
select distinct(car_id)
from car_rental_company_car
where car_id in 
    (SELECT car_id
    from car_rental_company_rental_history
    where to_char(start_date,'yyyy-mm-dd') 
     like '%-10-%')
and car_type = '세단'
order by 1 desc;
