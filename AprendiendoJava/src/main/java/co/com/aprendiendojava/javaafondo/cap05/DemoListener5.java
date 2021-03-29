package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DemoListener5 extends Frame {

    private Button bAgregar;
    private TextField tfItem;
    private List lista;

    public DemoListener5() {
        super("Action listener");
        setLayout(new BorderLayout());

        //Al norte
        Panel pn = _crearPNorte();
        add(pn, BorderLayout.NORTH);

        //Al Centro
        lista = new List();
        add(lista, BorderLayout.CENTER);

        //Seteo los listeners
        bAgregar.addActionListener(new EscuchaAgregar());
        tfItem.addActionListener(new EscuchaAgregar());
        lista.addActionListener(new EscuchaDobleClick());
        this.addWindowListener(new EscuchaVentana());

        setSize(300, 300);
        setVisible(true);

        //El cursor aparecera por defecto en el textField
        tfItem.requestFocus();
    }

    public static void main(String[] args) {
        DemoListener5 dm = new DemoListener5();

    }

    private Panel _crearPNorte() {

        Panel p = new Panel(new FlowLayout());

        p.add(new Label("Item: "));

        tfItem = new TextField(15);
        p.add(tfItem);

        bAgregar = new Button("Agregar");
        p.add(bAgregar);

        return p;

    }

    private class EscuchaAgregar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //tomo el texto ingresado en el TextField
            String item = tfItem.getText();

            //Lo agrego a la lista
            lista.add(item);

            //Seleccion _todo el texto en el TextField
            tfItem.selectAll();

            //Seteo el foco en el TextField
            tfItem.requestFocus();
        }
    }

    private class EscuchaDobleClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Tomo la posición del item seleccionado
            int idx = lista.getSelectedIndex();

            //Seteo el item seleccinado en el textField
            tfItem.setText(lista.getSelectedItem());

            //Lo remuevo de la lista
            lista.remove(idx);

            //Selecciono _todo el texto del textField
            tfItem.selectAll();

            //Seteo el foco en el textField
            tfItem.requestFocus();
        }
    }

    private class EscuchaVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Oculto...");
            setVisible(false);

            System.out.println("Libero...");
            dispose();

            System.out.println("Bye bye ...");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
}
