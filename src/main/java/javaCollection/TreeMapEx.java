package javaCollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();

        score.put(60,"홍길동");
        score.put(90,"손흥민");
        score.put(85,"호날두");
        score.put(79,"김메시");
        score.put(72,"박루니");

        Map.Entry<Integer, String> highScore = score.lastEntry();
        System.out.println("최고점수 : "+ highScore.getKey() + " 이름은  " + highScore.getValue());

        Map.Entry<Integer, String> lowScore = score.firstEntry();
        System.out.println("최고점수 : "+ lowScore.getKey() + " 이름은  " + lowScore.getValue());

        Map.Entry<Integer, String> lowerEntry = score.lowerEntry(85);
        System.out.println("85점 아래 점수 : " + lowerEntry.getKey() + " 이름은 " + lowerEntry.getValue());

        Map.Entry<Integer, String> higherEntry = score.higherEntry(85);
        System.out.println("85점 위에 점수 : " + higherEntry.getKey() + " 이름은 " + higherEntry.getValue());

        Map.Entry<Integer, String> floorEntry = score.floorEntry(88);
        System.out.println("88점 이거나 아래 점수 : " + floorEntry.getKey() + " 이름은 " + floorEntry.getValue());

        Map.Entry<Integer, String> ceilingEntry = score.ceilingEntry(88);
        System.out.println("88점 이거나 위에 점수 : " + ceilingEntry.getKey() + " 이름은 " + ceilingEntry.getValue());

        while (!score.isEmpty()) {
            Map.Entry<Integer, String> low = score.pollFirstEntry();
            System.out.println(low.getKey() + "-> " + low.getValue() + "남은 객채수 = " + score.size());
        }
    }
}
