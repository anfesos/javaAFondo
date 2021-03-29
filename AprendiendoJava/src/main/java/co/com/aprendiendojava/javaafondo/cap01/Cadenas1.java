package co.com.aprendiendojava.javaafondo.cap01;

public class Cadenas1 {
    /*
    1.5.2 Mayúsculas y minúsculas
     */
    public static void main(String[] args) {
        String s = "Esto es Una Cadena de caracteres";
        String sMayus = s.toUpperCase();
        String sMinus = s.toLowerCase();

        System.out.println("Original: " + s);
        System.out.println("Mayúsculas: " + sMayus);
        System.out.println("Minúsculas: " + sMinus);
    }
}
