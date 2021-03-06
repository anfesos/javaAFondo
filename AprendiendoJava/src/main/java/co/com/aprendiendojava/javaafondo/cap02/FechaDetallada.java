package co.com.aprendiendojava.javaafondo.cap02;

public class FechaDetallada extends Fecha {
    public FechaDetallada(){
        this(0,0,0);
    }

    public FechaDetallada(int dia, int mes, int anio) {
        super(dia, mes, anio);
    }

    public FechaDetallada(String fecha) {
        super(fecha);
    }

    //La defición static significa que es una "Variable de Clase"

    private static String meses[] = {
            "Enero"
            , "Febrero"
            , "Marzo"
            , "Abril"
            , "Mayo"
            , "Junio"
            , "Julio"
            , "Agosto"
            , "Septiembre"
            , "Octubre"
            , "Noviembre"
            , "Diciembre"
    };

    @Override
    public String toString() {
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }

}
