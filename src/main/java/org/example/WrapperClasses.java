package org.example;

/**
 * @author Terrance Nyamfukudza
 * 20/12/2023
 */
public class WrapperClasses {
    public static void main(String[] args) {
       String a = new String("Terrance");
       String b ="Terrance";
       Boolean c = a==b;
       System.out.println(c);

        Integer i = Integer.valueOf(-10);// no new object created
        Integer j = Integer.valueOf(-10);
        Integer k = -10;
        System.out.print((i==j) + "|");//true
        System.out.print(i.equals(j) + "|");//true
        System.out.print((i==k) + "|");//true
        System.out.print(i.equals(k));//true

        System.out.println("\n");

        Integer ia = Integer.valueOf(223);// new object is created as the value range is not
        //within -128 and 127
        Integer ja = Integer.valueOf(223);
        Integer ka = 223;
        System.out.print((ia==ja) + "|");//false
        System.out.print(ia.equals(ja) + "|");//true
        System.out.print((ia==ka) + "|");//false
        System.out.print(ia.equals(ka));//true

        System.out.println("\n");

        Integer v = 200;
        Integer w = 200;
        System.out.println(v==w);//false because of out of range -128 and 127
        System.out.println("\n");

        Double ii = Double.valueOf(10);
        Double jj = Double.valueOf(10);
        System.out.print((ii==jj) + "|");//false range doesn't apply to Doubles and float
        System.out.print(ii.equals(jj) + "|");//true
        System.out.println("\n");

        Integer i1 = 10;
        Integer i2 = 10;
        int i3 = 10;
        Integer x1 = i1*i2*i3;//1000 - Auto boxing
        Integer x2 = i1*i2*i3;//1000
        int x3 = i1*i2*i3;//100 Auto Unboxing
        String result = (i1 == i2) ? "A" : "";
        result += (i1 == i3) ? "B" : "";
        result += (x1 == x2) ? "C" : "";
        result += (x1 == x3) ? "D" : "";
        System.out.print(result);
    }
}
