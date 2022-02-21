package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {

        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(12345,"홍길동"),95);
        map.put(new Student(12345,"홍길동"),95);
        map.put(new Student(12346,"손흥민"),88);
        map.put(new Student(12321,"박지성"),90);

        System.out.println(map.size());

    }
}
