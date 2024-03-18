package org.example.exampractice;

/**
 * @author Terrance Nyamfukudza
 * 14/3/2024
 */
public class TestLoop {
    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
            "friday", "saturday", "sunday" };

    public static void main(String[] args) {
        var index = 0;
        for(var day : days){
            if(index == 3){
                break;}
            else {
                continue;
            }

            //Compilation error because the code below is unreachable

//            index++;
//            if(days[index].length()>3){
//                days[index] = day.substring(0,3);
//            }
        }
        System.out.println(days[index]);
    }
}
