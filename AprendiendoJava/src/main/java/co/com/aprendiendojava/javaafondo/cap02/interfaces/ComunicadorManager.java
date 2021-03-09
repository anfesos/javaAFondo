package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class ComunicadorManager {

    public static Comunicador crearComunicador(){
        //Una "Paloma mensajera" es un "Comunicador"
        //return new PalomaMensajera();
        //Se implementa el return con telefono para mostrar el desacoplamiento existente
        return new TelefonoCelular();
    }
}
