/* 루시와 엘라 찾기
- https://school.programmers.co.kr/learn/courses/30/lessons/59046?language=oracle
*/
SELECT animal_id, name, sex_upon_intake
from animal_ins
where name in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
order by 1;
