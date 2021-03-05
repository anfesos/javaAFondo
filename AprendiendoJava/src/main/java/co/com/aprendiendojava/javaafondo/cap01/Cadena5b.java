package co.com.aprendiendojava.javaafondo.cap01;

public class Cadena5b {
    /*
    1.5.8 La clase StringBuffer
    En esta clase se ejecuta la concatenación con el simbolo + mostrando
    que es más ineficiente que la clase StringBuffer
     */

    public static void main(String[] args) {
        //obtengo el milisegundo actual

        long hi = System.currentTimeMillis();

        //Voy a concatenar n caracteres
        int n = 100000;

        char c;
        String s = "";

        for(int i=0; i<n;i++){
            //Obtengo caracteres entre 'A' y 'Z'
            c = (char)('A' + i%('Z'-'A'+1));

            //Concateno el caracter c utilizando el operador +
            s = s+ c;
        }

        //Obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        // Muestro la cadena resultante
        System.out.println(s);

        //Muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi)+" milisegundos");
    }
}
