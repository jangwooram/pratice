package javaThread;

public class WorkPublicEx {
    public static void main(String[] args) {
        Work work = new Work();
        ThreadAA ta =new ThreadAA(work);
        ThreadBB tb= new ThreadBB(work);
        ta.start();
        tb.start();
    }
}
