package co.com.aprendiendojava.javaafondo.cap03.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class UConnection {

    private static Connection con=null;

    public static Connection getConnection(){
        try{
            if(con == null){
                //Con esto determinanos cuando finalize el programa
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());

                ResourceBundle rb=ResourceBundle.getBundle("jdbc");
                String driver=rb.getString("driver");
                String url=rb.getString("url");
                String pwd=rb.getString("pwd");
                String usr=rb.getString("usr");

                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
            }
            return con;
        }catch (Exception ex){
            ex.printStackTrace();
            throw  new RuntimeException("Error al crear la conexión",ex);
        }
    }

    private static class MiShDwnHook extends Thread {

        //Justo antes de finalizar el programa la JVM incovara
        // A este metodo donde podemos cerrar la conexión
        public void run(){
            try {
                Connection con = UConnection.getConnection();
                con.close();
            }catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
