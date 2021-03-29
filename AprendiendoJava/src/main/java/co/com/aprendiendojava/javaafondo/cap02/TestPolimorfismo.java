package co.com.aprendiendojava.javaafondo.cap02;

public class TestPolimorfismo {

    public static void main(String[] args) {
        // a fec (De tipo fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");

        //a obj (De tipo Object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("03/23/2008");

        //Imprimo los dos objetos
        System.out.println("fec = " + fec); //Invoca a toString de fec
        System.out.println("obj = " + obj); //Invoca a toString de obj
    }
}
