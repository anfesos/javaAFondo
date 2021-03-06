package co.com.aprendiendojava.javaafondo.cap02;

public class TestFecha3a {

    public static void main(String[] args) {

        Fecha fecha1 = new Fecha("1/2/2020");
        Fecha fecha2 = new Fecha(1,2,2020);

        System.out.println(fecha1 + " es igual a " + fecha2 + " : " + fecha1.equals(fecha2));
    }
}
