package coding_test.level1;

// .repeat() : 문자열 반복 메서드
/* 수박수박수박수? : https://school.programmers.co.kr/learn/courses/30/lessons/12922 */
class Solution {
    public String solution(int n) {
        int all = n / 2;
        int plus = n % 2;
        String answer = "수박".repeat(all);
        answer += (plus == 1 ? "수" : "");

        return answer;
    }
}
