package org.example;

/**
 * @author Terrance Nyamfukudza
 * 2/1/2024
 */
public class InstanceTest {

    public static void main(String... args){
        Bee bee = new Bee();
        InstanceTest a = new InstanceTest();
        InstanceTest b = new D();
        System.out.println(a instanceof InstanceTest);
        System.out.println(a instanceof Object);
        System.out.println(bee instanceof InstanceTest);
        System.out.println(b instanceof C s);
        System.out.println(a instanceof Bee bees);
        if(a instanceof Bee bees){}
    }
}
class Bee extends InstanceTest{}
class C extends Bee{}
class D extends C {}
