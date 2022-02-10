package interFace;

public class DriverEx {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();
        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(truck);
    }
}
