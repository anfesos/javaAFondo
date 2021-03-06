package co.com.aprendiendojava.javaafondo.cap02.estaticas;

public class TestEstatico2 {

    private int a = 0;

    public void unMetodo(){
        System.out.println("Este es unMetodo()");
    }

    public static void main(String[] args) {

        TestEstatico2 ts = new TestEstatico2();
        System.out.println("a vale " + ts.a);

        //No tengo acceso al método unMetodo
        ts.unMetodo();
    }
}
