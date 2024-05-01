package coding_test.level1;/* 문자열 다루기 기본 : https://school.programmers.co.kr/learn/courses/30/lessons/12918 */
// 문자열의 char 타입을 접근해야하면 그냥 char 형 배열로 바꾸는게 편함


class Solution {
    public boolean solution(String s) {
        int sLen = s.length();
        if (sLen == 4 || sLen == 6) {
            for(char c: s.toCharArray()) {
                if (c <'0' || c > '9') {
                    return false;
                }
            }
            return true;
        
        }
        
        return false;
    }
}
