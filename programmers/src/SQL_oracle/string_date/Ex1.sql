/* 조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/164671
*/
select '/home/grep/src/'||b.board_id||'/'||file_id||file_name||file_ext as file_path
from used_goods_board b, used_goods_file f
where b.board_id = f.board_id
and views = (select max(views) from used_goods_board)
order by f.file_id desc;
