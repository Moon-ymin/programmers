/* 자동차 대여 기록에서 장기/단기 대여 구분하기
- https://school.programmers.co.kr/learn/courses/30/lessons/151138
*/
SELECT history_id, car_id, 
  to_char(start_date, 'yyyy-mm-dd') as start_date, 
  to_char(end_date, 'yyyy-mm-dd') as end_date,
    case when (end_date - start_date + 1) >= 30 then '장기 대여'
    else '단기 대여'
    end as rent_type
from car_rental_company_rental_history
where to_char(start_date, 'yyyy-mm-dd') like '2022-09-%'
order by 1 desc;
