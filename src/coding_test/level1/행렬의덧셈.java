package coding_test.level1;

// 행렬의 덧셈 : https://school.programmers.co.kr/learn/courses/30/lessons/12950
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 2차원 행렬의 크기 : 행 matrix.length | 열 : matrix[0].length
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i =0 ; i<arr1.length; i++) {
            for(int j=0 ; j< arr1[0].length; j++) {
                answer[i][j] += arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
