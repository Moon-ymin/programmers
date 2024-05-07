package coding_test.level1;
// 성격 유형 검사하기 : https://school.programmers.co.kr/learn/courses/30/lessons/118666
import java.util.*;
class Solution {
    HashMap<String, Integer> scores = new HashMap<>();

    public void putKey(String key, Integer value){
        scores.put(key, scores.get(key) + value);
    }
    public String solution(String[] survey, int[] choices) {
        String[] score = {"R", "T", "C", "F", "J", "M", "A", "N"};
        for(String s : score){
            scores.put(s, 0);
        }
        // 점수 매기기
        for(int i=0; i<choices.length; i++) {
            if(choices[i] <= 3) {
                putKey(String.valueOf(survey[i].charAt(0)), 4-choices[i]);
            } else if (choices[i] == 4){ continue;
            } else {
                putKey(String.valueOf(survey[i].charAt(1)), choices[i] - 4);
            }
        }

        // 출력문 만들기
        String answer = "";
        answer += (scores.get("R") != scores.get("T") ? (scores.get("R") > scores.get("T") ? "R" : "T") : "R");
        answer += (scores.get("C") != scores.get("F") ? (scores.get("C") > scores.get("F") ? "C" : "F") : "C");
        answer += (scores.get("J") != scores.get("M") ? (scores.get("J") > scores.get("M") ? "J" : "M") : "J");
        answer += (scores.get("A") != scores.get("N") ? (scores.get("A") > scores.get("N") ? "A" : "N") : "A");
        return answer;
    }
}
