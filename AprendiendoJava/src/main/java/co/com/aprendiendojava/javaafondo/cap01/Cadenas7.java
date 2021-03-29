package co.com.aprendiendojava.javaafondo.cap01;

import java.util.StringTokenizer;

public class Cadenas7 {

    /*
    1.5.11 Clase - StringTokenizer
    Sirve para separar una cadena en tokens delimitados por un separador
     */

    public static void main(String[] args) {
        String s = "Juan|Marcos|Carlos|Matias";

        StringTokenizer st = new StringTokenizer(s,"|");

        String tok;
        while(st.hasMoreTokens()){
            tok = st.nextToken();
            System.out.println(tok);
        }
    }
}
