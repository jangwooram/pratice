package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동",90);
        map.put("김철수",80);
        map.put("박찬호",70);
        map.put("이영희",60);
        map.put("이동국",50);

        System.out.println("자료개수 " + map.size());
        System.out.println(map.get("홍길동"));
        for (String name: map.keySet()){
            System.out.println(name);
        }

        for (Map.Entry<String, Integer> name : map.entrySet()) {  //map 향상된 for문
            System.out.println(name.getKey() + name.getValue());
        }
    }
}
