package pattern;

import java.util.regex.Pattern;

public class PatternEx1 {
    public static void main(String[] args) {
        String data = "010-1234-1234";
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";

        boolean result = Pattern.matches(regExp,data);
        if (result) {
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }

        String email = "wooram@naver.com";
        String eRegExp = "\\w+@\\w+\\.\\w+(\\.w+)";
    }
}
