/* 자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기
- https://school.programmers.co.kr/learn/courses/30/lessons/157340
*/
select car_id, case when car_id in
(select car_id 
 from CAR_RENTAL_COMPANY_RENTAL_HISTORY
 where '20221016' BETWEEN to_char(START_DATE, 'YYYYMMDD') AND to_char(END_DATE, 'YYYYMMDD') 
)
then '대여중'
else '대여 가능' end "availability"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by 1 desc;
