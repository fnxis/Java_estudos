package estudos.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {
        LocalDate d01=LocalDate.parse("2025-02-22");
        LocalDateTime d02=LocalDateTime.parse("2025-02-22T12:34:56");
        Instant d03=Instant.parse("2025-02-22T12:34:56Z");

        LocalDate pastWeekd01=d01.minusDays(7);
        LocalDate nextweekd01=d01.plusDays(7);

        System.out.println(nextweekd01);
        System.out.println(pastWeekd01);

        LocalDateTime pastWeekTimed01=d02.minusDays(7);
        LocalDateTime nextweekTimed01=d02.plusDays(7);

        System.out.println("---------------------------------");

        System.out.println(pastWeekTimed01);
        System.out.println(nextweekTimed01);

        System.out.println("---------------------------------");

        Instant pastWeekInstant=d03.minus(7, ChronoUnit.DAYS);
        Instant nextweekInstant=d03.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextweekInstant);
        System.out.println("---------------------------------");

        Duration t1=Duration.between(pastWeekTimed01,d02);

        System.out.println(t1.toDays());

        Duration t2=Duration.between(pastWeekd01.atStartOfDay(),d01.atStartOfDay());
        Duration t3=Duration.between(pastWeekInstant,d03);
        Duration t4=Duration.between(d03,pastWeekInstant);

        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());

    }
}
