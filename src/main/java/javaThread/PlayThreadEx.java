package javaThread;

public class PlayThreadEx {
    public static void main(String[] args) {
        PlayThread mp = new PlayThread();

        mp.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        mp.setStop(true);
    }
}
