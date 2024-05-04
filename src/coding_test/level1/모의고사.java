package coding_test.level1;

// 모의고사 : https://school.programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] a = {1,2,3,4,5}; // 5
        int[] b = {2,1,2,3,2,4,2,5}; // 8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; // 10

        for(int i=0; i<answers.length; i++){
            if (answers[i] == a[i % a.length] ) answer[0]++;
            if (answers[i] == b[i % b.length] ) answer[1]++;
            if (answers[i] == c[i % c.length] ) answer[2]++;
        }

        int max = 0;
        for(Integer num : answer){
            if (max < num) max = num;
        }
        List<Integer> last = new ArrayList<>();
        for(int i=0; i<3; i++){
            if (answer[i] == max) last.add(i+1);
        }
        answer = last.stream().mapToInt(Integer::intValue).sorted().toArray();

        return answer;
    }
}
