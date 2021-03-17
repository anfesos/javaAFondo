package co.com.aprendiendojava.javaafondo.cap05;

import javax.swing.border.Border;
import java.awt.*;

public class Chat extends Frame {

    private TextField tfNick;
    private TextField tfMensaje;
    private Button bLogin;
    private Button bLogout;
    private Button bEnviar;
    private List lstLog;

    public Chat(){
        super("Chat");
        setLayout(new BorderLayout());

        //Panel norte
        Panel pNorth = _crearPNorte();
        add(pNorth,BorderLayout.NORTH);

        //Panel Central
        Panel pCentral = _crearPCentral();
        add(pCentral,BorderLayout.CENTER);

        //Panel sur
        Panel pSouth = _crearPSur();
        add(pSouth,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
    }

    private Panel _crearPSur() {

        Panel p = new Panel(new BorderLayout());

        //Oeste
        p.add(new Label("Mensaje:"), BorderLayout.WEST);

        //Centro
        tfMensaje = new TextField();
        p.add(tfMensaje,BorderLayout.CENTER);

        //Este
        bEnviar = new Button("Enviar");
        p.add(bEnviar,BorderLayout.EAST);

        return p;
    }

    private Panel _crearPCentral() {

        Panel p = new Panel(new BorderLayout());

        //norte
        p.add(new Label("Conversación:"),BorderLayout.NORTH);
        //Centro
        lstLog = new List();
        p.add(lstLog,BorderLayout.CENTER);

        return p;
    }

    private Panel _crearPNorte() {

        Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
        p.add(new Label("Nick:"));

        tfNick = new TextField(10);
        p.add(tfNick);

        bLogin = new Button("Login");
        p.add(bLogin);

        bLogout = new Button("Logout");
        p.add(bLogout);

        return p;
    }

    public static void main(String[] args) {
        Chat c = new Chat();
    }
}
