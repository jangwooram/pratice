package objectClass;

public class Calculator {
    // 전원on
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    // 더하기
    /*int add(int x, int y) {
        int result = x+y;
        return result;
    }*/
    /*int add(int[] value) {
        int sum =0;
        for (int i : value) {
            sum += i;
        }
        return sum;
    }*/
    int add(int ... value) {   // ... 은 자동으로 배열로 만들어줌, 매개변수가 몇개인지 모르는 경우 사용
        int sum =0;
        for (int i : value) {
            sum += i;
        }
        return sum;
    }
    // 빼기
    int subtract(int x, int y) {
        int result = x-y;
        return result;
    }
    // 곱하기
    int multi(int x, int y) {
        int result = x*y;
        return result;
    }
    // 나누기
    double divide(int x, int y) {
        double result = (double)(x/y);
        return result;
    }
    // 전원off
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
