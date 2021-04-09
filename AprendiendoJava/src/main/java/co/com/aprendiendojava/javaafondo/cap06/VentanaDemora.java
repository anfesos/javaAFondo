package co.com.aprendiendojava.javaafondo.cap06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDemora extends Frame {

    private Button button;
    private Choice combo;

    public VentanaDemora(){
        super("Ventana demora");

        setLayout(new FlowLayout());
        add(button = new Button("Esto se va a demorar ..."));
        button.addActionListener(new EscucharBoton());

        add(combo = new Choice());
        combo.addItem("Item 1");
        combo.addItem("Item 2");
        combo.addItem("Item 3");

        setSize(300,300);
        setVisible(true);
    }

    private class EscucharBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            //inhabilito el botón mientras dure el proceso
            button.setEnabled(false);

            //Instancio y lanzo el thread que lleva a cabo la tarea
            TareaBoton t = new TareaBoton();
            t.start();
        }
    }

    private class TareaBoton extends Thread{
        public void run(){
            try{
                Thread.sleep(10000);
                System.out.println("Termino la espera ...!");

                //Cuando finalizo la tarea vuelvo a habilitar el botón
                button.setEnabled(true);
            }catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }

    public static void main(String[] args) {
        new VentanaDemora();
    }

}
