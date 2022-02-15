package pattern;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysEx2 {
    public static void main(String[] args) {

        int[] scores = {80,70,78,56,89,58};
        Arrays.sort(scores);
        for (int i : scores) {
            System.out.println(i);
        }
        System.out.println("------");
        String[] names = {"박찬호","홍길동","김철수","이영희","서수남"};
        Arrays.sort(names, Collections.reverseOrder());
        for (String i : names) {
            System.out.println(i);
        }
    }
}
