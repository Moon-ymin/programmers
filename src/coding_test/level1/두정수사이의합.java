package coding_test.level1;

/* 두 정수 사이의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/12912 */
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        
        for(int i=min; i<=max;i++){
            answer += i;
        }
        return answer;
    }
}
