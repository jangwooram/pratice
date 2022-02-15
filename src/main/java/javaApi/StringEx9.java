package javaApi;

import java.util.StringTokenizer;

public class StringEx9 {
    public static void main(String[] args) {
        String text = "홍길동,김철수,이영희,박찬호,이동국";
        StringTokenizer st = new StringTokenizer(text,",");
        int count = st.countTokens();

        for (int i =0; i< count; i++) {
            String name=st.nextToken();
            System.out.println(name);
        }
    }
}
