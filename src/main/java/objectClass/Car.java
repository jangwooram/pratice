package objectClass;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxspeed;

    public Car() {
        this("아반떼","흰색",200);  // 파라메터가 없으면 디폴트 값을 this 메소드에 저장해서 뿌린다.
    }

    public Car(String model) {
        this(model,"흰색",200); // model만 파라메터로 받고 나머진 디폴트 값을 뿌림
    }
    public Car(String model, String color) {
        this(model,color,200);
    }
    public Car(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
        System.out.println("....");
    }
}
