package coding_test.level1;

// 옹알이 (2) : https://school.programmers.co.kr/learn/courses/30/lessons/133499
// String 의 조합을 만들 생각하지말고, String 을 replace 할 생각을 하자

class Solution {
    public int solution(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(String s : babblings) {
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }

            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            // 이런식으로 " " 띄어쓴걸로 대체 해야 함
            // 다 대체하고 난 다음에 밑에 코드처럼 띄어쓰기 없애기 해야 함
            // 이렇게 안하면 반례 -> wayaoayao 이거를 띄어쓰기 안한걸로 대체해버리면
            // woo 이렇게 돼서 처리되어 버림
            s = s.replace(" ", "");

            if(s.length()  == 0) answer++;

        }
        return answer;
    }
}

