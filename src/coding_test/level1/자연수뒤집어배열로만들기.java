package coding_test.level1;

// 자연수 뒤집어 배열로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12932
class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];

        int first = 0;
        for(int i=num.length() -1; i>=0; i--) {
            answer[first] = num.charAt(i) - '0';
            first++;
        }
        return answer;
    }
}
