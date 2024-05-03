package coding_test.level1;

// 소수 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12977
// nCr의 조합 되는 값 자체를 찾는게 아니라, 조합에 해당하는 숫자들을 찾는 거기 때문에 for 반복문으로 숫자들 찾는게 더 나은듯
// 추가로 소수인지 여부 판단하는 메서드는 따로 만들기
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        // 3개의 숫자를 골라서 더하기
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++; // 소수인지 확인해서 더하기
                }
            }
        }
        return answer;
    }
    // 소수인지 찾기 isPrime
    public boolean isPrime(int sum){
        boolean chk = true;
        if(sum==2) { //소수일때
            return chk;

        }
        for(int i=2; i<sum; i++) { //소수가 아닐때
            if(sum%i ==0) {
                chk = false;
                break;
            }
        }
        return chk;
    }

}
