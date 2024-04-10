package org.example.StreamsJava17.execises;

import java.util.List;
import java.util.OptionalDouble;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class StreamTesting1 {
    public static void main(String[] args) {

        float foo = 2, bar = 3, baz = 4;    //1
        float mod1 = foo % baz, mod2 = baz % foo;  //2
        float val = mod1>mod2? bar : baz; //3
        System.out.println(val);
        System.out.println('a' + 1 );
        System.out.println(4+5.0f);

        List<StreamTesting2> list = List.of(new StreamTesting2("A", 1.1)
                , new StreamTesting2("B", 2.2),
                new StreamTesting2("C", 3.3));
//        OptionalDouble  a =list.stream().
//        peek(c-> c.setPrice(20.0)). // elements can be modified inside the peek
//                mapToDouble(StreamTesting2::getPrice).average();
//        a.ifPresent(System.out::println);

        OptionalDouble  a =list.stream().
                mapToDouble(StreamTesting2::getPrice).average();
        a.ifPresent(System.out::println);
    }
}
class StreamTesting2 {
    String model;
    double price;

    public StreamTesting2(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}