package coding_test.level1;
// 없는 숫자 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/86051
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> num = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        // numbers 배열의 숫자들을 num 리스트에서 제거
        for (int n : numbers) {
            num.remove(Integer.valueOf(n)); // 리스트에서 숫자 n을 제거
        }

        // num 리스트에 남은 숫자들의 합을 구함
        int answer = 0;
        for (int n : num) {
            answer += n;
        }

        return answer;
    }
}
