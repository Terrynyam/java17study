package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
class Shadowing {
    private String msg = "A";
    public  void print(){
        //final String msg = "B";// this shadows -- String msg = "A";
        class Inner{
            //final String msg = "C";// this shadows --String msg = "B";
            public void print(){

                System.out.println(msg);
                //System.out.println(this.msg);// this only reference to the variable of Inner only
            }
        }
        Inner obj = new Inner();
        obj.print();

    }
}
public class ShadowingVariables {
    public static void main(String[] args) {
        new Shadowing().print();
    }
}
