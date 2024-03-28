/* 이름에 el이 들어가는 동물 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59047
*/
SELECT animal_id, name
from animal_ins
where lower(name) like '%el%' and animal_type = 'Dog'
order by name;

-- ''안에 문자는 소문자로 인식
-- 대소문자 구분 없음 이라는 조건 때문에lower(name)으로 바꿔서 like문 확인해야 함
