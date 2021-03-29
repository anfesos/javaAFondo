package co.com.aprendiendojava.javaafondo.cap05;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class ChatSwing extends JFrame {

    private JTextField tfNick;
    private JTextField tfMensaje;
    private JButton bLogin;
    private JButton bLogout;
    private JButton bEnviar;
    private JList lsLog;
    private Border border;

    public ChatSwing(){
        super("Chat Swing");


        //pedimos el "panel de contención" al JFrame
        Container content = getContentPane();

        //Seteamos el layout
        content.setLayout(new BorderLayout());

        //Este será el tipo de borde que utilizaremos en todos los paneles
        border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        //Creamos el panel norte
        JPanel pNorth = _crearPNorte();
        content.add(pNorth,BorderLayout.NORTH);

        //Creamos el panel central
        JPanel pCenter = _crearPCenter();
        content.add(pCenter,BorderLayout.CENTER);

        //Creamos el panel sur
        JPanel pSouth = _crearPSur();
        content.add(pSouth,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
    }

    private JPanel _crearPSur() {
        JPanel p = new JPanel(new BorderLayout());

        TitledBorder titledBorder = BorderFactory.createTitledBorder(border,"Mensaje");
        p.setBorder(titledBorder);

        tfMensaje = new JTextField();
        p.add(tfMensaje,BorderLayout.CENTER);

        bEnviar = new JButton("Enviar");
        p.add(bEnviar, BorderLayout.EAST);

        return p;
    }

    private JPanel _crearPCenter() {
        JPanel p = new JPanel(new BorderLayout());

        TitledBorder titledBorder = BorderFactory.createTitledBorder(border,"Conversación");

        p.setBorder(titledBorder);

        lsLog = new JList();
        JScrollPane scroll = new JScrollPane(lsLog);
        p.add(scroll,BorderLayout.CENTER);

        return p;
    }

    private JPanel _crearPNorte() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        //Instancio un TitledBorder con el titulo y el objeto border que cree en el constructor
        TitledBorder titledBorder = BorderFactory.createTitledBorder(border,"Nick");

        //Asigno el titled border al panel
        p.setBorder(titledBorder);

        tfNick = new JTextField(10);
        p.add(tfNick);

        bLogin = new JButton("Login");
        p.add(bLogin);

        bLogout = new JButton("Logout");
        p.add(bLogout);

        return p;
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Cambiar el lookandFeel

        //UIManager.setLookAndFeel(new WindowsLookAndFeel());
        //UIManager.setLookAndFeel(new MotifLookAndFeel());
        //UIManager.setLookAndFeel(new MetalLookAndFeel());
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        ChatSwing c = new ChatSwing();
    }
}
