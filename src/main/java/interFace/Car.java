package interFace;

public class Car {
    Tire[] tires = {new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};

    void run() {

        for (Tire tire : tires) {
            tire.roll();
        }


        /*frontLeft.roll();
        frontRight.roll();
        backLeft.roll();
        backRight.roll();*/
    }
}
