/* 강원도에 위치한 생산공장 목록 출력
- https://school.programmers.co.kr/learn/courses/30/lessons/131112
*/
SELECT factory_id, factory_name, address
from food_factory
where address like '강원도%'
order by factory_id asc;
