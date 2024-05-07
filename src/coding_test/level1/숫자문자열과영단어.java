package coding_test.level1;

import java.util.*;
// 숫자 문자열과 영단어 : https://school.programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}

