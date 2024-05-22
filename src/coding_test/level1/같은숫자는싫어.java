package coding_test.level1;/* 같은 숫자는 싫어 : https://school.programmers.co.kr/learn/courses/30/lessons/12906 */
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        int origin = arr[0];
        answer.push(origin);
        
        for (int i=1; i<arr.length; i++) {
            answer.push(arr[i]);
            if (origin == arr[i]) answer.pop(); // 제거 
            else origin = arr[i]; continue;
        }
            
        
        int[] arranswer = answer.stream().mapToInt(Integer::intValue).toArray();

        return arranswer;
    }
}

// 다른 풀이

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
