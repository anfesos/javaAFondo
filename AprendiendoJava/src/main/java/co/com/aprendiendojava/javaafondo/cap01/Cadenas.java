package co.com.aprendiendojava.javaafondo.cap01;

public class Cadenas {

    /*
    1.5.1 Acceso a los caracteres de un String
    Una cadena representa una secuencia finita de cero o más caracteres numerados a partir de cero
     */

    public static void main(String[] args) {
        String s = "Esta es mi cadena";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(s.length()-1));

        char c;

        for(int i=0; i<s.length();i++){
            c = s.charAt(i);
            System.out.println(i+" -> "+c);
        }
    }
}
