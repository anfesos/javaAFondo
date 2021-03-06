package co.com.aprendiendojava.javaafondo.cap02;

public class TestMuestraConjunto {

    public static void main(String[] args) {
        Object[] arr = {
          new Fecha(2,10,1970)
          ,new FechaDetallada("23/12/1948")
          ,new String("Esto es una cadena")
          ,new Integer(34)
        };

        //Como el método es estatico lo invoco a traves de la clase
        MuestraConjunto.mostrar(arr);
    }
}
