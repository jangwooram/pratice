package javaThread;

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("쓰레드 A");
            }else {
                Thread.yield();
            }

        }
        System.out.println("작업종료A");
    }
}
