package co.com.aprendiendojava.javaafondo.cap01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cadena5a {
    /*
    1.5.8 La clase StringBuffer
    Esta clase representa a un string cuyo contenido puede variar (mutable).
    Las operaciones sobre StringBuffer son sincronizadas, StringBuilder provee la misma
    funcionalidad pero sin sincronización
     */

    public static void main(String[] args) {
        //obtengo el milisegundo actual

        long hi = System.currentTimeMillis();

        //Instancio un StringBuffer inicialmente vacio
        StringBuffer sb = new StringBuffer();

        //Voy a concatenar n caracteres
        int n = 100000;

        char c;
        for(int i=0; i<n;i++){
            //Obtengo caracteres entre 'A' y 'Z'
            c = (char)('A' + i%('Z'-'A'+1));

            //Concateno el caracter en el StringBuffer
            sb.append(c);
        }

        //Obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        // Muestro la cadena resultante
        System.out.println(sb.toString());

        //Muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi)+" milisegundos");
    }
}
