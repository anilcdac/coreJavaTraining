package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        //mm/dd/yyyy HH:MM:SS
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String formatted_date = sdf.format(d);
        System.out.println("formatted_date: "+formatted_date);

        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        String formatted_date2 = sd.format(d);
        System.out.println("formatted_date2: "+formatted_date2);



    }
}
