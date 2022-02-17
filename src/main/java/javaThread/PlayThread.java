package javaThread;

public class PlayThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("노래 재생중");
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
