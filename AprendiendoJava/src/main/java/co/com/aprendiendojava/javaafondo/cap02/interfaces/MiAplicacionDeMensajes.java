package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class MiAplicacionDeMensajes {

    public static void main(String[] args) {
        Comunicador c = ComunicadorManager.crearComunicador();
        c.enviarMensaje("Hola, este es mi mensaje");
    }
}
