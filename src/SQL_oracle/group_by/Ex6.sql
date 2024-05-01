/* 즐겨찾기가 가장 많은 식당 정보 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131123
*/
select food_type, rest_id, rest_name, favorites
from rest_info
where (food_type, favorites) in 
(select food_type, max(favorites)
from rest_info
group by food_type)
order by food_type desc;
