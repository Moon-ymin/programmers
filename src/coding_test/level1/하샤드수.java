package coding_test.level1;


// 하샤드 수 : https://school.programmers.co.kr/learn/courses/30/lessons/12947
class Solution {
    public boolean solution(int x) {

        int total = 0;
        String[] arr = String.valueOf(x).split("");
        for(String a : arr) {
            total += (int) (a.charAt(0) - '0');
        }
        System.out.println(total);
        boolean answer = (x % total == 0) ? true : false ;

        return answer;
    }
}
