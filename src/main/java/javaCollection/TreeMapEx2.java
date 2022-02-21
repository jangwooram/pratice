package javaCollection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();

        score.put(60,"홍길동");
        score.put(90,"손흥민");
        score.put(85,"호날두");
        score.put(79,"김메시");
        score.put(72,"박루니");

        NavigableMap<Integer, String> descMap = score.descendingMap();
        Set<Map.Entry<Integer,String>> descSet = descMap.entrySet(); //set으로 키와 값을 묶어줌
        for (Map.Entry<Integer, String> entry : descSet) {
            System.out.println(entry.getKey() + "점수 / 이름 = " + entry.getValue() );
        }
        System.out.println("=============");
        NavigableMap<Integer, String> descMap2 = descMap.descendingMap();//한번 더 정렬해서 오름차순으로
        Set<Map.Entry<Integer,String>> descSet2 = descMap2.entrySet();
        for (Map.Entry<Integer, String> entry : descSet2) {
            System.out.println(entry.getKey() + "점수 / 이름 = " + entry.getValue() );
        }
    }
}
