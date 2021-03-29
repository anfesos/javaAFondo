package co.com.aprendiendojava.javaafondo.cap02.colecciones;

import java.util.Vector;

public class TestVector {

    public static void main(String[] args) {

        //Instancio un Vector especializado en String
        Vector<String> v = new Vector<>();

        //Le asigno algunos valores
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");

        String aux;

        //El método size indica cuantos elementos contiene el vector
        for(int i=0; i<v.size();i++){
            //El método get retorna el i-esimo elemento
            aux = v.get(i);
            System.out.println(aux);
        }
    }
}
