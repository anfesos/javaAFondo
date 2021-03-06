package co.com.aprendiendojava.javaafondo.cap02.figuras;

public class Circulo extends FiguraGeometrica {

    private int radio;

    public Circulo(int radio){
        super("Circulo");
        this.radio=radio;
    }

    @Override
    public double area() {
        //retorno "PI por radio al cuadrado"
        return Math.PI*Math.pow(radio,2);
    }
}
