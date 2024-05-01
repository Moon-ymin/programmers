/* 3월에 태어난 여성 회원 목록 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131120 
*/

SELECT member_id, member_name, gender, to_char(date_of_birth,'YYYY-MM-DD') as date_of_birth
from member_profile
where to_char(date_of_birth, 'MM') = '03'  
and gender = 'W'
and tlno is not NULL
order by member_id;
