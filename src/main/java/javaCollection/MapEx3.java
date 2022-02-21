package javaCollection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<>();
        map.put("hong","1234");
        map.put("jong","1234");
        map.put("kong","1234");
        map.put("gong","1234");
        map.put("rong","1234");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("아이디를 입력 > ");
            String id = scan.next();

            System.out.print("비밀번호 입력 > ");
            String pw = scan.next();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pw)){
                    System.out.println("로그인 되었습니다.");
                    break;

                }else {
                    System.out.println("비밀번호가 틀립니다.");
                }

            }else {
                System.out.println("아이디가 존재하지 않습니다.");
            }
        }
    }
}
