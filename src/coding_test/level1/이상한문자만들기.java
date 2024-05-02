package coding_test.level1;

// 이상한 문자 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12930
class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] words = s.split(""); // 단어별로 자르더라도

        for(String word : words) {
            cnt = word.contains(" ") ? 0 : cnt+1; // 공백 기준 (어차피 다음 단어 나오려면 무조건 공백 있어야 하니까)으로 홀/짝 나누는 기준을 0으로 리셋 시킨거임
            answer += cnt%2 == 0 ? word.toLowerCase() : word.toUpperCase(); // 공백도 대소문자 구분 변환 없이 더해짐
        }
        return answer;
    }
}
