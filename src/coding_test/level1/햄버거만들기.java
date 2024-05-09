package coding_test.level1;

// 햄버거 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/133502

/*
처음에 시도했던 String으로 만들어서 비교하기는 시간 초과가 계속됐다
객체로 만들어서 진행하니까 해결됐음

첫 번째 코드에서는 문자열을 반복해서 처리하고 패턴을 찾기 위해 contains()와 replaceFirst() 메서드를 사용했습니다.
이런 방식은 문자열을 반복해서 검색하고 변경하기 때문에 문자열이 길어질수록 시간이 지남에 따라 처리 속도가 점차 느려지는 문제가 있었습니다.
따라서 이러한 방식으로는 주어진 제한시간 내에 처리할 수 없었던 것입니다.
 */
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ingredient.length; i++) {
            sb.append(ingredient[i]);

            if(sb.length()>3) {
                if(sb.charAt(sb.length()-1) == '1' &&       // 가장 마지막 재료 빵 and
                        sb.charAt(sb.length()-2) == '3' &&       // 그 앞 재료 고기 and
                        sb.charAt(sb.length()-3) == '2' &&       // 그 앞 재료 야채 and
                        sb.charAt(sb.length()-4) == '1') {       // 그 앞 재료 빵이면
                    answer++;

                    sb = new StringBuilder(sb.substring(0, sb.length()-4));
                    // 마지막 4개 재료 삭제 -> 이거해야 스택처럼 됨
                }
            }
        }
        return answer;
    }
}
