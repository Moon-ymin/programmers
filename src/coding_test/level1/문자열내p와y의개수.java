package coding_test.level1;/* 문자열 내 p와 y의 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/12916 */

class Solution {
    boolean solution(String s) {
        int cnty = 0;
        int cntp = 0;
        
        for(int i=0; i<s.length(); i++){
            if ( s.charAt(i) == 'y' || s.charAt(i) == 'Y' ) cnty++;
            else if (s.charAt(i) == 'p' || s.charAt(i) == 'P') cntp++;
        }
        boolean answer = (cnty == cntp ? true : false);

        return answer;
    }
}
