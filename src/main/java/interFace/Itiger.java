package interFace;

public class Itiger extends Animal implements Ianimal{

    @Override
    void move() {
        System.out.println("네발로 걸어다님");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹음");
    }

    @Override
    public void sleep() {

    }
}
