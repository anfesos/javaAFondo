package co.com.aprendiendojava.javaafondo.cap07.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {

    public static void main(String[] args) throws RemoteException {

        ObjetoRemotoImple obj = new ObjetoRemotoImple();
        Registry registry = LocateRegistry.getRegistry(1099);

        registry.rebind("OBJRemoto",obj);
    }
}
