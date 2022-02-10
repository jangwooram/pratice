package interFace;

public class Driver {

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            vehicle.run();
            ((Bus) vehicle).check();
        } else if (vehicle instanceof Truck) {
            vehicle.run();
            ((Truck) vehicle).loadTruck();
        }
    }
}
