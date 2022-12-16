package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat customDate = new SimpleDateFormat("M/dd/yyyy"); //customise my own date format
        SimpleDateFormat customDateTime = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println(d); //2022: toString method to convert date object into readable text found redundant
        System.out.println(customDate.format(d));
        System.out.println(customDateTime.format(d));


    }
}
