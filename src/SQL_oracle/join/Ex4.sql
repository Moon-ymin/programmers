/* 조건에 맞는 도서와 저자 리스트 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/144854
*/
SELECT book_id, author_name, to_char(published_date, 'yyyy-mm-dd') as published_date
from book a join author b on a.author_id = b.author_id
where category = '경제'
order by 3;
