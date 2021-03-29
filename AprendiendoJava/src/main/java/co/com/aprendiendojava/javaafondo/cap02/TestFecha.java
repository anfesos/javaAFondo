package co.com.aprendiendojava.javaafondo.cap02;

public class TestFecha {

    public static void main(String[] args) {

        Fecha fecha = new Fecha(2,10, 1970);
        Fecha fecha2 = new Fecha(2,10,1971);

//        fecha.setDia(2);
//        fecha.setMes(10);
//        fecha.setAnio(1970);

        System.out.println("Dia="+fecha.getDia());
        System.out.println("Mes="+fecha.getMes());
        System.out.println("Año="+fecha.getAnio());

//        fecha2.setDia(2);
//        fecha2.setMes(10);
//        fecha2.setAnio(1971);

        System.out.println(fecha);

        System.out.println(fecha + " vs "+ fecha2 + " ¿es igual? " + fecha.equals(fecha2));
    }
}
