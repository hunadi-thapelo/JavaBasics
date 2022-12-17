package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

    public static void main(String[] args)
    {
      Calendar cal= Calendar.getInstance();
        SimpleDateFormat sDate = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
      System.out.println(sDate.format(cal.getTime()));
      //Calendar class is almost the same as Date object - but Calendar has more functions/methods
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.MINUTE));

    }
}
