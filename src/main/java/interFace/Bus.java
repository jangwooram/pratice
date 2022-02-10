package interFace;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void check() {
        System.out.println("승차 요금을 체크");
    }
}
