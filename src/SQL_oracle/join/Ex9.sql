/* 보호소에서 중성화한 동물
- https://school.programmers.co.kr/learn/courses/30/lessons/59045?language=oracle
*/
SELECT i.animal_id, i.animal_type, i.name
from animal_ins i left join animal_outs o
on i.animal_id = o.animal_id
where (i.sex_upon_intake like 'Intact%') 
and (o.sex_upon_outcome like 'Spayed%' or o.sex_upon_outcome like 'Neutered%')
order by i.animal_id
