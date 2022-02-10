package interFace;

public class Chimpanzee implements AniLang{

    @Override
    public void group() {
        System.out.println("침팬치는 무리를 지어 생활합니다.");
    }

    @Override
    public void eat() {
        System.out.println("과일을 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("집에서 잡니다.");
    }

    @Override
    public void talk() {
        System.out.println("우끼끼끼끽");
    }
}
