package exercise;

public class Cheomsungdae {
    private static Cheomsungdae cheom = new Cheomsungdae();

    public static void info() {
        System.out.println(" ? ");
    }

    public static Cheomsungdae getInstance() {
        return cheom;
    }
}
