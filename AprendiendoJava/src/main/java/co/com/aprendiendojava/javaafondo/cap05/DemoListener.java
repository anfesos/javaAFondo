package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoListener extends Frame {

    private Button boton;

    public DemoListener(){
        super("Demo");
        setLayout(new FlowLayout());

        boton = new Button("Boton");

        //Agrego un listener al boton
        boton.addActionListener(new EscuchaBoton());

        add(boton);

        setSize(200,150);
        setVisible(true);
    }

    private class EscuchaBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //dimensión de la ventana
            Dimension dimVentana = getSize();

            //Dimensión de la pantalla
            Dimension dimScreen = getToolkit().getScreenSize();

            //Nuevas coordenadas (aleatorias) para reubicar la ventana
            int x = (int)(Math.random()*(dimScreen.width-dimVentana.width));

            int y = (int)(Math.random()*(dimScreen.height-dimVentana.height));

            //Cambio la ubicación de la ventana
            setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new DemoListener();
    }
}
