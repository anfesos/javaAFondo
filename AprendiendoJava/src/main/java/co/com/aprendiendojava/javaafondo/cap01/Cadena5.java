package co.com.aprendiendojava.javaafondo.cap01;

public class Cadena5 {

    /*
    1.5.6 Posición de un substring dentro de la cadena
     */

    public static void main(String[] args) {

        String s = "Un buen libro de Java, un buen material";

        int pos1 = s.indexOf("buen");
        int pos2 = s.lastIndexOf("buen");
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
