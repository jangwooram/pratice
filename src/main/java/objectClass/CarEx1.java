package objectClass;

public class CarEx1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("회사 = " + car1.company);
        System.out.println("---------");

        Car car2 = new Car("아반떼");
        System.out.println("회사 = " + car2.company);
        System.out.println("모델 = " + car2.model);
        System.out.println("---------");

        Car car3 = new Car("그랜저", "흰색");
        System.out.println("회사 = " + car3.company);
        System.out.println("모델 = " + car3.model);
        System.out.println("색상 = " + car3.color);
        System.out.println("---------");

        Car car4 = new Car("제네시스","흰색",200);
        System.out.println("회사 = " + car4.company);
        System.out.println("모델 = " + car4.model);
        System.out.println("색상 = " + car4.color);
        System.out.println("속도 = " + car4.maxspeed);
        System.out.println("---------");
    }
}
