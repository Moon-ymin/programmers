/* 상위 n개 레코드
- https://school.programmers.co.kr/learn/courses/30/lessons/59405
- oracle : rownum과 인라인 뷰 : https://m.blog.naver.com/PostView.nhn?blogId=heartflow89&logNo=221005192056&proxyReferer=https:%2F%2Fwww.google.com%2F
*/
SELECT name 
from ( select * from animal_ins order by datetime)
where rownum = 1;
