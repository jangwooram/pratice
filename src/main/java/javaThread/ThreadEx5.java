package javaThread;

public class ThreadEx5 {
    public static void main(String[] args) {
        Thread thread1 = Thread.currentThread();
        System.out.println("old = "+thread1.getName());

        ThreadJobA tJobA = new ThreadJobA();
        System.out.println("new = "+ tJobA.getName());
        tJobA.start();
    }
}
