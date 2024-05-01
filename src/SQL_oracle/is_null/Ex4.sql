/* NULL 처리하기
- https://school.programmers.co.kr/learn/courses/30/lessons/59410
*/
SELECT ANIMAL_TYPE, nvl(name,'No name') as name, sex_UPON_intake
from animal_ins
order by animal_id;
