package javaThread;

public class ThreadJobA extends Thread{

    public ThreadJobA() {
        setName("아몰라");
    }

    @Override
    public void run() {
        System.out.println(".........");
    }
}
