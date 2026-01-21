package estudos.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoTexto {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dt1=LocalDate.parse("2025-10-06");
        System.out.println("dtf1 = "+dt1.format(dtf));
        System.out.println("dtf1 = "+dtf.format(dt1));

        LocalDateTime dt2=LocalDateTime.parse("2025-10-06T01:30:24");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("dtf2 = "+dt2.format(dtf2));
        System.out.println("dtf2 = "+dtf2.format(dt2));
        System.out.println("dtf2 = "+dt2);

        Instant dt3=Instant.parse("2025-10-06T01:30:24Z");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("dt3 = "+dtf3.format(dt3));
    }
}
