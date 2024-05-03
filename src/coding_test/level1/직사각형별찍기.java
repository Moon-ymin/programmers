package coding_test.level1;

import java.util.Scanner;
// 직사각형 별찍기 : https://school.programmers.co.kr/learn/courses/30/lessons/12969
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = "";

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                answer+="*";
            }
            answer += "\n";
        }

        System.out.println(answer);
    }
}
