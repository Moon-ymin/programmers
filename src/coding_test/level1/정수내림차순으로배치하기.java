package coding_test.level1;
import java.util.*;

// 정수 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        String[] nums = num.split("");
        long answer = 0;
        num = "";

        Arrays.sort(nums, Comparator.reverseOrder());
        for(String s : nums){
            num += s;
        }
        answer = Long.parseLong(num);
        return answer;
    }
}
