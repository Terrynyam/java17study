package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 28/3/2024
 */
public class TestChar {
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new TestChar().m1();
    }
}
