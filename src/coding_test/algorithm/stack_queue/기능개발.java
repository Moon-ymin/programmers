package coding_test.algorithm.stack_queue;
import java.util.*;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int need = (100-progresses[0]) % speeds[0] == 0 ? (100-progresses[0]) / speeds[0] : (100-progresses[0]) / speeds[0] + 1;
        int cnt = 1;
        for (int i = 1; i < progresses.length; i++) {
            int next = (100-progresses[i]) % speeds[i] == 0 ? (100-progresses[i]) / speeds[i] : (100-progresses[i]) / speeds[i] + 1;

            if ( need >= next) {
                cnt++;
                if (i == progresses.length-1) answer.add(cnt);
            } else {
                answer.add(cnt);
                need = next;
                cnt = 1;
                if (i == progresses.length-1) answer.add(cnt);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
