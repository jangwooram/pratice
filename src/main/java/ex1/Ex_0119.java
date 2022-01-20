package ex1;

import java.util.Scanner;

public class Ex_0119 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("구입한 물건 개수를 입력해주세요");
            int amount = scan.nextInt();
            int price = 1000;

            if(amount>=10) {
                price = 800;
            }
        System.out.println(amount*price + "원 입니다.");
    }
}
