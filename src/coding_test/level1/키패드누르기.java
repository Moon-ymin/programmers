package coding_test.level1;
// 키패드 누르기 : https://school.programmers.co.kr/learn/courses/30/lessons/67256
class Solution {
    int[][] key = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -2} };  // * : -1, # : -2
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String s = "";
        int[][] lp = {{3, 0}}, rp = {{3,2}};


        for(Integer number:numbers){
            switch (number){
                case 1, 4, 7 -> s = "L";
                case 3, 6, 9 -> s = "R";
                default -> s = distance(lp, rp, hand, where(number));
            }
            answer += s;
            if (s.equals("L")) lp = where(number);
            else rp = where(number);
        }

        return answer;
    }
    public int[][] where(int number){
        int[][] position = {{-1, -1}};
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[i].length; j++) {
                if (number == key[i][j]) { position[0][0] = i;position[0][1] = j; break;}
            }
            if (position[0][0] != -1 && position[0][1] != -1) {
                break;
            }
        }
        return position;
    };
    public String distance(int[][] lp, int[][] rp, String hand, int[][] p){
        String LorR = "";
        int left = Math.abs(lp[0][0] - p[0][0]) + Math.abs(lp[0][1] - p[0][1]);
        int right = Math.abs(rp[0][0] - p[0][0]) + Math.abs(rp[0][1] - p[0][1]);
        if (left < right)  LorR = "L";
        else if (right < left) LorR = "R";
        else LorR = hand.equals("right") ? "R" : "L";
        return LorR;
    };
}