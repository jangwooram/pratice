package inheritance;

public class DriveEx {
    public static void main(String[] args) {
        Driver ch = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        ch.driver(bus);
        ch.driver(taxi);
    }
}
