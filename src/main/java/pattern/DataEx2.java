package pattern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022,07,04);
        System.out.println(date2);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime tt = LocalDateTime.now();
        System.out.println(tt);
    }
}
