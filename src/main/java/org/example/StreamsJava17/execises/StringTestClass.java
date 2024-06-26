package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class StringTestClass {
    public static void main(String[] args) {
        String examName = "OCP Java 17";
        String examName1 = "OCP Java 17";
        String uniqueExamName = new String(examName);
        String internedExamName = uniqueExamName.intern();

        System.out.println(examName);
        System.out.println(uniqueExamName);
        System.out.println(examName==examName1);// true
        System.out.println(internedExamName);

        System.out.println(
                (examName==uniqueExamName)+" "+//false
                        (examName == internedExamName)+" "+//true
                        (uniqueExamName == internedExamName)//false
        );
    }
}
