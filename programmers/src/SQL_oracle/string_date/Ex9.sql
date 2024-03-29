/* 자동차 평균 대여 기간 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/157342
*/
SELECT car_id, round(avg(end_date - start_date + 1),1) as average_duration
from car_rental_company_rental_history
group by car_id
having avg(end_date - start_date + 1) >= 7
order by 2 desc, 1 desc;
