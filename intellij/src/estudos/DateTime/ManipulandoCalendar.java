package estudos.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoCalendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d=Date.from(Instant.parse("2007-02-22T13:42:00Z"));
        System.out.println(sdf.format(d));

        Calendar cal=Calendar.getInstance();

        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        d=cal.getTime();
        int minutes=cal.get(Calendar.MINUTE);
        int month=cal.get(Calendar.MONTH);

        System.out.println(minutes);
        System.out.println(month+1);
        System.out.println(sdf.format(d));
    }
}
