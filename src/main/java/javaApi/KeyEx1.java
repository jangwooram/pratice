package javaApi;

import java.util.HashMap;

public class KeyEx1 {
    public static void main(String[] args) {
        HashMap<Key, String> hmap = new HashMap<Key, String>();

        hmap.put(new Key(5), "홍길동");

        String value = hmap.get(new Key(5));

        System.out.println(value);
    }
}
