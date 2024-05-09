package coding_test.level1;

import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> x = new HashMap<>();
        Map<String, Integer> y = new HashMap<>();

        List<String> list = new ArrayList<>();

        for(String key: X.split("")){
            x.put(key, x.getOrDefault(key,0)+1);
        }
        for(String key: Y.split("")){
            y.put(key, y.getOrDefault(key,0)+1);
        }
        for(String key: x.keySet()) {
            if (!y.containsKey(key)) continue;

            int length = Math.min(x.get(key), y.get(key));
            for(int i=0; i<length; i++) {
                list.add(key);
            }
        }

        String answer = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        if(answer.isEmpty()) return "-1";
        if(answer.replaceAll("0", "").isEmpty()) return "0";

        return answer;
    }
}
