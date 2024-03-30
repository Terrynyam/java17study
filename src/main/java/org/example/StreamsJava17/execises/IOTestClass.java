package org.example.StreamsJava17.execises;

import java.io.*;

/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class IOTestClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            var t = new Tooby();
            t.i = 100;
            var oos  = new ObjectOutputStream(new FileOutputStream("test.ser"));
            oos.writeObject(t);
            oos.close();
            var ois = new ObjectInputStream(new FileInputStream("test.ser"));
            t = (Tooby) ois.readObject();ois.close();
            System.out.println(t.i+" "+t.j+" "+t.k);

    }
}
class Booby{
    int i;
    public Booby(){
        i = 10;
        System.out.print("Booby");
    }
}
class Dooby extends Booby implements Serializable {
    int j;
    public Dooby(){
        j = 20;
        System.out.print("Dooby");
    }
}
class Tooby extends Dooby{
    int k;
    public Tooby(){
        k = 30;
        System.out.print("Tooby");
    }
}
