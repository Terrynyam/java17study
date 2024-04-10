package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public enum EnumTest {
    ONE {
        public void frobnicate() {
            // do BAR stuff
        }
    }, TWO {
        public void frobnicate() {
            // do BAR stuff
        }
    }, THREE{
        public void frobnicate() {
            // do BAR stuff
        }
    };
    public abstract void frobnicate();
}
