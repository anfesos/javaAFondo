package co.com.aprendiendojava.javaafondo.cap04.facades;

import java.util.Hashtable;
import java.util.ResourceBundle;

public class UFactory {

    private static Hashtable<String, Object> instancias = new Hashtable<>();

    public static Object getInstacia(String objectName){
        try{

            //Verifico si existe un objeto relacionado a objName
            //en la hastable

            Object obj = instancias.get(objectName);

            if(obj == null){
                ResourceBundle rb = ResourceBundle.getBundle("factory");
                String sClassname = rb.getString(objectName);
                obj = Class.forName(sClassname).newInstance();

                //Se agrega el objeto a la hashtable
                instancias.put(objectName,obj);
            }

            return obj;
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
