package coding_test.level1;

import java.util.HashMap;
import java.util.Iterator;

// 완주하지 못한 선수 : https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 해시 이용 (Key, Value) 형태의 HashMap 형태

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for( String player : participant) {
            map.put(player, map.getOrDefault(player,0) + 1);
        }
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey(); break;
            }
        }
        return answer;
    }
}