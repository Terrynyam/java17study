package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 4/4/2024
 */
public record RecordTest(int id, String name) {
    static int x = 1;
    static int y;
    void d(){};

    public static void main(String[] args) {
        RecordTest recordTest = new RecordTest(1, "test");
        System.out.println(recordTest);
    }
}
