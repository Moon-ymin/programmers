package coding_test.level1;

// 최소 직사각형 : https://school.programmers.co.kr/learn/courses/30/lessons/86491
class Solution {
    public int solution(int[][] sizes) {
        for (int i=0; i<sizes.length; i++){
            if (sizes[i][0] < sizes[i][1]){
                int swap = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = swap;
            }
        }
        int maxgaro = 0, maxsero = 0;
        for(int i=0; i<sizes.length; i++){
            if (maxgaro < sizes[i][0]) maxgaro = sizes[i][0];
            if (maxsero < sizes[i][1]) maxsero = sizes[i][1];
        }
        return maxgaro * maxsero;
    }
}
