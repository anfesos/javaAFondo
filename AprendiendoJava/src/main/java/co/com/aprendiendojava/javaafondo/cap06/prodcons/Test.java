package co.com.aprendiendojava.javaafondo.cap06.prodcons;

public class Test {

    public static void main(String[] args) {
        Monitor m = new Monitor(3);
        Productor p = new Productor(m,6,2000);
        Consumidor c = new Consumidor(m,6,4000);
        p.start();
        c.start();
    }
}
