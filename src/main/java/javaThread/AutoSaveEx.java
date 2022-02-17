package javaThread;
//daemon 쓰레드
public class AutoSaveEx {
    public static void main(String[] args) {
        AutoSaveThread autoThread =new AutoSaveThread();

        autoThread.setDaemon(true);
        autoThread.start();
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {

        }
        System.out.println("메인 쓰레드 종료");
    }
}
