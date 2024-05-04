package coding_test.level1;

import java.util.Stack;
// 크레인 인형뽑기 게임 : https://school.programmers.co.kr/learn/courses/30/lessons/64061
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int j = 0; j<moves.length; j++){
            // 인형 꺼내기
            int doll = 0;
            for(int i=0; i<board.length; i++){
                if (board[i][moves[j]-1] != 0) {doll = board[i][moves[j]-1]; board[i][moves[j]-1] = 0; break;}
            }
            if (doll != 0) {    // 꺼내지는 인형 있으면
                if (basket.size() >= 1) {
                    int old = basket.peek();
                    if (doll == old) {
                        basket.pop();
                        answer+=2;
                    } else {
                        basket.push(doll);
                    }
                } else {
                    basket.push(doll);
                }
            }
        }

        return answer;
    }


}
