package coding_test.algorithm.hash;

import java.util.HashMap;
import java.util.Iterator;

public class 의상 {
    public static int solution(String[][] clothes) {

        // 1. HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0)+1);
            // .getOrDefault(key, value) : key 의 value 값 가져오거나 없으면 0
        }

        // 2. 입지 않을 경우를 추가해 모든 조합 계산하기
        Iterator<Integer> iterator = map.values().iterator();
        // iterator : 컨테이너, 특히 리스트를 순회할 수 있게 해주는 객체
        int answer = 1;

        while(iterator.hasNext()){
            answer *= iterator.next().intValue() + 1;
        }

        // 3. 아무 종류의 옷도 입지 않은 경우는 제외하기
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
}
