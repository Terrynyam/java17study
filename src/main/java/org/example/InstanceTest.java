package org.example;

/**
 * @author Terrance Nyamfukudza
 * 2/1/2024
 */
public class InstanceTest {

    public static void main(String... args){
        InstanceTest a = new InstanceTest();
        System.out.println(a instanceof InstanceTest);
        System.out.println(a instanceof Object);
    }
}
