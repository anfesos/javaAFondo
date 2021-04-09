package co.com.aprendiendojava.javaafondo.cap07;

import java.io.IOException;
import java.net.*;

public class UDPCliente {

    public static void main(String[] args) throws IOException {
        //instancio un DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        //buffer con info a enviar
        byte[] bEnviar = "Pablo".getBytes();

        //ip del server
        byte[] ip = {127,0,0,1};
        InetAddress address = InetAddress.getByAddress(ip);

        //paquete de información a enviar, ip + port (5432)
        DatagramPacket packet = new DatagramPacket(bEnviar, bEnviar.length,address,5432);

        //Envio el paquete
        socket.send(packet);

        //buffer para recibir la respuesta
        byte[] bRecibe = new byte[256];
        packet = new DatagramPacket(bRecibe,bRecibe.length,address,5432);

        //Recibo el saludo
        socket.receive(packet);

        //Muestro el resultado
        String saludo = new String(packet.getData(), 0, packet.getLength());

        System.out.println(saludo);

        socket.close();
    }
}
