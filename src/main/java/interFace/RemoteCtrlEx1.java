package interFace;

public class RemoteCtrlEx1 {
    public static void main(String[] args) {
/*
        Tv samsung = new Tv();

        samsung.turnOn();
        samsung.setVol(8);
        samsung.turnOff();
        samsung.setMute(true);


        RemoteCtrl rc = new Tv();
        rc.turnOn();
        rc.turnOff();*/
        RemoteCtrl.changeBatt();
        RemoteCtrl rc;
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
        SmartTv smart = new SmartTv();
        smart.search("네이버");
    }

}
