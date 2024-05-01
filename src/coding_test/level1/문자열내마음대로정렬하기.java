package coding_test.level1;/* 문자열 내 마음대로 정렬하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12915 */

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            if (c1 == c2) {
                return s1.compareTo(s2); // 인덱스 n의 문자가 같을 경우 사전순으로 정렬
            } else {
                return c1 - c2; // 인덱스 n의 문자를 기준으로 오름차순 정렬
            }
        });
        return strings;
    }
}
