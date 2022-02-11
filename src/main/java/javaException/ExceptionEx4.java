package javaException;

public class ExceptionEx4 {
    public static void main(String[] args) {
        String str1 = "cds100";
        String str2 = "0c";
       try {
           int num1  = Integer.parseInt(str1);
           int num2  = Integer.parseInt(str2);

           System.out.println("나누기 값 " + num1/num2);
       }/*catch (NumberFormatException e) {
           System.out.println("변환 불가");
       }*/catch (ArithmeticException e) {
           System.out.println("0 입력불가");
       }catch (Exception e) {
           System.out.println("에러 코드를 문의 하세요 [에러코드 - " +e.getMessage() + "]"); //쓰지말것
       }

    }
}
