package coding_test.level1; /* 문자열 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12917 */
import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}

// 원래는 Collections.reverse()로 할라했는데, 이거는 내림차순된 순서를 유지하진 않음
// Arrays.sort()는 정렬된 상태 유지함
