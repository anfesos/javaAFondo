package co.com.aprendiendojava.javaafondo.cap01;

public class Cadenas4 {

    /*
    1.5.5 Prefijos y sufijos
     */

    public static void main(String[] args) {
        String s = "Un buen libro de Java";

        boolean b1 = s.startsWith("Un buen");
        boolean b2 = s.startsWith("A");
        boolean b3 = s.endsWith("Java");
        boolean b4 = s.endsWith("Chau");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
