package coding_test.level1;

// 비밀지도 : https://school.programmers.co.kr/learn/courses/30/lessons/17681
// Integer.toBinaryString(int 타입 변수) : 2진수 변환

// 내가 한 풀이
class Solution1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str = "";

        for(int i=0; i<n; i++) {
            String a1 = Integer.toBinaryString(arr1[i]);    // 이진수 변환
            String a2 = Integer.toBinaryString(arr2[i]);

            int[] ar1 = toBinInt(a1, n);    // 이진수 담긴 길이 n의 정수형 배열
            int[] ar2 = toBinInt(a2, n);

            for(int k=0; k<n; k++){
                if (ar1[k] == 1 || ar2[k] == 1) str += "#";
                else str += " ";
            }
            answer[i] = str;
            str = "";
        }

        return answer;
    }
    public int[] toBinInt(String s, int n){
        String sum = "";

        if (s.length() < n) {
            int plus = n - s.length();
            for(int i=0; i<plus; i++) sum += "0";
        }
        s = sum + s;

        String[] a = s.split("");
        int[] last = new int[n];
        for(int i=0; i<s.length(); i++){
            last[i] = a[i].charAt(0) - '0';
        }

        return last;
    }
}

// 다른 사람 풀이
class Solution2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
