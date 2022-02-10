package interFace;

public class VehicleEx1 {
    public static void main(String[] args) {
        Bus vehicle = new Bus();
        Bus bus = vehicle;
        vehicle.run();
        vehicle.check();
    }
}
