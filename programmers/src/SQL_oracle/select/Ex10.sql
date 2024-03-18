/* 서울에 위치한 식당목록 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131118
*/
SELECT i.rest_id, rest_name, food_type, favorites, address, round(avg(review_score),2) as score
from rest_info i join rest_review r 
on i.rest_id = r.rest_id
group by i.rest_id, rest_name, food_type, favorites, address
having address like '서울%'
order by avg(review_score) desc, favorites desc;

