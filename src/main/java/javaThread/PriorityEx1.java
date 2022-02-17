package javaThread;

public class PriorityEx1 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            Thread thread1 = new CalThread("몰라"+i);
            if (i==10) {
                thread1.setPriority(Thread.MAX_PRIORITY);
            }else {
                thread1.setPriority(Thread.MIN_PRIORITY);
            }
            thread1.start();
        }

    }
}
