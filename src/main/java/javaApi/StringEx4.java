package javaApi;

import java.util.Scanner;

public class StringEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호 입력(-포함) > ");
        String idNum = scan.next();

        if (idNum.length() == 14) {
            System.out.println("주민번호 자리수가 맞습니다");
        }else {
            System.out.println("잘못입력");
        }
    }
}
