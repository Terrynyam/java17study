package org.example;

/**
 * @author Terrance Nyamfukudza
 * 20/11/2023
 */
public class InitClass {
    String title;
    boolean published;
    static int total;
    static double maxPrice;
    public static void main(String[] args) {
        InitClass initMe = new InitClass();
        double price;
        // Condition always true, so the following block will always execute
        if (true)
            price = 100.00;
        System.out.println("|" + initMe.title + "|" + initMe.published+ "|" +
                InitClass.total + "|" + InitClass.maxPrice + "|" + price);
    }
}
