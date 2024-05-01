/* 취소되지 않은 진료 예약 조회하기
- https://school.programmers.co.kr/learn/courses/30/lessons/132204
*/
select b.apnt_no, b.pt_name, b.pt_no, mcdp_cd, d.dr_name, b.apnt_ymd
from doctor d join
    ( SELECT a.mddr_id, a.apnt_no, a.apnt_ymd, a.pt_no, p.pt_name
    from appointment a join patient p on a.pt_no = p.pt_no
    where a.mcdp_cd = 'CS'
    and to_char(a.apnt_ymd,'yyyy-mm-dd') like '2022-04-13' and a.apnt_cncl_yn = 'N') b 
on d.dr_id = b.mddr_id
order by 6 asc;
