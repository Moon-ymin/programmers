/* 조건에 맞는 회원수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131535
*/
SELECT count(*) as users
from user_info
where to_char(joined, 'yyyy') = '2021'
and age between 20 and 29;
