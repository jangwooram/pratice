package interFace;

public class SmartTv implements RemoteCtrl,Searchable{

    private int vol;

    @Override
    public void turnOn() {
        System.out.println("smartTV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("smartTV를 끕니다.");
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
        System.out.println("smartTv 현재 볼륨은 " + this.vol);
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 를 검색합니다.");
    }
}
