package exercise;

public class Cheomsungdae {
    private static Cheomsungdae cheom = new Cheomsungdae();

    private Cheomsungdae() {

    }

    public static void info() {
        System.out.println("  ");
    }

    public static Cheomsungdae getInstance() {
        return cheom;
    }
}
