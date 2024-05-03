package coding_test.level1;

/* 콜라츠 추측 : https://school.programmers.co.kr/learn/courses/30/lessons/12943

테스트 케이스 중 num = 626331 에서는 계속 오류 뜸 => int 형말고 long 형으로 바꿨을 때 됐음!
int형 변수는 -2,147,483,648부터 2,147,483,647까지의 정수 값을 저장할 수 있는데
아마 테스트케이스 중에 연산을 하다보면 int형 변수의 저장범위를 초과해서 오버플로우가 발생해서 그런 것 같네요
 */
class Solution {
    public long solution(long num) {
        long answer = 0;

        while(num != 1 && answer <= 500){
            if (num % 2 == 0) { num /= 2; answer++; }
            else { num = num * 3 + 1; answer++; }
        }
        if (answer > 500) answer = -1;

        return answer;
    }
}
