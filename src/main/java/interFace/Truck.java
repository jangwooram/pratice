package interFace;

public class Truck implements Vehicle{

    @Override
    public void run() {
        System.out.println("트럭이 달립니다.");
    }

    public void loadTruck() {
        System.out.println("트럭에 물건 적재합니다.");
    }
}
