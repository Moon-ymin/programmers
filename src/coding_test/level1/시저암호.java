package coding_test.level1;

import java.util.*;
// 시저 암호 : https://school.programmers.co.kr/learn/courses/30/lessons/12926
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] charary = s.toCharArray();

        int index = 0;

        for(int i=0; i<s.length(); i++) {
            // 대문자 소문자 공백 나눠야 함
            if ( charary[i] >= 'A' & charary[i] < 'a' ){ // 대문자일 경우
                index = ((int) charary[i] + n - 'A') % 26;
                answer += String.valueOf( (char) ('A' + index) );
            } else if (charary[i] >= 'a') {    // 소문자일 경우
                index = ((int) charary[i] + n - 'a') % 26;
                answer += String.valueOf( (char) ('a' + index) );
            } else { // 공백일 경우
                answer += " ";
            }
        }



        return answer;
    }
}
