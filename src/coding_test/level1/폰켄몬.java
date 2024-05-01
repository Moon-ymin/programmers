package coding_test.level1;/* 폰켄몬 : https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java */


import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> numbers = new HashSet<>();
        for(Integer num : nums) {
            numbers.add(num);
        }
        if ( numbers.size() > nums.length / 2) {
            answer = nums.length/2;
        } else {
            answer = numbers.size();
        }
        return answer;
    }
}

// 중복 없이 최대한 많이 담기 위해 HashSet 자료구조 이용
// HashSet<Integer> numbers = new HashSet<>();
