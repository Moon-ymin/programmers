/* 과일로 만든 아이스크림 고르기
- https://school.programmers.co.kr/learn/courses/30/lessons/133025
*/
SELECT i.flavor
from first_half f join icecream_info i on f.flavor = i.flavor
where i.ingredient_type = 'fruit_based'
and total_order >= 3000
order by total_order desc;
