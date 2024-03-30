package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Terrance Nyamfukudza
 * 25/3/2024
 */
public class DateParsingClass {
    public static void main(String[] args) throws ParseException {

        String date = "04-Nov-1979";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Date date1 = dateFormat.parse(date);
        System.out.println(date1);
    }
}
