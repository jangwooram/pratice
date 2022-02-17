package javaThread;

public class PlayThread2Ex {
    public static void main(String[] args) {
        Thread thread = new PlayThread2();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();
    }
}
