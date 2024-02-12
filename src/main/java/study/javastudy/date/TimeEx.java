package study.javastudy.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeEx {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2012, Month.APRIL, 12);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(17, 18);
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.parse("10:12:21");
        System.out.println(localTime2);

        LocalDate theDate = localDateTime.toLocalDate();
        System.out.println(theDate);
        Month month = localDateTime.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());
    }
}
