package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 6/4/2024
 */
public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest tc = new ExceptionTest();
        try {
            tc.myMethod();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void myMethod() throws Exception {
        yourMethod();
    }

    public void yourMethod() throws Exception {
        throw new Exception();
    }
}
