package org.example.staticinitializers;

/**
 * @author Terrance Nyamfukudza
 * 28/12/2023
 */
public class Music {
    static {
        System.out.print("-C-");
    }
    {
        System.out.print("-D-");
    }
    public Music(){
        System.out.print("-E-");
    }
}
