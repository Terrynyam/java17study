package org.example.instatnceof;

/**
 * @author Terrance Nyamfukudza
 * 31/3/2024
 */
public class ClassATest {

    static class Given{}
    public static void main(String[] args) {
        ClassA ab = new ClassB();
        if( ab instanceof ClassB b)
            System.out.println(true);

        var a = new Given();
    }
}
class ClassA{}
class ClassB extends  ClassA{}
class  ClassC extends ClassB{}