package coding_test.level1;
import java.util.*;
// 예산 : https://school.programmers.co.kr/learn/courses/30/lessons/12982
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}
