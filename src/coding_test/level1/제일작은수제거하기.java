package coding_test.level1;

import java.util.*;
// 제일 작은 수 제거하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12935
class Solution {
    public int[] solution(int[] arr) {

        List<Integer> after = new ArrayList<>();
        int min = arr[0];
        for(int i=0; i<arr.length; i++){    // 제일 작은 수 판별
            if( min > arr[i] ) min = arr[i];
        }
        for(int i=0; i<arr.length; i++){    // 제일 작은 수 빼고 담기
            if ( arr[i] == min ) continue;
            else after.add(arr[i]);
        }
        if(after.size() == 0) after.add(-1);    // 크기가 0이면 -1 추가

        int[] answer = after.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
