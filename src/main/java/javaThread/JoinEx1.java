package javaThread;

public class JoinEx1 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        }catch (InterruptedException e) {

        }
        System.out.println("1부터 100까지 합 " + sumThread.getSum());
    }
}
