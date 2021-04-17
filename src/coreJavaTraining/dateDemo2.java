package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        cal.getTime();
        System.out.println("calendar formatted_date: "+sd.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.AM_PM));




//        Date d = new Date();
//        System.out.println(d.toString());
//
//        //mm/dd/yyyy HH:MM:SS
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//        String formatted_date = sdf.format(d);
//        System.out.println("formatted_date: "+formatted_date);

//        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
//        String formatted_date2 = sd.format(d);
//        System.out.println("formatted_date2: "+formatted_date2);



    }
}
