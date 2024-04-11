package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 10/4/2024
 */
public class FinallyTryAndCatch {
    public static void main(String[] args) throws Exception {
        try{
            m1();
            System.out.println("A");
        }
//        catch (Exception e){ // adding catch block the result will print Ex B C
//            System.out.println("Ex");
//        }
        finally{
            System.out.println("B");
        }
        // C will not be executed but B will be printed as it is in finally then
        // Exception will be thrown

        System.out.println("C");
    }
    public static void m1() throws Exception { throw new Exception(); }
}
