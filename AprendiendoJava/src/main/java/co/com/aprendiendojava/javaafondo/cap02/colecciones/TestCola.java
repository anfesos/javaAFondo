package co.com.aprendiendojava.javaafondo.cap02.colecciones;

public class TestCola {

    public static void main(String[] args) {
        MiCola<Integer> c = new MiCola<>();
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);

        System.out.println(c.desencolar()); //Se saca el 1
        System.out.println(c.desencolar()); //Se saca el 2

        c.encolar(4);

        System.out.println(c.desencolar());//Se saca el 3
        System.out.println(c.desencolar());//Se saca el 4
    }
}
