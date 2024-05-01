/* 조건에 맞는 사용자 정보 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/164670
*/
select user_id, nickname, 
    city ||' '||street_address1 ||' '||street_address2 as 전체주소,
    substrb(tlno,1,3) ||'-'|| substrb(tlno,4,4) ||'-'|| substrb(tlno,8,4) as 전화번호
from used_goods_user
    where user_id in 
        (SELECT writer_id
        from used_goods_board
        group by writer_id
        having count(writer_id) >= 3)
order by user_id desc;
