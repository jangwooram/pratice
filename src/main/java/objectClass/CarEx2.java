package objectClass;

public class CarEx2 {
    public static void main(String[] args) {
        Car ch = new Car();
        printCar(ch);

        Car gd = new Car("제네시스");
        printCar(gd);
    }

    static void printCar(Car obj) {
        System.out.println("회사 = " + obj.company);
        System.out.println("모델 = " + obj.model);
        System.out.println("색상 = " + obj.color);
        System.out.println("속도 = " + obj.maxspeed);
        System.out.println("------------");
    }
}
