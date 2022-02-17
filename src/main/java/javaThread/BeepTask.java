package javaThread;

import java.awt.*;

public class BeepTask implements Runnable{

    @Override
    public void run() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        for (int i=1; i<=5; i++) {
            tk.beep();
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
