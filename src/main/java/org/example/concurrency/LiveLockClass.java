package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class LiveLockClass {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Seller seller = new Seller();
        new Thread(() -> customer.makePaymentTo(seller)).start();
        new Thread(() -> seller.shipTo(customer)).start();
    }
}
 class Seller {
    private boolean itemShipped = false;
    public void shipTo(Customer customer) {
        while (!customer.hasPaid()) {
            System.out.println("Seller: waiting for payment from custo");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }System.out.println("Seller: item shipped");
        this.itemShipped = true;
    } public boolean hasShipped() {
         return this.itemShipped;
     }
 }

class Customer {
    private boolean paymentMade = false;
    public void makePaymentTo(Seller seller) {
        while (!seller.hasShipped()) {
            System.out.println("Customer: waiting for shipment from se");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }System.out.println("Customer: payment made");
        this.paymentMade = true;
    } public boolean hasPaid() {
        return this.paymentMade;
    }
}