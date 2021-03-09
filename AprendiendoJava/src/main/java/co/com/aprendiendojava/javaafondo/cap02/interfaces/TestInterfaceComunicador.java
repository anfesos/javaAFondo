package co.com.aprendiendojava.javaafondo.cap02.interfaces;

public class TestInterfaceComunicador {

    public static void main(String[] args) {
        Comunicador t1 = new TelefonoCelular();
        Comunicador t2 = new PalomaMensajera();
        Comunicador t3 = new Telegrafo();
    }
}
