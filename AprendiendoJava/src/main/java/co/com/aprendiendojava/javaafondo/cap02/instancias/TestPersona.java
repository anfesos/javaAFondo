package co.com.aprendiendojava.javaafondo.cap02.instancias;

import co.com.aprendiendojava.javaafondo.cap02.FechaDetallada;

public class TestPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan",
                "212344",new FechaDetallada(23,3,1971));

        Persona p2 = new Persona("Andres",
                "23213213",new FechaDetallada(12,6,1968));

        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);
        System.out.println("---");

        System.out.println(p2);
        System.out.println(p2);
        System.out.println("---");

        System.out.println(p1);
        System.out.println(p1);
    }
}
