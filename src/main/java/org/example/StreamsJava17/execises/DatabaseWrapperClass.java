package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 30/3/2024
 */
public class DatabaseWrapperClass {
    static String url = "jdbc://derby://localhost:1527//mydb";
    static DatabaseWrapperClass getDatabase()
    {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[] args) {
        System.out.println( getDatabase().url );
    }
}
