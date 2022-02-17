package pattern;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Split {
    public static void main(String[] args) {
        String str ="아이디,이름,패스워드";
        String asd[] = str.split(",");

        for (String i : asd) {
            System.out.println(i);
        }
        for (String token:asd) {
            System.out.println(token);
        }

        StringTokenizer st = new StringTokenizer(str,",");
        int count = st.countTokens();

        for (int i=0; i<count; i++) {
            String name = st.nextToken();
            System.out.println(name);
        }
    }
}
