// 푸드 파이트 대회 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
class Solution {
    public String solution(int[] food) {
        String first = "";
        
        for(int i = 1; i<food.length; i++){
            int count = food[i] / 2;
            for(int j=0; j<count; j++){
                first += String.valueOf(i);
            }            
        }
        StringBuilder str = new StringBuilder(first).reverse();
        String second = str.toString();
        first = first + "0" + second;
        return first;
    }
}
