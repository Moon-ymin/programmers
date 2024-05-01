/* 진료과별 총 예약 횟수 출력하기
- https://school.programmers.co.kr/learn/courses/30/lessons/132202?language=oracle
*/
select mcdp_cd as "진료과코드", count(*) as "5월예약건수"
from appointment
where to_char(apnt_ymd, 'yyyy-mm') = '2022-05'
group by mcdp_cd
order by count(*) asc, mcdp_cd asc;
