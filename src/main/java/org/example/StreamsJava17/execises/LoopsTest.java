package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class LoopsTest {
    public static void main(String[] args) {
        var counter = 0;
        outer:
        for (var i = 0; i < 3; i++) {
            middle:
            for (var j = 0; j < 3; j++) {
                inner:
                for (var k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
