package co.com.aprendiendojava.javaafondo.cap07;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class DemoCliente {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Socket s = null;
        try {
            //Instancio el server con la IP y el PORT
            s = new Socket("127.0.0.1", 5432);
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());

            //Envio el nombre
            oos.writeObject("Pablo");

            //Recibo la respuesta (El saludo personalizado)
            String ret = (String)ois.readObject();

            //Muestro la respuesta que envio el server
            System.out.println(ret);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(ois != null)ois.close();
            if(oos != null)oos.close();
            if(s != null) s.close();
        }
    }
}
