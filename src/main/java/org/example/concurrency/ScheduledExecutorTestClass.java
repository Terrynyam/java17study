package org.example.concurrency;

import java.util.concurrent.*;

/**
 * @author Terrance Nyamfukudza
 * 29/2/2024
 */
public class ScheduledExecutorTestClass {
    public static void main(String[] args) {
        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES);
    }
}
