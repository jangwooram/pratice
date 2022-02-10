package interFace;

public class Audio implements RemoteCtrl{
    private int vol;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) {
            System.out.println("오디오 음소거합니다.");
            this.vol = MIN_VOLUMN;
        } else {
            System.out.println("음소거 해제");
            this.vol = vol;
        }
    }

    @Override
    public void setVol(int vol) {
        if (vol > RemoteCtrl.MAX_VOLUMN) {
            this.vol = MAX_VOLUMN;
        }else if(vol < RemoteCtrl.MIN_VOLUMN) {
            this.vol = MIN_VOLUMN;
        }else {
            this.vol =vol;
        }
        System.out.println("현재 볼륨은 " + this.vol);
    }

}
