package pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysEx4 {
    public static void main(String[] args) {
        Integer[] scores = {80,78,90,63,88};
        Arrays.sort(scores,Collections.reverseOrder());

        Scanner scan = new Scanner(System.in);
        System.out.println("점수입력");
        int score = scan.nextInt();
        int index = Arrays.binarySearch(scores, score);

        System.out.println((scores.length - index-1) + "등입니다.");

        /*
        String[] names = {"박찬호","홍길동","김철수","이영희","서수남"};
        Arrays.sort(names);*/
        //int index= Arrays.binarySearch(names, "박찬호");

        //System.out.println(index);
    }
}
