package org.example;

/**
 * @author Terrance Nyamfukudza
 * 28/12/2023
 */
public class Initialization {
    private static String msg(String msg) {
        System.out.println(msg);
        return msg;
    }
    public Initialization() { m = msg("1"); }// then last

    { m = msg("2"); }//initialization block is executed first
    String m = msg("3");// then second

    public static void main(String[] args) {
        Object obj = new Initialization();
    }
}
