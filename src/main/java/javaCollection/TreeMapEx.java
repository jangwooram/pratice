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

        Map.Entry<Integer, String> lowerEntry = score.lowerEntry(90);
        System.out.println("90점 아래 점수 : " + lowerEntry.getKey() + " 이름은 " + lowerEntry.getValue());
    }
}
