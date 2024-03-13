package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 17/2/2024
 */
public class ConcurrencyTest {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };
        // the of these threads is unknown
//        System.out.println("begin");
//        new Thread(printInventory).start();
//        new Thread(printRecords).start();
//        new Thread(printInventory).start();
//        System.out.println("end");

        //----------------------------------------------------
        //the sequence when the run() method is followed as each thread is waited tpo stop
        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");
    }
}
