/* 조건에 부합하는 중고거래 상태 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/164672
*/
SELECT board_id, writer_id, title, price, 
    case  status when 'SALE' then '판매중'
    when 'RESERVED' then '예약중'
    when 'DONE' then '거래완료'
    end as status
from used_goods_board
where to_char(created_date, 'yyyy-mm-dd') = '2022-10-05'
order by 1 desc;
