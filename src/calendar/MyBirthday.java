package calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyBirthday {

    public static void main(String[] args) throws Exception{

//        SimpleDateFormat f = new SimpleDateFormat("dd MMM yyyy");
//        GregorianCalendar gc = new GregorianCalendar(1976,11,27, 0, 53, 0);
//        Date d = new Date(gc.getTimeInMillis());
//        System.out.println(f.format(d));
//
        Date today = new Date();
//        System.out.println(today);
//
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.US);

        System.out.println(sdf.format(today));

        Date date = sdf.parse("25 Oct 2000");
        System.out.println(date);

//        try {
//            Date date = sdf.parse("27 Oct 2000");
//            System.out.println(date.toString());
//        }catch (ParseException e){
//            e.getStackTrace();
//        }




    }
}
