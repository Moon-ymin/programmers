package coding_test.level1;

// x만큼 간격이 있는 n개의 숫자 : https://school.programmers.co.kr/learn/courses/30/lessons/12954
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i< n; i++){
            answer[i] = x * (i+1);
        }
        return answer;
    }
}
