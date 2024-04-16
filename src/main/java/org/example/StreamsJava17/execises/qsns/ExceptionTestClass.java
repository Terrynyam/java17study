package org.example.StreamsJava17.execises.qsns;

import java.io.IOException;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class ExceptionTestClass {
}
class Base{
    public void log() throws NullPointerException
    {
        System.out.println("Base : log()");
    }
    public void newLog() throws IOException
    {
        System.out.println("Base : newLog()");
    }
}
class Derived extends Base{
    public void log() throws RuntimeException
    {
        System.out.println("Derived : log()");
    }
    public void newLog() //can throw IOException not Exception
    {
        System.out.println("Derived : newLog()");
    }
}
