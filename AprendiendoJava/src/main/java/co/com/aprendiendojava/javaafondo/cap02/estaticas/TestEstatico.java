package co.com.aprendiendojava.javaafondo.cap02.estaticas;

public class TestEstatico {

    /*
    Referencias estaticas:
    Dentro de los métodos estáticos de una clase, no podemos acceder variables o métodos
    que no lo sean
     */

    private int a = 0;

    public void unMetodo(){
        System.out.println("Este es unMetodo()");
    }

    public static void main(String[] args) {
        //No tengo acceso a la variable a
        //System.out.println("a vale " + a); //ERROR ... no compila

        //No tengo acceso al método unMetodo
        //unMetodo(); //ERROR ... no compila
    }
}
