package coding_test.level1;

import java.util.*;

// K번째 수 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<answer.length; i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                li.add(array[j]); // 1. 자르기
            }
            Collections.sort(li);   // 2. 정렬
            answer[i] = li.get(commands[i][2]-1);   // 3. 숫자 뽑기
        }
        return answer;
    }
}

