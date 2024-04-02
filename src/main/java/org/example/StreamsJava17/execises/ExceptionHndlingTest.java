package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 30/3/2024
 */
public class ExceptionHndlingTest {
    static int i1, i2, i3;
    static int oops(int i) throws Exception
    {
        throw new Exception("oops");
    }
    static int test(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        String s="string";

        try
        {
            test(i1 = 1, oops(i2=2), i3 = 3);
        } catch (Exception e)
        {
            System.out.println(i1+" "+i2+" "+i3);
        }
    }
}
