package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Warmup {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime time1 = LocalDateTime.of(2020, 7, 26, 10, 28);
        System.out.println(time1.format(dtf));

    }


}
