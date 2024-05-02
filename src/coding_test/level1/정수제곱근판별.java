package coding_test.level1;

// 정수 제곱근 판별 : https://school.programmers.co.kr/learn/courses/30/lessons/12934
class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = (int) Math.sqrt(n);
        if ( num * num == n ) {
            answer = (num+1)*(num+1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
