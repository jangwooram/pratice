package javaThread;

public class ThreadAA extends Thread{

    Work work;

    public ThreadAA(Work work) {
        this.work=work;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            work.methodA();
        }
    }
}
