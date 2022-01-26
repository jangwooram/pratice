package exercise;

import java.util.Scanner;

public class Ex_0125 {
    public static void main(String[] args) {
        quiz8();
    }

    public static void quiz1() {
        int lengTop = 5;
        int lengBot = 10;
        int height = 7;

        double area = (double)(lengTop+lengBot)*height/2;
        System.out.println(area);
    }
    public static void quiz2() {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1/num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("0으로 나누면 안됩니다.");
        }
    }
    public static void quiz3() {
        double num1 = 5.0;
        double num2 = 2.0;
        double z = num1%num2;

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else {
            double result = z+ 10;
            System.out.println(result);
        }
    }
    public static void quiz4() {
        int sum = 0;

        for(int i = 1; i<=100; i++){
            if(i%3==0) {
                sum+=i;
            }
        }
        System.out.println(sum);

    }
    public static void quiz5() {
        int num1 =0;
        int num2 =0;

        while (true) {
            num1 = (int) ((Math.random()*6) +1);
            num2 = (int) ((Math.random()*6) +1);
            System.out.println(num1 +","+num2 );
            if(num1+num2==5){
                break;
            }
        }
    }
    public static void quiz6() {


        for (int i =1; i <=10; i++) {
            for(int j = 1; j <= 10; j++) {
                int x = i*4;
                int y = j*5;
                if(x+y==60) {
                    System.out.println(i+","+j);
                }
            }
        }

    }
    public static void quiz7() {
        for (int i = 1; i<= 5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        for (int i =1; i <=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i =5; i >=1; i--) {
            for (int j=5; j>=i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--){
            for (int j =5; j>=i; j--){
                System.out.print(j);
            }System.out.println(" ");
        }

    }
    public static void quiz8() {
        Scanner scan = new Scanner(System.in);
        int balance =0;
        boolean run = true;
        while (run) {
            System.out.println("=============================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("=============================");
            System.out.print("선택 >>");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("예금 금액을 입력하세요");
                    balance = balance + scan.nextInt();
                    break;

                case 2:
                    System.out.println("출금 금액을 입력하세요");
                    balance = balance - scan.nextInt();
                    break;

                case 3:
                    System.out.println("잔고는" + balance);
                    break;

                case 4:
                    run = false;
                    break;

                default:
                    System.out.println("선택 오류");
                    break;
            }
           /*if(choice == 1) {
                System.out.println("예금 금액을 입력하세요");
                balance = blance + scan.nextInt();
                System.out.println("예금> "+balance);
            }
            else if(choice == 2) {
                System.out.println("출금 금액을 입력하세요");
                int chul = scan.nextInt();
                balance = balance-chul;
                System.out.println("출금> "+chul);
            }
            else if(choice == 3) {
                System.out.println("잔고 > "+balance);
            }
            else  {
                System.out.println("프로그램 종료");
                break;
            }*/
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
