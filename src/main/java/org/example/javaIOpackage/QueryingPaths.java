package org.example.javaIOpackage;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 8/3/2024
 */
public class QueryingPaths {
    public static void main(String[] args) {
        FileSystem dfs = FileSystems.getDefault(); // The default file syst
        String nameSeparator = dfs.getSeparator(); // The name separator
        Path absPath = Path.of(nameSeparator, "a", "b", "c"); //
        System.out.printf("toString(): %s%n", absPath); //
        System.out.printf("isAbsolute(): %s%n", absPath.isAbsolute()); //
        System.out.printf("getFileSystem(): %s%n",
                absPath.getFileSystem().getClass().getName()); //
        System.out.println("\n***Accessing Name Elements:"); //
        System.out.printf("getFileName(): %s%n", absPath.getFileName());
        System.out.printf("getParent(): %s%n", absPath.getParent());
        System.out.printf("getRoot(): %s%n", absPath.getRoot());
        System.out.printf("getNameCount(): %d%n", absPath.getNameCount());
        List<Path> pl = new ArrayList<>();
        absPath.forEach(p -> pl.add(p));
        System.out.printf("List of name elements: %s%n", pl);
        System.out.printf("getName(0): %s%n", absPath.getName(0));
        //System.out.printf("subpath(0,2): %s%n", absPath.subpath(0,2));
        System.out.println("\n***Path Prefix and Suffix:"); //
        System.out.printf("startsWith(\"%s\"): %s%n",
                nameSeparator + "a",
                absPath.startsWith(nameSeparator + "a"));
        System.out.printf("endsWith(\"b/c\"): %s%n",
                absPath.endsWith("b/c"));
    }
}
