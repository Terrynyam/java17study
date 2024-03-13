package org.example.javaIOpackage;

import java.io.File;
import java.nio.file.Path;

/**
 * @author Terrance Nyamfukudza
 * 8/3/2024
 */
public class JavaFileLegacyClass {
    public static void main(String[] args) {
        File file = new File(File.separator + "a" +
                File.separator + "b" +
                File.separator + "c"); // /a/b/c
        System.out.println(file);
// File --> Path, using the java.io.File.toPath() instance method
        Path fileToPath = file.toPath(); // /a/b/c
        System.out.println(fileToPath);
// Path --> File, using the java.nio.file.Path.toFile() default method.
        File pathToFile = fileToPath.toFile(); // /a/b/c
        System.out.println(pathToFile);
    }
}
