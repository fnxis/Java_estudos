package estudos.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1=LocalDate.now();
        LocalDateTime d2=LocalDateTime.now();
        Instant d3=Instant.now();

        LocalDate d4=LocalDate.parse("2025-10-03");
        LocalDateTime d5=LocalDateTime.parse("2025-10-03T01:30:24");
        Instant d6=Instant.parse("2025-10-03T01:30:24Z");
        Instant d7=Instant.parse("2025-10-03T01:30:24-03:00");

        LocalDate d8=LocalDate.parse("03/10/2025",formatter);
        LocalDateTime d9=LocalDateTime.parse("03/10/2025 12:30",formatter2);

        LocalDate d10=LocalDate.of(2025,10,30);
        LocalDateTime d11=LocalDateTime.of(2025,10,03,1,30);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);
        System.out.println(d10);
        System.out.println(d11);
    }
}
