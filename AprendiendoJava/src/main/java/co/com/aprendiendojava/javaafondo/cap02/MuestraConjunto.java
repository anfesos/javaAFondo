package co.com.aprendiendojava.javaafondo.cap02;

public class MuestraConjunto {

    public static void mostrar(Object[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
