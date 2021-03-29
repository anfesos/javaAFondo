package co.com.aprendiendojava.javaafondo.cap05;

import java.awt.*;

public class Ventana1 extends Frame {
    //Defino tres objetos Button
    private Button b1,b2,b3;

    public Ventana1(){
        //El constructor del padre recibe el titulo de la ventana
        super("Esta es la ventana 1");

        //Defino el layout que va a tener la ventana: FlowLayout
        //setLayout(new FlowLayout()); //Valor por defecto centrado en la parte superior los objetos
        setLayout(new FlowLayout(FlowLayout.LEFT)); //Se cambia valor por defecto para alinear a la izquierda

        //Instancio el primer boton y lo agrego al container
        b1 = new Button("Boton 1");
        add(b1);

        b2 = new Button("Boton 2");
        add(b2);

        b3 = new Button("Boton 3");
        add(b3);

        //Defino el size de la ventana y la hago visible
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana1 v1 = new Ventana1();
    }
}
