package org.example.concurrency.coderace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Terrance Nyamfukudza
 * 1/3/2024
 */
public class ThreadSafetyTest {
    private int sheepCount = 0;
     private void incrementAndReport() {
        System.out.print((++sheepCount)+" ");
        }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            ThreadSafetyTest manager = new ThreadSafetyTest();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
            } finally {
            service.shutdown();
            }
    }
}
