package co.com.aprendiendojava.javaafondo.cap02.colecciones;

public class TestPila {

    /*
    Java permite pasar literales primitivos como argumentos de métodos que reciben parametros
    de tipo Wrapper. Esta caracteristica se llama autoboxing
     */

    public static void main(String[] args) {
        //Utilizaremos una pila de Integer
        MiPila<Integer> c = new MiPila<>();

        c.apilar(1);
        c.apilar(2);
        c.apilar(3);

        System.out.println(c.desapilar()); //Saca el 3
        System.out.println(c.desapilar()); //Saca el 2

        c.apilar(4);

        System.out.println(c.desapilar()); //Saca el 4
        System.out.println(c.desapilar()); //Saca el 1
    }
}
