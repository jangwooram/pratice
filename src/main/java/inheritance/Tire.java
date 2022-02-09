package inheritance;

public class Tire {
    public int maxRotation;  // 회전수
    public int accumulatedRotation;  // 누적 회전수
    public String location; // 타이어 위치

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        accumulatedRotation++;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "의 타이어 수명이" + (maxRotation - accumulatedRotation) + "회 만큼 남았습니다.");
            return true;
        } else {
            System.out.println(location + "수명이 다 됐습니다.");
            return false;
        }
    }
}
