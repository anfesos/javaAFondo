package co.com.aprendiendojava.javaafondo.cap02.estaticas;

public class TestGC {

    /*
    2.3.11 El método finalize
    Todas la clases heredan de object el método finalize, este método
    es invocado por el GC(Garbage Coolector) antes de destruir una
    instancia que quedó desreferenciada.
     */

    private static int cont = 0;

    public TestGC(){
        cont++;
        System.out.println(cont);
    }

    public void finalize(){
        cont--;
    }

    public static void main(String[] args) {
        while (true){
            new TestGC();
        }
    }
}
