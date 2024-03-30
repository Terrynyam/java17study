package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class TextTest {
    public void testRefs(String str, StringBuilder sb){
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }
    public static void main(String[] args) {

        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new TextTest().testRefs(s, sb);
        System.out.println("s="+s+" sb="+sb);
    }
}
