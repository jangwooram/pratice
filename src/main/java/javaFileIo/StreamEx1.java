package javaFileIo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        /*List<Integer> arrList = new ArrayList<>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(50);


        List<Integer> list = Arrays.asList(10,20,30,40,50);
        */

        List<String> list2 = Arrays.asList("손흥민","박케인","김날두");/*
        for (String name : list) {
            System.out.println(name);
        }*/
        Iterator<String> iter = list2.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Stream<String> st = list2.stream();
        st.forEach(System.out::println);


    }
}
