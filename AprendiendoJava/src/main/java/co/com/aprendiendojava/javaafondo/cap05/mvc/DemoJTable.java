package co.com.aprendiendojava.javaafondo.cap05.mvc;

import javax.swing.*;
import java.awt.*;

public class DemoJTable extends JFrame {

    public DemoJTable() {
        super("Demo JList, tomando desde un DataTable");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        //Obtengo el vector con los datos que vamos a mostrar
        Object[][] datos = _obtenerMatrizDatos();
        JTable lista = new JTable(new MatrizModel(datos));

        //El Scrollpane agrega barras de scroll si es necesario
        JScrollPane scrollLista = new JScrollPane(lista);

        content.add(scrollLista, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    private Object[][] _obtenerMatrizDatos() {
        Object[][] mat = {
                {"Columna 0", "Columna 1", "Columna 2", "Columna 3"}
                , {"Rojo", "Verde", "Azul", "Violeta"}
                , {"Amarillo", "Naranja", "Blanco", "Gris"}
                , {"Negro", "Turqueza", "Sepia", "Rosa"}
                , {"Salmon", "Maiz", "Marron", "Fucsia"}
        };

        return mat;
    }

    public static void main(String[] args) {
        DemoJTable dm = new DemoJTable();
    }
}
