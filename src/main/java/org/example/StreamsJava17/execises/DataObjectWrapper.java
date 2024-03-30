package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 29/3/2024
 */
public class DataObjectWrapper {
    private final Object obj;

    public DataObjectWrapper(Object pObj) {
        obj = pObj;
    }

    public Object getObject() {
        return obj;
    }

    public static void main(String[] args) {
        DataObjectWrapper a = new DataObjectWrapper("aaa");
        //a.obj = "bbb";  obj is final and cannot be reassigned
        System.out.println(a.obj);
    }
}
