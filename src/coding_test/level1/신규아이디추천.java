package coding_test.level1;

// 신규 아이디 추천 : https://school.programmers.co.kr/learn/courses/30/lessons/72410
class Solution {
    public String solution(String new_id) {

        String answer = new_id.toLowerCase(); // 1. 소문자 변경
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2. 소문자, 숫자, -, _, . 제외 모두 제거
        answer = answer.replaceAll("[.]{2,}","."); // 3. .. -> .
        answer = answer.replaceAll("^[.]|[.]$", "");// 4. 처음이나 끝의 .는 제거 "^[.]|[.]$", ""
        if( answer.length() == 0) answer += "a"; // 5. 빈 문자열이면 a 대입
        if(answer.length() >= 16) {
            answer = answer.substring(0,15); // 6. 길이 >= 16 15자리까지만
            answer = answer.replaceAll("[.]$","");
        }
        // 7. 길이 <= 2 마지막 문자를 길이가 3이 될때까지 반복해서 붙임
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length()-1); // 자바에서는 -1로 끝 인덱스 표현 불가
        }
        return answer;
    }
}
