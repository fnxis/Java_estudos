package estudos.DateTime;

import java.time.*;

public class GlobalParaLocal {
    public static void main(String[] args) {
        LocalDate dt1=LocalDate.parse("2025-10-06");
        LocalDateTime dt2=LocalDateTime.parse("2025-10-06T01:30:24");
        Instant dt3=Instant.parse("2025-10-06T01:30:24Z");

        LocalDate lc = LocalDate.ofInstant(dt3, ZoneId.systemDefault());
        LocalDate lc2 = LocalDate.ofInstant(dt3, ZoneId.of("Portugal"));
        LocalDateTime lc3 = LocalDateTime.ofInstant(dt3, ZoneId.systemDefault());
        LocalDateTime lc4 = LocalDateTime.ofInstant(dt3, ZoneId.of("Portugal"));



        System.out.println(lc);
        System.out.println(lc2);
        System.out.println(lc3);
        System.out.println(lc4);

        System.out.println("dt1 dia = "+ dt1.getDayOfMonth());
        System.out.println("dt1 mes = "+ dt1.getMonthValue());
        System.out.println("dt1 ano = "+ dt1.getYear());

        System.out.println("dt2 hora = "+ dt2.getHour());
        System.out.println("dt2 minutos = "+ dt2.getMinute());

    }
}
