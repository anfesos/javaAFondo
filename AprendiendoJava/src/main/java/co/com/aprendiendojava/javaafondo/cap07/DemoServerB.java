package co.com.aprendiendojava.javaafondo.cap07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServerB {

    private static final int BUFFER_LENGTH = 3;

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        Socket s = null;
        ServerSocket ss = new ServerSocket(5432);


        while(true) {

            try {
                //Espero la conexión
                s = ss.accept();

                //Información en la consola
                System.out.println("Se conectaron desde la IP: " + s.getInetAddress());

                //Enmascaro la entrada y salida de bytes
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                bw = new BufferedWriter(new PrintWriter(s.getOutputStream()));

                char bEnviar[];
                char bRecive[] = new char[BUFFER_LENGTH];

                StringBuffer sb= new StringBuffer();

                //Leo el nombre que envia el cliente
                int n;
                while((n=br.read(bRecive)) == BUFFER_LENGTH){
                    sb.append(bRecive);
                }

                sb.append(bRecive,0,n);

                //Armo el saludo personalizado que le quieto enviar
                String saludo = "Hola Mundo (" +sb+") _ " +
                        System.currentTimeMillis();

                //Envio el saludo al cliente
                bEnviar = saludo.toCharArray();
                bw.write(bEnviar);
                bw.flush();
                System.out.println("Saludo Enviado...");
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                if(bw != null)bw.close();
                if(br != null) br.close();
                if(s != null) s.close();
                System.out.println("Conexión cerrada!");
            }
        }

    }
}
