package co.com.aprendiendojava.javaafondo.cap01;

public class Cadenas2 {

    /*
    1.5.3 Ocurrencias de caracteres
     */
    public static void main(String[] args) {
        String s = "Esto Es Una Cadena de Caracteres";

        int pos1 = s.indexOf('C');
        int pos2 = s.lastIndexOf('C');
        int pos3 = s.indexOf('x');

        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
