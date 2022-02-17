package javaThread;

public class User2 extends Thread{
    private Calculator calc;

    public Calculator getCalc() {
        return calc;
    }

    public void setCalc(Calculator calc) {
        this.setName("user2");
        this.calc = calc;
    }

    @Override
    public void run() {
        calc.setMemory(50);
    }
}
