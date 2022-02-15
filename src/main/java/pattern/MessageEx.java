package pattern;

import java.text.MessageFormat;

public class MessageEx {
    public static void main(String[] args) {

        Object[] qwe ={"honggil","홍길동","010-9999-8888"};
        String asd = "아이디는 {0} \n 이름은{1} \n 전화번호는{2}";

        String ms = MessageFormat.format(asd,qwe);
        System.out.println(ms);
    }
}
