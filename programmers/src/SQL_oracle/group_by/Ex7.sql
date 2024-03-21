/* 카테고리 별 도서 판매량 집계하기
- https://school.programmers.co.kr/learn/courses/30/lessons/144855
*/
select category, sum(sales) as total_sales
from book a join
( SELECT book_id, sum(sales) as sales
                    from book_sales
                    where to_char(sales_date, 'yyyy-mm') = '2022-01'
                    group by book_id
) b
on a.book_id = b.book_id
group by category
order by category asc;
