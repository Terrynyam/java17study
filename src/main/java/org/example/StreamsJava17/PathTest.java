package org.example.StreamsJava17;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Terrance Nyamfukudza
 * 15/3/2024
 */
public class PathTest {

    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");
    public static String getData(){
        String data = p1.getName(0).toString();

        return data;     }
    public static void main(String[] args) {
        System.out.println(getData());
        System.out.println(p1.getRoot());
    }
}
