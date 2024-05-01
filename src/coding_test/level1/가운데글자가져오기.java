package coding_test.level1;

/* 가운데 글자 가져오기 :  https://school.programmers.co.kr/learn/courses/30/lessons/12903 */
class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
            answer = String.valueOf(s.charAt(s.length()/2-1)) + String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        
        return answer;
    }
}
