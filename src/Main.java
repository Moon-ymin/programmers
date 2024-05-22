import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int answer = 0;

        Integer[] conv = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(conv, Collections.reverseOrder());
        score = Arrays.stream(conv).mapToInt(Integer::intValue).toArray();

        for(int i=0; i<score.length/m; i+=m){
            System.out.println(score[i]);
            answer += score[i+(m-1)] * m;
        }
    }


}