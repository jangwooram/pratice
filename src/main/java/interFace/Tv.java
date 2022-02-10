package interFace;


public class Tv implements RemoteCtrl{
    //field
    private int vol;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVol(int vol) {
        if (vol > MAX_VOLUMN) {
            this.vol = MAX_VOLUMN;
        }else if(vol < MIN_VOLUMN) {
            this.vol = MIN_VOLUMN;
        }else {
            this.vol =vol;
        }
        System.out.println("현재 볼륨은 " + this.vol);
    }
}
