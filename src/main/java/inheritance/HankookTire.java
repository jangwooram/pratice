package inheritance;

public class HankookTire extends Tire{

    public HankookTire(String location, int maxLocation) {
        super(location, maxLocation);
    }

    @Override
    public boolean roll() {
        accumulatedRotation++;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "의 한국타이어 수명이" + (maxRotation - accumulatedRotation) + "회 만큼 남았습니다.");
            return true;
        } else {
            System.out.println(location + "수명이 다 됐습니다.");
            return false;
        }
    }
}
