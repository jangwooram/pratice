package javaApi;

import java.util.Locale;

public class StringEx7 {
    public static void main(String[] args) {
        /*String origin = "Java Programing";
        String lower = origin.toLowerCase(Locale.ROOT); // 소문자로 바꿔줌
        System.out.println(lower);

        String upper = origin.toUpperCase(Locale.ROOT); // 대문자로 바꿔줌
        System.out.println(upper);*/

        String str1 = "Java Programing";
        String str2 = "JAVA Programing";
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("same");
        }else {
            System.out.println("diff");
        }
    }
}
