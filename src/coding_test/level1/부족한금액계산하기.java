package coding_test.level1;
// 부족한 금액 계산하기 : https://school.programmers.co.kr/learn/courses/30/lessons/82612
class Solution {
    public long solution(int price, int money, int count) {

        long need = 0; // need도 long 으로 해야 함!!!
        for(int i=1; i<=count; i++){
            need += i*price;
        }
        long answer = need <= money ? 0 : need - money;

        return answer;
    }
}
