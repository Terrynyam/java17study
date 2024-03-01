package org.example.concurrency;

import java.util.List;
import java.util.concurrent.*;

import static java.util.stream.Collectors.toList;

/**
 * @author Terrance Nyamfukudza
 * 29/2/2024
 */
public class TaskExecutionClass {
    public static void main(String[] args) {
        // Runnable:
        Runnable printDiceValue = () ->
                System.out.println("Execution of Runnable: "
                        + ThreadLocalRandom.current().nextInt(1,7));
// Callable<V>:
        Callable<Integer> diceRoll =
                () -> ThreadLocalRandom.current().nextInt(1,7);
// Executor service:
        ExecutorService exs = Executors.newFixedThreadPool(3);
        try {
// Executing Runnable in a thread:
            Future<?> rfuture = exs.submit(printDiceValue);
            Object result = rfuture.get();
            System.out.println("Result of Runnable: " + result);
// Executing Callable<V> in a thread:

            Future<Integer> cfuture = exs.submit(diceRoll);
            Integer diceValue = cfuture.get();
            System.out.println("Result of Callable: " + diceValue);
// Executing bulk tasks:
        List<Callable<Integer>> callables
                = List.of(diceRoll, diceRoll, diceRoll);
        List<Future<Integer>> allFutures = exs.invokeAll(callables);
                List<Integer> resultList = allFutures.stream()
                        .map(future -> {
                            try {
                                return future.get();
                            } catch(InterruptedException | ExecutionException ie){
                            throw new IllegalStateException(ie);
                        }
    }).toList();
System.out.println("Result of invokeAll(): " + resultList);
    Integer anyResult = exs.invokeAny(callables);
System.out.println("Result of invokeAny(): " + anyResult);
} catch(InterruptedException | ExecutionException ie) {
        ie.printStackTrace();
        } finally {
        exs.shutdown();
        }
        }
}
