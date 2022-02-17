package javaThread;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("쓰레드 B");
            }else {
                Thread.yield();
            }

        }
        System.out.println("작업종료B");
    }
}
