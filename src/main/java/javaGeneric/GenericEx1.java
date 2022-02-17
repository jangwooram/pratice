package javaGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {
    public static void main(String[] args) {

        List nums = new ArrayList();
        nums.add(10);
        nums.add(36);
        nums.add(20);
        nums.add(8);
        nums.add(88);
        nums.remove(3);

        for (int i =0; i<nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}
