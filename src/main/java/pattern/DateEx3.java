package pattern;

import java.time.LocalDate;

public class DateEx3 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalDate dday = data.plusYears(100);
        System.out.println(dday);
    }
}
