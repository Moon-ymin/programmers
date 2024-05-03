package coding_test.level1;

// 최대 공약수와 최소 공배수 : https://school.programmers.co.kr/learn/courses/30/lessons/12940
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 0, b = 0;    // 최대공약수 a, 최소 공배수 b
        int min = Math.min(n, m);
        int max = Math.max(n,m);

        int j = 1;
        for(int i=min; i>0; i--){       // 최대공약수 찾기
            if (n % i == 0 & m % i == 0)  {a = i; break;}
        }
        while(true){        // 최소공배수 찾기
            if ( max * j % n == 0 & max * j % m == 0) { b = max * j; break; }
            else j++;
        }


        answer[0] = a; answer[1] = b;
        return answer;
    }
}
