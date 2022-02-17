package javaThread;

public class ThreadBB extends Thread{

    Work work;

    public ThreadBB(Work work) {
        this.work=work;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            work.methodB();
        }
    }
}
