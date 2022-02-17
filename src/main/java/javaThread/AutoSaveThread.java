package javaThread;

public class AutoSaveThread extends Thread{

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }

    public void talk() {
        System.out.println("저장완료");
    }

    public void save() {
        talk();
        System.out.println("문서가 저장됨");
    }
}
