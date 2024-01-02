package org.example.staticinitializers;

/**
 * @author Terrance Nyamfukudza
 * 28/12/2023
 */
public class Song extends Music {
    static {
        System.out.print("-F-");
    }{
        System.out.print("-G-");
    }
    public Song(){
        System.out.print("-A-");}
}
