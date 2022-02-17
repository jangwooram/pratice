package javaThread;

import java.awt.*;

public class ThreadEx1 {
    public static void main(String[] args) {
        Runnable beep = new BeepTask();
        Thread thread = new Thread(beep);
        thread.start();

        for (int i=1; i<=5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
