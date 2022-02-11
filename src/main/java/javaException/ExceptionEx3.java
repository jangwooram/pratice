package javaException;

public class ExceptionEx3 {
    public static void main(String[] args) {
        String num1 = "3246";
        String num2 = "321";
        try {
            int no1 = Integer.parseInt(num1);
            System.out.println("받은 숫자 " + no1);
            int no2 = Integer.parseInt(num2);
            System.out.println("받은 숫자 " + no2);
            System.out.println("두 숫자 합 " +(no1+no2));
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환 못함!");
        }finally {
            System.out.println("이상!");  // 에러가 나던 말던 항상 수행함
        }
    }
}
