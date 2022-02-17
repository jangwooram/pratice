package javaThread;
//공유 작업 클래스
public class Work {

    public synchronized void methodA() {
        System.out.println("ThreadAA가 메소드A 작업을함");
        notify();  //다른 쓰레드를 실행준비 상태로 만듦
        try {
            wait(); // 내 쓰레드를 정지 상태로 만듦
        } catch (InterruptedException e) {

        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadBB가 메소드B 작업을함");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}
