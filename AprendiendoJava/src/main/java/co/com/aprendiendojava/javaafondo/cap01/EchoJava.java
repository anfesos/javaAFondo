package co.com.aprendiendojava.javaafondo.cap01;

public class EchoJava {
    //Argumentos en línea de comandos

    /*
    Se llama así a los parámetros que un programa recibe a través de la línea de comandos
     */
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        System.out.println("Total: " + args.length + " argumentos");
    }
}
