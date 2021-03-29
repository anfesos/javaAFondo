package co.com.aprendiendojava.javaafondo.cap01;

public class Cadenas3 {

    /*
    1.5.4 Subcadenas
    Cuando se indican dos posiciones la primera es inclusive y la segunda (no inclusive)
     */

    public static void main(String[] args) {
        String s = "Esto Es Una Cadena de Caracteres";

        String s1 = s.substring(0,7);
        String s2 = s.substring(8,11);

        //Toma desde el caracter 8 hasta el final
        String s3 = s.substring(8);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
