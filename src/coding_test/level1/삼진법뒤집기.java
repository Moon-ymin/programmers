package coding_test.level1;
// 3진법 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/68935
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> li = new ArrayList<>();
        while(n != 0){
            li.add(n % 3);
            n /= 3;

        }

        for(int i=0; i<li.size(); i++){
            answer += li.get(i) * Math.pow(3, li.size()-i-1);
            // System.out.println(answer);
        }
        return answer;
    }
}
