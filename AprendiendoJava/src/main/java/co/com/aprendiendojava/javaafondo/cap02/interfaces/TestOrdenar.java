package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class TestOrdenar {

    public static void main(String[] args) {
        //defino un array de alumnos
        Alumno arr[] = {
                new Alumno("Juan", 20,8.5)
                ,new Alumno("Pedro", 18,5.3)
                ,new Alumno("ALberto", 19, 4.6)
        };

        //Util.ordenar(arr); //Lo ordeno
        muestraArray(arr);

        //Defino , ordeno y muestro un array de Strings
        String[] arr2 = {"Pablo", "Andres","Marcelo"};
        //Util.ordenar(arr2);
        muestraArray(arr2);

        //Defino, ordeno y muestro un array de integers
        Integer[] arr3 = {
                new Integer(5),
                new Integer(3),
                new Integer(1)
        };

        //Util.ordenar(arr3);
        muestraArray(arr3);
    }

    public static void muestraArray(Comparable[] arr) {
        //Lo muestro ordenado
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
