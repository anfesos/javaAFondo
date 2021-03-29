package co.com.aprendiendojava.javaafondo.cap05.mvc;

import javax.swing.*;
import java.awt.*;

public class DemoJList2 extends JFrame {

    public DemoJList2() {
        super("Demo JList, tomando desde un array");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        //Obtengo el vector con los datos que vamos a mostrar
        Object[] datos = _obtenerArrayDatos();
        JList lista = new JList(new ArrayModel(datos));

        //El Scrollpane agrega barras de scroll si es necesario
        JScrollPane scrollLista = new JScrollPane(lista);

        content.add(scrollLista, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    private Object[] _obtenerArrayDatos() {
        Object[] array = {"Jhon Lenon",
                "Paul McCartney",
                "George Harrison",
                "Ringo Start",
                "Sandro (Roberto Sanchez",
                "Caetano Veloso"};

        return array;
    }

    public static void main(String[] args) {
        DemoJList2 dm = new DemoJList2();
    }
}
