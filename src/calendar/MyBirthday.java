package calendar;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyBirthday {

    public static void main(String[] args) {

        SimpleDateFormat f = new SimpleDateFormat("dd MMM yyyy");
        GregorianCalendar gc = new GregorianCalendar(1976,11,27, 0, 53, 0);
        Date d = new Date(gc.getTimeInMillis());
        System.out.println(f.format(d));
    }
}
