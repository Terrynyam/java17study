package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class AnonymousClasses {
    public static void main(String[] args) {
        TheImplementor a = new TheImplementor();
        myMethod(a);

        // below myMethod is called and passed an anonymous class
        myMethod(new International() {
            @Override
            public String accent() {
                return "Zimbabwean Accent";
            }
        });

        //using lambda expressions
        myMethod(()->"Lambda Accent");
    }
    static void myMethod(International international){
        System.out.println(international.accent());
    }
}
interface International{
    String accent();
}
class TheImplementor implements International{

    public String accent() {
        return "British Accent";
    }
}
