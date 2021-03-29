package co.com.aprendiendojava.javaafondo.cap02;

public class FechaHora extends FechaDetallada {

    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora(String sFecha, int hora, int min, int seg) {
        super(sFecha);
        this.hora = hora;
        this.minuto = min;
        this.segundo = seg;
    }

    public String toString() {
        //Invocamos al método toString de nuestro padre
        return super.toString() + " (" + hora + ":" + minuto + ":" + segundo + ")";
    }
}
