package org.example.javaIOpackage;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDate;

/**
 * @author Terrance Nyamfukudza
 * 7/3/2024
 */
public class ReadersAndWritersClass {
    public static void main(String[] args) throws IOException {
        // UTF-8 character encoding.
        Charset utf8 = Charset.forName("UTF-8");

        try (// Create a BufferedWriter that uses UTF-8 character enc
             FileWriter writer = new FileWriter("info.txt", utf8);
             BufferedWriter bufferedWriter1 = new BufferedWriter(writer);
             PrintWriter printWriter = new PrintWriter(bufferedWriter1);) {
            System.out.println("Writing using encoding: " + writer.getEncoding());
            printWriter.println(LocalDate.now());
            printWriter.println(Integer.MAX_VALUE);
            printWriter.println(Long.MIN_VALUE);
            printWriter.println(Math.PI);
        }

        try (// Create a BufferedReader that uses UTF-8 character enc
             FileReader reader = new FileReader("info.txt", utf8);
             BufferedReader bufferedReader = new BufferedReader(reader);) {
            System.out.println("Reading using encoding: " + reader.getEncoding());
// Read the character input and parse accordingly.
            LocalDate ld = LocalDate.parse(bufferedReader.readLine());
            int iMax = Integer.parseInt(bufferedReader.readLine());
            long lMin = Long.parseLong(bufferedReader.readLine());
            double pi = Double.parseDouble(bufferedReader.readLine());
// Write the values read on the terminal
            System.out.println("Values read:");
            System.out.println(ld);
            System.out.println(iMax);
            System.out.println(lMin);
            System.out.println(pi);
// Check for end of stream:
            String line = bufferedReader.readLine();
            if (line != null) {
                System.out.println("More input: " + line);
            } else {
                System.out.println("End of input stream");
            }


        }
    }
}
