package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class ExpCalendar {

    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();

        c.set(Calendar.MONTH,11);
        c.set(Calendar.YEAR,1976);
        c.set(Calendar.DAY_OF_MONTH,27);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.HOUR,0);

        System.out.println(c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM",new Locale("uk"));
        System.out.println(df.format(c.getTime()));
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,new Locale("uk")));

    }

}
