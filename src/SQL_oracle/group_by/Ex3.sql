/* 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/151137?language=oracle
*/
SELECT car_type, count(car_type) as cars
from car_rental_company_car
where options like '%통풍시트%'
or options like '%열선시트%'
or options like '%가죽시트%'
group by car_type
order by car_type;
