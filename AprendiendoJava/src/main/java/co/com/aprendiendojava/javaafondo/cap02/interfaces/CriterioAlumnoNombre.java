package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class CriterioAlumnoNombre extends Criterio<Alumno> {

    @Override
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }
}
