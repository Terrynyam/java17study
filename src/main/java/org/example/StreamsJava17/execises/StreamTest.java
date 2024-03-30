package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Freedom at Midnight", 5.0),
                new Book("Gone with the wind", 5.0),
                new Book("Midnight Cowboy", 15.0) );
        books.stream()
                .filter(b->b.getTitle().startsWith("F"))
                .forEach(b->b.setPrice(10.0));

        books.stream()
                .forEach(b->System.out.println(b.getTitle()+":"+b.getPrice()));
    }
}
class Book{
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
