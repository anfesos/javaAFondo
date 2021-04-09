package co.com.aprendiendojava.javaafondo.cap07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

    public static void main(String[] args) throws IOException {
        //Creo el socket
        DatagramSocket socket = new DatagramSocket(5432);

        while(true){
            System.out.println("Esperando Conexión...");

            //Buffer para recibir el nombre del cliente
            byte[] bRecibe = new byte[256];

            //Recibo el nombre del cliente
            DatagramPacket packet = new DatagramPacket(bRecibe, bRecibe.length);

            socket.receive(packet);

            System.out.println("Conexión recibida !");

            //Preparo el saludo para enviar
            String nombre = new String(packet.getData(),0,packet.getLength());

            String saludo = "Hola mundo ("+nombre+") _ "
                    + System.currentTimeMillis();

            System.out.println("Voy a enviar: ["+saludo+"]...");

            //buffer para enviar saludo
            byte[] bEnvia = saludo.getBytes();

            //Envio el saludo
            InetAddress address = packet.getAddress();
            packet = new DatagramPacket(bEnvia, bEnvia.length, address,packet.getPort());

            socket.send(packet);

            System.out.println("Saludo Enviado !");
        }
    }
}
