package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;

public class Ventana3 extends Frame {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    public Ventana3(){

        super("Esta es la ventana 3");
        setLayout(new GridLayout(3,3));

        b1 = new Button("Boton 1");
        add(b1);

        b2 = new Button("Boton 2");
        add(b2);

        b3 = new Button("Boton 3");
        add(b3);

        b4 = new Button("Boton 4");
        add(b4);

        b5 = new Button("Boton 5");
        add(b5);

        b6 = new Button("Boton 6");
        add(b6);

        b7 = new Button("Boton 7");
        add(b7);

        b8 = new Button("Boton 8");
        add(b8);

        b9 = new Button("Boton 9");
        add(b9);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana3 v3 = new Ventana3();
    }
}
