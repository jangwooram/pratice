package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;
        startTime = System.nanoTime();
        String str;
        for (int i=0; i<10000; i++) {
            str = String.valueOf(i);
            list1.add(0,str);
        }
        endTime = System.nanoTime();
        System.out.println("array time  = "+ (endTime-startTime));



        for (int i=0; i<10000; i++) {
            str = String.valueOf(i);
            list2.add(0,str);
        }
        endTime = System.nanoTime();
        System.out.println("linked time = "+ (endTime-startTime));
    }
}
