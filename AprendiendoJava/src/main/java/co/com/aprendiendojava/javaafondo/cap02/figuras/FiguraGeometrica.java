package co.com.aprendiendojava.javaafondo.cap02.figuras;

public abstract class FiguraGeometrica {

    /*
    Las clases abstractas no pueden ser instanciadas. Es decir, no podemos crear
    objetos de clases definidas como abstractas porque, por definición, hay métodos
    de la clase que no están rsueltos aún
     */

    private String nombre;

    public abstract double area();

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    public static double areaPromedio(FiguraGeometrica arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i].area();
        }

        return sum/arr.length;
    }

    public String toString() {
        return nombre + "(area = " + area() + ") ";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
