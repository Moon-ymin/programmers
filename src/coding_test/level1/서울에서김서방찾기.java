package coding_test.level1;

/*서울에서 김서방 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12919*/
class Solution {
    public String solution(String[] seoul) {

        int index = 0;
        for(int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")) index = i;
        }

        String answer = String.format("김서방은 %s에 있다",index);

        return answer;
    }
}
