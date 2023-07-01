package CalendarDateHandling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalSelectFutureDate {

    public static void main(String[] args)
    {
        //Create Calendar instance
        //create object of Calendar class
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3); //adds 3 days to current date

        Date d = cal.getTime();
        System.out.println("Date is: " + d); //date printed is not in expected Date format

        //I used the SimpleDateFormat to achieve the date format
        //create an object to access the format method
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //format we want to work with
        String formattedDate = sdf.format(d); //returns a string - hence we create String variable

        ///printed formated date string
        System.out.println("My formated date string for (MM/dd/yyyy) is: " + formattedDate);





    }


}
