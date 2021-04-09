package co.com.aprendiendojava.javaafondo.cap07.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        //Obtengo referencia al registry del servidor (IP+PORT)
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);

        //Ubico el objeto remoto identificado por "OBJRemoto"
        ObjetoRemoto objetoRemoto;
        objetoRemoto = (ObjetoRemoto)registry.lookup("OBJRemoto");

        //Invoco sus metodos como lo hago con cualquier otro objeto
        String saludo = objetoRemoto.obtenerSaludo("Pablo");
        System.out.println(saludo);
    }
}
