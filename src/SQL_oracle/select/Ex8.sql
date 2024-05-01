/* 조건에 맞는 도서 리스트 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/144853
*/
SELECT book_id, to_char(published_date, 'yyyy-mm-dd') as published_date
from book
where to_char(published_date,'yyyy') = '2021'
and category = '인문'
order by published_date asc;
