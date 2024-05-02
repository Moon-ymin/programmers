package coding_test.level1;

import java.util.*;

// 에라토스테네스의 체
/* 소수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12921 */
class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;
        for(int i=2; i*i <= n; i++) {
            if(isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(isPrime[i]) answer++;
        }
        return answer;
    }
}

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30; // 주어진 범위 내의 숫자 (예: 30 이내의 모든 소수)
        boolean[] isPrime = new boolean[n + 1]; // 각 숫자가 소수인지 아닌지를 나타내는 배열

        // 배열을 초기화하여 모든 숫자를 소수로 가정합니다.
        Arrays.fill(isPrime, true);fnf

        // 0과 1은 소수가 아니므로 false로 설정합니다.
        isPrime[0] = isPrime[1] = false;

        // 2부터 시작하여 숫자의 제곱근까지 반복합니다.
        for (int i = 2; i * i <= n; i++) {
            // i가 소수라면 i의 배수들을 소수가 아닌 것으로 표시합니다.
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 찾은 모든 소수를 출력합니다.
        System.out.println("소수:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}



