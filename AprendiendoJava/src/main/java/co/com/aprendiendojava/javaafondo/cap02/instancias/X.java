package co.com.aprendiendojava.javaafondo.cap02.instancias;

public class X {

    private int a;
    private int b;

    public X(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "X{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
