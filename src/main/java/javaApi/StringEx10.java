package javaApi;

public class StringEx10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("korea ");
        sb.append("fighting");
        sb.append("!!");
        System.out.println(sb);
        sb.insert(5, 'c');
        System.out.println(sb.toString());
        sb.setCharAt(4, 'p');
        System.out.println(sb);
        sb.replace(3,4,"123");
        System.out.println(sb);
        sb.delete(2,7);
        System.out.println(sb);
    }
}
