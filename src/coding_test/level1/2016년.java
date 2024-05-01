package coding_test.level1;

/* 2016년 : https://school.programmers.co.kr/learn/courses/30/lessons/12901 */
class Solution {
    public String solution(int a, int b) {
        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"}; // 1월 1일이 금요일
        int day = 0;
        
        // 1, 3, 5, 7, 8, 10, 12 | 31일
        // 2 | 29일
        // 4, 6, 9, 11 | 30일
        
        for(int i = 1; i < a; i++){
            Integer result = switch (i) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> 0;    // 나는 i가 1~12인걸 알지만, 얘는 모르기 때문에 default 문 처리해주기
            };
            day += result;
        }
        day += b;
        day %= 7;
        String answer = days[day];
        
        
        return answer;
    }
}

// 조건문 if로 하지말고, switch에 case 여러개로 하면 좋음
