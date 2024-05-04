package coding_test.level1;

// 카카오 블라인드 테스트
// 다트 게임 : https://school.programmers.co.kr/learn/courses/30/lessons/17682
class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int currentIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                currentIdx++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[currentIdx] = 10;
                    i++; // '10'의 경우 두 글자를 하나의 기호로 처리
                } else {
                    scores[currentIdx] = c - '0';
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') {
                    scores[currentIdx] *= scores[currentIdx];
                } else if (c == 'T') {
                    scores[currentIdx] *= scores[currentIdx] * scores[currentIdx];
                }
            } else if (c == '*') {
                scores[currentIdx] *= 2;
                if (currentIdx > 0) {
                    scores[currentIdx - 1] *= 2;
                }
            } else if (c == '#') {
                scores[currentIdx] *= -1;
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}

