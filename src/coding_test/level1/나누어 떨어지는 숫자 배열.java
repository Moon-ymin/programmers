package coding_test.level1;/* 나누어 떨어지는 숫자 배열 : https://school.programmers.co.kr/learn/courses/30/lessons/12910 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> li = new ArrayList<>();
        
        for(Integer a : arr) {
            if (a % divisor == 0) {
                li.add(a);
            }
        }
        Collections.sort(li);
        int[] answer;
        if (li.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[li.size()];
            answer = li.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
    }
}
