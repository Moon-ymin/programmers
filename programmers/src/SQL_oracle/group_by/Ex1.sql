/* 조건에 맞는 사용자와 총 거래금액 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/164668
*/
select user_id, nickname, total_sales
from used_goods_user a inner join
    (select writer_id, sum(price) as total_sales
    from used_goods_board
    where status = 'DONE'
    group by writer_id) b
on a.user_id = b.writer_id
where total_sales >= 700000
order by total_sales;

/* 처음시도
select a.user_id, a.nickname, sum(b.price) as total_sales
from used_goods_user a
join used_goods_board b
on a.user_id = b.writer_id
where b.status = 'DONE'
group by a.user_id, a.nickname, b.price
having sum(b.price) >= 700000
order by sum(b.price) asc;


1. 오라클에서 select 절에 모든 열을 group by 열에 넣어줘야 함
2. 그룹화 및 정렬의 차이: 사용자별로 모든 매출을 합산한 후 결과를 필터링하여 700,000 이상인 경우만 반환
-> 각 사용자에 대해 하나의 행만 반환
-> 정답은 각 작성자(사용자)별로 총 매출을 계산한 후 결과를 조인하므로, 
동일한 사용자가 여러 작품을 작성했을 경우 여러 행이 반환될 수 있는 차이가 있었음
3. oracle에서는 인라인뷰로 정리된 테이블을 넣어서 조인시키는게 더 낫다고 생각함
*/
