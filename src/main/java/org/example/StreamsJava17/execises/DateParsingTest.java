package org.example.StreamsJava17.execises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Terrance Nyamfukudza
 * 27/3/2024
 */
public class DateParsingTest {
    public static void main(String[] args) {
        String inputDateStr = "05-Feb-2003";
        String inputFormat = "dd-MMM-yyyy";
        String outputFormat = "dd-MM-yyyy";

        SimpleDateFormat inputFormatter = new SimpleDateFormat(inputFormat);
        SimpleDateFormat outputFormatter = new SimpleDateFormat(outputFormat);

        try {
            Date date = inputFormatter.parse(inputDateStr);
            String formattedDate = outputFormatter.format(date);
            System.out.println("Formatted date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Error occurred while parsing or formatting date: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
