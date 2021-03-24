package co.com.aprendiendojava.javaafondo.cap05;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class DemoJList extends JFrame {

    public DemoJList(){
        super("Demo JList");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        //Obtengo el vector con los datos que vamos a mostrar
        Vector<Object> datos = _obtenerVectorDatos();

        //El constructor de JList recibe una instancia de ListModel
        JList lista = new JList(new VectorModel(datos));

        //El Scrollpane agrega barras de scroll si es necesario
        JScrollPane scrollLista = new JScrollPane(lista);

        content.add(scrollLista,BorderLayout.CENTER);

        setSize(300,300);
        setVisible(true);
    }

    private Vector<Object> _obtenerVectorDatos() {

        Vector<Object> v = new Vector<>();
        v.add("Jhon Lenon");
        v.add("Paul McCartney");
        v.add("George Harrison");
        v.add("Ringo Start");
        v.add("Sandro (Roberto Sanchez");
        v.add("Caetano Veloso");
        return v;
    }

    public static void main(String[] args) {
        DemoJList dm = new DemoJList();
    }
}
