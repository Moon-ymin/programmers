package coding_test.level1;
import java.util.*;
// 두 개 뽑아서 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/68644

// 내 풀이 : 나는 그냥 반복문 겹쳐서 할 생각만했는데, Set 하면 중복 없이 값을 추가할 수 있었다
class Solution11 {
    public int[] solution(int[] numbers) {
        List<Integer> li = new ArrayList<>();
        boolean isExist = false;

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int num = numbers[i] + numbers[j];
                for(Integer k : li){
                    if (num == k) isExist = true;
                }
                if (!isExist) li.add(num);
                isExist = false;
            }
        }
        int[] answer = li.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }
}

// 다른 풀이 : TreeSet 이용, Set 은 중복이 없고, 값을 추가할 때마다 자동으로 오름차순 정렬을 수행해서 이게 좋음
class Solution12 {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> tr = new TreeSet<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                tr.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = tr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

/*
첫 번째 코드는 ArrayList 를 사용하고 중복된 값을 검사한 후 중복되지 않은 값을 추가하고, 마지막에 정렬 수행
두 번째 코드는 TreeSet 을 사용하여 중복된 값을 자동으로 제거하고 정렬된 상태로 값을 유지

- 시간 복잡도
첫 번째 코드 : 중첩된 루프를 사용하여 모든 숫자 쌍의 합을 계산하고, 중복된 값을 검사한 후에 ArrayList에 값을 추가.
            마지막에 정렬을 수행
            O(n^2 * log n) + O(n * log n)
두 번째 코드 : 중첩된 루프를 사용하여 모든 숫자 쌍의 합을 계산하고 TreeSet에 값을 추가
            TreeSet 은 요소를 추가할 때마다 정렬 및 중복 제거를 수행
            O(n^2 * log n)

- 공간 복잡도
첫 번째 코드 : ArrayList 에 중복되지 않은 값만 추가하므로, 추가되는 값의 개수만큼 공간이 필요
            O(n^2)
두 번째 코드 : TreeSet 에 중복되지 않은 값만 추가하므로, 추가되는 값의 개수만큼의 공간이 필요
            O(n^2)

☞ 따라서 두 코드의 시간 복잡도와 공간 복잡도는 동일합니다.
  그러나 두 번째 코드는 TreeSet 을 사용하여 중복을 제거하고 정렬된 상태를 유지하기 때문에 코드가 간결하고 가독성이 좋다
  반면에 첫 번째 코드는 중복을 검사하고 중복된 값을 추가한 후에 정렬을 수행하기 때문에 더 복잡
  따라서 두 번째 코드가 더 효율적
 */
