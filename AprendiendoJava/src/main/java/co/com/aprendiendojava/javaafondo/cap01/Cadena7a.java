package co.com.aprendiendojava.javaafondo.cap01;

public class Cadena7a {

    /*
    1.5.12 Usar expresiones regulares para particionar una cadena

    A través del método Split del objeto String
     */

    public static void main(String[] args) {
        String s = "Juan|Marcos|Catalina|Andres";
        String[] tokens = s.split("[|]");

        for(int i=0; i<tokens.length;i++){
            System.out.println(tokens[i]);
        }
    }
}
