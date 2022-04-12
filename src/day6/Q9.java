package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q9 {
    public static void main(String[] args) {

        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Newyork un saat dilimine gore saat ?

        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime zdtLocal=ZonedDateTime.now();


        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd,MM,yyyy  HH:mm");
        System.out.println(zdtLocal.format(format));
        System.out.println(zdt.format(format));
    }
}
