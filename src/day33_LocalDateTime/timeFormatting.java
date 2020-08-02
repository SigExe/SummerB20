package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, MMM/dd/yyyy");

        LocalDate ld = LocalDate.of(2020, 7, 26);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019, 5, 20, 16, 30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));

        LocalDateTime rNow = LocalDateTime.now();
        DateTimeFormatter goy = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        System.out.println(rNow.format(goy));

    }

}
