package pattern;

import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        String id = "wkddka413";
        String regExp = "^[a-zA-Z][a-zA-Z0-9]{7,13}";

        boolean isMatch = Pattern.matches(regExp,id);
        if (isMatch) {
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
    }
}
