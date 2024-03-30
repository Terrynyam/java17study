package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class TestPrimitives {
    public static void main(String[] args) {
        long a = 10;
        double b =a;
        char aa = 'a', ba = 98; //1
    }
    int i = 10;
    class Inner
    {
        public void methodA()
        {
            //line 1.
            System.out.println(TestPrimitives.this.i);
        }
    }
}
