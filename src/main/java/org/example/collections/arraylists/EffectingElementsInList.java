package org.example.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 19/1/2024
 */
public class EffectingElementsInList {
    public static void main(String... args){
         doIt1();
         doIt2();
         doIt3();
    }
    public static void doIt1() {
        List<StringBuilder> sbListOne = new ArrayList<>();
        sbListOne.add(new StringBuilder("Anna"));
        sbListOne.add(new StringBuilder("Ada"));
        sbListOne.add(new StringBuilder("Bob"));
        List<StringBuilder> sbListTwo = new ArrayList<>(sbListOne);
        sbListOne.add(null);
        sbListTwo.get(1).reverse();
        System.out.println(sbListOne); //
    }
    public static void doIt2() {
        List<String> listOne = new ArrayList<>();
        listOne.add("Anna");
        listOne.add("Ada");
        listOne.add("Bob");
        List<String> listTwo = new ArrayList<>(listOne);
        System.out.println(listTwo);
        String strTemp = listOne.get(0);
        listOne.set(0, listOne.get(listOne.size() - 1));
        listOne.set(listOne.size() - 1, strTemp);
        System.out.println(listOne);
        System.out.println(listTwo);
    }
        public static void doIt3() {
            List<String> strList = new ArrayList<>();
            strList.add("Anna"); strList.add("Ada"); strList.add(null);
            strList.add("Bob"); strList.add("Bob"); strList.add("Adda");
//            if(strList.get(2).equals(null))        can not call equals() method on null elements
//                System.out.println("error");
            while (strList.remove("Bob"));
            System.out.println(strList);
        }
}
