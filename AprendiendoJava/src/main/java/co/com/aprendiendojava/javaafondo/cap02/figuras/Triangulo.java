package co.com.aprendiendojava.javaafondo.cap02.figuras;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(int base, int altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura/2;
    }
}
