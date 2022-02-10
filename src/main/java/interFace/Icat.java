package interFace;

public class Icat implements Ianimal{
    @Override
    public void eat() {
        System.out.println("생선을 좋아합니다");
    }

    @Override
    public void sleep() {
        System.out.println("게속 잠");
    }
}
