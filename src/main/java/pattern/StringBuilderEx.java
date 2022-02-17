package pattern;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        for (int i =1; i<=100; i++) {
            str.append(i);
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        for (int i =1; i<=100; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
