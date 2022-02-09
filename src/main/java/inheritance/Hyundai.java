package inheritance;

public class Hyundai {
    /*Tire frontRight = new Tire("앞오른쪽",6);
    Tire frontleft = new Tire("앞왼쪽",2);
    Tire backRight = new Tire("뒤오른쪽", 3);
    Tire backLeft = new Tire("뒤왼쪽",5);
*/
    Tire[] tires = {new Tire("앞오른쪽",6), new Tire("앞왼쪽",2),
            new Tire("뒤오른쪽", 3), new Tire("뒤왼쪽",5)};

    int run() {
        System.out.println("자동차가 달립니다.");
        for (int i = 0; i < tires.length; i ++){
            if (!tires[i].roll()) {
                stop();
                return i+1;
            }
        }
        /*
        if (!frontRight.roll()) {
            stop();
            return 1;  // 숫자는 타이어 번호를 반환한다.
        }
        if (!frontleft.roll()) {
            stop();
            return 2;  // 숫자는 타이어 번호를 반환한다.
        }
        if (!backRight.roll()) {
            stop();
            return 3;  // 숫자는 타이어 번호를 반환한다.
        }
        if (!backLeft.roll()) {
            stop();
            return 4;  // 숫자는 타이어 번호를 반환한다.
        }*/
        return 0;

    }

    void stop() {
        System.out.println("자동차가 멈춥니다");
    }
}
