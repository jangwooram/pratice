package interFace;

public class ChimpanzeeEx {
    public static void main(String[] args) {
        Chimpanzee chimpanzee = new Chimpanzee();

        Ianimal iani = chimpanzee;
        iani.eat();
        iani.sleep();

        Language lang = chimpanzee;
        lang.talk();

        AniLang lang2 = chimpanzee;

        lang2.group();
        lang2.eat();
        lang2.sleep();
        lang2.sleep();
    }
}
