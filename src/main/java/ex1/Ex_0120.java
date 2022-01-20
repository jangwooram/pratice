package ex1;

import java.util.Scanner;

/**
 * 정수
 * byte - 1byte (정수 127까지 1byte -128 ~ 127)
 * Short - 2byte
 * Int - 4byte
 * long - 8byte
 * <p>
 * 실수
 * float - 4byte
 * double - 8byte
 * <p>
 * 큰 크기 타입 = 작은 크기 타입 -> 자동적으로 타입이 변환됨
 * <p>
 * float as = 2.5F;
 * // 실수는 기본적으로 doble 타입이라 float은 뒤에 f를 넣어야함
 * <p>
 * int num1 = 20;
 * byte num2 = (byte) num1;
 * 강제타입변환(캐스팅)
 * <p>
 * <p>
 * double = int 값을 넣어됨, 그런데 정수 뒤에 .0이 붙음
 */
public class Ex_0120 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

//        quiz();
//        quiz2();
        quiz3();
    }

    /*public static void quiz() {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력해주세>> ");
        int money = scan.nextInt();

        int manWon = money/10000;
        int oChunWon = (money%10000)/5000;
        int chunWon = (money%5000)/1000;
        int oBaekWon = (money%1000)/500;
        int baekWon = (money%500)/100;
        int sipWon = (money%100)/10;

        System.out.println("만원 " + manWon + "장");
        System.out.println("오천원 " + oChunWon + "장");
        System.out.println("천원 " + chunWon + "장");
        System.out.println("오백원 " + oBaekWon + "개");
        System.out.println("백원 " + baekWon + "개");
        System.out.println("십원 " + sipWon + "개");
        //만원, 오천원, 천원, 오백원, 백원, 십원
    }*/

    public static void quiz2() {

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("구입한 수량을 입력해주세요");
        int amount = scan.nextInt();
        System.out.println("가격을 입력해주세요");
        int price = scan.nextInt();
        String memo = "(정상가)";

        if(amount>=10 && price >999) {
            price = (int) (price * 0.8);
            memo = "(할인가)";
        }
        System.out.println("판매금액" + amount*price + memo);
        */
        System.out.println("점수 입력해주세요");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();


            while (score >= 0) {
                if (score > 90) {
                    System.out.println("A등급입니다.");
                    break;
                }
                if (89 > score && score >= 80) {
                    System.out.println("B등급입니다.");
                    break;
                }
                if (79 > score && score >= 70) {
                    System.out.println("C등급입니다.");
                    break;
                }
                if (69 > score && score >= 60) {
                    System.out.println("D등급입니다.");
                    break;
                }
                if (score < 60) {
                    System.out.println("F등급니다.");
                } else {
                    System.out.println("점수를 제대로 입력해주세요");
                }
                break;
            }
    }

    public static void quiz3() {
        System.out.println("키를 입력해주세요");
        int tall = scan.nextInt();
        System.out.println("몸무게를 입력해주세요");
        int weight = scan.nextInt();

        double nomarl = (tall - 100) * 0.9;

        if(nomarl + 5 >= weight && nomarl - 5 >= weight) {
            System.out.println("정상 체중입니다.");
        } else if (nomarl - 5 > weight) {
            System.out.println("마른 체중입니다,");
        } else {
            System.out.println("비만입니다.");
        }
    }
}
