package org.example.javaIOpackage;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Terrance Nyamfukudza
 * 7/3/2024
 */
public class BufferedClass {
    public static void main(String[] args) throws IOException {
        Charset utf8 = Charset.forName("UTF-8");
        FileOutputStream outputFile = new FileOutputStream("info.txt");
        OutputStreamWriter outputSt = new OutputStreamWriter(outputFile, utf8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputSt);
        PrintWriter printWriter1 = new PrintWriter(bufferedWriter);

        FileWriter fileWriter = new FileWriter("info.txt");
        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
        PrintWriter printWriter2 = new PrintWriter(bufferedWriter2);
    }
}
