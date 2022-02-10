package interFace;

public interface RemoteCtrl {

    //상수
    public int MAX_VOLUMN = 10;
    public int MIN_VOLUMN = 0;



    //메소드
    void turnOn();
    void turnOff();
    void setVol(int vol);

    //디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("음소거");
            setVol(MIN_VOLUMN);
        } else {
            System.out.println("음소거 해제");
        }
    }

    //정적(static) 메소드
    static void changeBatt() {
        System.out.println("건전지를 교환합니다.");
    }
}
