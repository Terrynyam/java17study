package org.example.javaIOpackage;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author Terrance Nyamfukudza
 * 8/3/2024
 */
public class PathObjects {
    public static void main(String[] args) {

        FileSystem dfs = FileSystems.getDefault(); // Obtain the default file system
        String nameSeparator = dfs.getSeparator(); // The name separator for a path
        System.out.println(nameSeparator);
        Path absPath1 = Path.of("/a/b/c"); // (1) /a/b/c
        System.out.println(absPath1);
        Path absPath2 = Path.of(nameSeparator + "a" + // (2) /a/b/c
                nameSeparator + "b" +
                nameSeparator + "c");
        System.out.println(absPath2);
        Path absPath3 = Path.of(nameSeparator, "a", "b", "c"); // (3) /a/b/c
        System.out.println(absPath3);// \\a\b\c
        System.out.println(absPath1.equals(absPath2) &&
                absPath2.equals(absPath3)); //false

        //        \
        // \a\b\c
        // \a\b\c
        // \\a\b\c
        //      false
        Path absPath4 = Path.of("C:\\a\\b\\c");
        System.out.println(absPath4);// C:\a\b\c
        Path absPath5 = Path.of("C:", "a", "b", "c");
        System.out.println(absPath5); //C:\a\b\c

        Path relPath1 = Path.of("c", "d");
        System.out.println(relPath1); // c\d

        String pathOfCurrDir = System.getProperty("user.dir"); // (1)
        System.out.println(pathOfCurrDir);//C:\Users\terrancen\projects\services\java
        Path currDir = Path.of(pathOfCurrDir); // (2)
        System.out.println(currDir);//C:\Users\terrancen\projects\services\java
        Path relPath = Path.of(pathOfCurrDir, "d");
        System.out.println(relPath);//C:\Users\terrancen\projects\services\java\d
    }
}
