/* 조건에 부합하는 중고거래 댓글 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/164673?language=oracle
*/

SELECT title, b.board_id, r.reply_id, r.writer_id, r.contents, to_char(r.created_date, 'YYYY-MM-DD') as created_date
from used_goods_board b inner join used_goods_reply r on b.board_id = r.board_id
where to_char(b.created_date,'yyyy-mm') = '2022-10'
order by r.created_date asc, b.title asc;
