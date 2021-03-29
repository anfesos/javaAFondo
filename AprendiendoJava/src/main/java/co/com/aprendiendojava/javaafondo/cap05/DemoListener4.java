package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DemoListener4 extends Frame {

    public DemoListener4(){
        super("Demo");

        //relaciono un windowListener con el Frame
        addWindowListener(new EscuchaVentana());

        setSize(200,150);
        setVisible(true);
    }

    private class EscuchaVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

            //Para cerrar la ventana y finalizar el programa
            //Correctamente son tres pasos:
            /*
                1- Ocultar la ventana con setVisible(false)
                2- Liberarla con el metodo dispose
                3- finalizar la aplicación con System.exit
             */

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

    public static void main(String[] args) {
        new DemoListener4();
    }
}
