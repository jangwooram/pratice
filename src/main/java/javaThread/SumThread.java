package javaThread;

public class SumThread extends Thread{

    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i=1; i<=100000; i++) {
            sum+=i;
        }
    }
}
