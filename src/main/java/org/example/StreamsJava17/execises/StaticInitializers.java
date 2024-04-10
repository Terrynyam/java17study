package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 3/4/2024
 */
public class StaticInitializers {

    static {
        System.out.println("Static Initializer");
    }

    {
        System.out.println("Instance Initializer");
    }

    public static void main(String[] args) {

        System.out.println("Main");
        //static initializers are called once when the class is loaded
        //static initializers are called in the order of declaration
        StaticInitializers si = new StaticInitializers();
        StaticInitializers si2 = new StaticInitializers();
    }
}
