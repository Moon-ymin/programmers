package coding_test.level1;

// 핸드폰 번호 가리기 : https://school.programmers.co.kr/learn/courses/30/lessons/12948
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i<phone_number.length(); i++){
            if ( i >= phone_number.length() - 4 ) answer += String.valueOf(phone_number.charAt(i));
            else answer += "*";
        }
        return answer;
    }
}
