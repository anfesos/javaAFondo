package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;
import java.awt.event.*;

public class DemoListener6 extends Frame {

    private TextField tf;
    private Label lab;

    public DemoListener6(){
        super("Key Listener");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new Label("Ingrese Text: "));

        tf = new TextField(15);
        add(tf);

        lab=new Label();
        add(lab);

        //Agrego los listener al textfield
        tf.addActionListener(new EscucharEnter());
        tf.addKeyListener(new EscucharTecla());

        setSize(350,100);
        setVisible(true);

        //Mando el cursor al textField
        tf.requestFocus();

        addWindowListener(new EscucharVentana());
    }

    private class EscucharEnter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            //Tomo el texto ingresado en el textField
            String texto = tf.getText();

            //Lo seteo como texto en el label
            lab.setText(texto);

            //refresco los componentes de la ventana
            validate();

            //Combierto a mayuscula el texto del textfield
            tf.setText(texto.toUpperCase());

            //Lo selecciono _todo
            tf.selectAll();
        }
    }

    private class EscucharTecla implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

            //Por cada tecla presionada tomo el caracter
            char c = e.getKeyChar();

            //Seteo el caracter como texto del label
            lab.setText(Character.toString(c));

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class EscucharVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
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

    public static void main(String[] args) {
        DemoListener6 dm = new DemoListener6();
    }
}
