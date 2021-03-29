package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class TestCriterio {

    public static void main(String[] args) {
        Alumno arr[] = {
                new Alumno("Martin",25,7.2)
                ,new Alumno("Carlos", 23, 5.1)
                , new Alumno("Anastasio",20,4.8)
        };

        Util.ordenar(arr,new CriterioAlumnoNombre());
        Util.imprimir(arr);

        Util.ordenar(arr,new CriterioAlumnoNotaProm());
        Util.imprimir(arr);
    }
}
