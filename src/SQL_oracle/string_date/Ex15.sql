/* DATETIME에서 DATE로 형 변환 
- https://school.programmers.co.kr/learn/courses/30/lessons/59414
*/
SELECT animal_id, name, to_char(datetime, 'yyyy-mm-dd') as 날짜
from animal_ins
order by 1;
