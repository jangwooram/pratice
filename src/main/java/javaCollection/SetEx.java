package javaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("홍길동");
        hashSet.add("김철수");
        hashSet.add("박찬호");
        hashSet.add("이영희");
        hashSet.add("이동국");
        System.out.println(hashSet.size());

        Iterator<String> iterator = hashSet.iterator();

    }
}
