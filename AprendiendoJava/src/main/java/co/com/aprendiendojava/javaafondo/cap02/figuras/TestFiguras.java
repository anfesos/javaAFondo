package co.com.aprendiendojava.javaafondo.cap02.figuras;

public class TestFiguras {

    public static void main(String[] args) {
        Circulo c = new Circulo(4);
        Rectangulo r = new Rectangulo(10,5);
        Triangulo t = new Triangulo(3,6);

        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}
