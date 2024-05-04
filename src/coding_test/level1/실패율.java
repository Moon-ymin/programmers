package coding_test.level1;

// 실패율 : https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> scores = new HashMap<>();

        for (int i = 1; i <= N ; i++) {
            double cnt = 0;
            double total = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) total++;
                if (stages[j] == i) cnt++;
            }
            scores.put(i, cnt == 0 ? 0 : cnt / total);
        }

        // 해시맵의 키들을 ArrayList에 복사
        List<Integer> list = new ArrayList<>(scores.keySet());
        // list 를 주어진 비교자(comparator)에 따라 정렬
        Collections.sort(list, (o1, o2) -> Double.compare(scores.get(o2),
                scores.get(o1)));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
