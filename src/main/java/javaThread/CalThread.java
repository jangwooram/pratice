package javaThread;

public class CalThread extends Thread{
    public CalThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i=0; i<1000000000; i++) {

        }
        System.out.println("작업완료 " + getName());
    }
}
