package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 17/2/2024
 */
public class ConcurrencyClass {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello")).start();
        System.out.println("Terry");
        new Thread(() -> System.out.println("Hello")).start();
    }
}
