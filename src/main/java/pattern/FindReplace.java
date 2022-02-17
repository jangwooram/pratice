package pattern;

public class FindReplace {
    public static void main(String[] args) {
        String str = "모든 프로그램은 자바 언어로 개발될 수 있다";

        int index = str.indexOf("자바");
        if (index == -1) {
            System.out.println("포함 되어 있지 않습니다.");
        } else {
            System.out.println("자바 문자가 포함되어 있습니다.");
            str = str.replace("자바","JAVA");
            System.out.println("->" + str);
        }

    }
}
