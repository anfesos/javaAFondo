package co.com.aprendiendojava.javaafondo.cap02.figuras;

public class TestAreaPromedio {

    public static void main(String[] args) {
        FiguraGeometrica arr[] ={
                new Circulo(23)
                ,new Rectangulo(12,4)
                ,new Triangulo(2,5)
        };

        double prom = FiguraGeometrica.areaPromedio(arr);
        System.out.println("Promedio = " + prom);
    }
}
