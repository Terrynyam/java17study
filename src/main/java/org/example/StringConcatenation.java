package org.example;

/**
 * @author Terrance Nyamfukudza
 * 20/12/2023
 */
public class StringConcatenation {
    public static void main(String... args){
        String billboard = "Just";
        billboard.concat(" lost in space."); // (1) Returned reference value not stored.
        System.out.println(billboard); // (2) "Just"
        billboard = billboard.concat(" advertise").concat(" here."); // (3) Chaining.
        System.out.println(billboard);

        String motto = new String("Program once"); // (1)
        motto += ", execute everywhere."; // (2)
        motto = motto.concat(" Don't bet on it!"); // (3)
        System.out.println(motto);

        String banner = "Let's ace that Exam! ";
        String bigBanner = banner.repeat(3);
        System.out.println("|" + bigBanner + "|");
    }
}
