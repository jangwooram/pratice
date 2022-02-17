package javaThread;

public class CalcEx1 {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(); //객체 생성
        User1 user1 = new User1(); // 쓰레드 객체 생성
        user1.setCalc(calc1);
        user1.start();

        User2 user2 = new User2(); // 쓰레드 객체 생성
        user2.setCalc(calc1);
        user2.start();

    }
}
