package javaFileIo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(new Student("김아공",85),
                new Student("송야동",69), new Student("이도박",36));

        Stream<Student> stream = list.stream();
        stream.forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println("이름 = " + name + " / 점수 = " + score);
        });
    }
}
