package javaGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericEx2 {
    public static void main(String[] args) {
        /*List list = new ArrayList();
        list.add("adsad");
        list.add(2.343);
        list.add(213123);

        for (int i=0; i< list.size(); i++ ){
            System.out.println(list.get(i));
        }

        List list = new ArrayList();
        list.add("korea");
        list.add("weare");
        list.add("fighting");
        list.add("gold");

        String str = (String) list.get(0);

         */

        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("weare");
        list.add("fighting");
        list.add("gold");
    }
}
