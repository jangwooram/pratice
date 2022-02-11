package exercise2;

public class CarEx {
    public static void main(String[] args) {
        Car mycar = new Car();

        Car.Tire tire = mycar.new Tire();
        tire.method1();

        Car.Engine engine = new Car.Engine();
        engine.method2();
    }
}
