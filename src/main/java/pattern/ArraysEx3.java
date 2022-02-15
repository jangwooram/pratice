package pattern;

import java.util.Scanner;

public class ArraysEx3 {
    public static void main(String[] args) {
        int[] scores = {80,78,90,63,88};
        String[] names = {"박찬호","홍길동","김철수","이영희","서수남"};
        //int search = 90;
        Scanner scan = new Scanner(System.in);
        String search = scan.next();
        int i;
        for(i=0; i<scores.length; i++) {
            if(names[i].equals(search)){
                break;
            }
        }
        System.out.println(scores.length);
        System.out.println(i);
        if (i==scores.length){
            System.out.println("없음");
        }else {
            System.out.println(scores[i]);
        }
    }
}
