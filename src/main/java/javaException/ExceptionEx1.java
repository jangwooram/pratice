package javaException;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            String hello = null;
            System.out.println(hello.toString());
        }catch (NullPointerException e) {
            System.out.println("출력할 문자가 없습니다");
        }
    }
}
