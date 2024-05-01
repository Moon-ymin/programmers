/* 나이 정보가 없는 회원 수 구하기
- https://school.programmers.co.kr/learn/courses/30/lessons/131528?language=oracle
*/
SELECT count(*) as users
from user_info
where age is null;
