import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accceso extends JFrame{
    private JPanel JPanelacceso;
    private JPasswordField passwordField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton eliminarButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton continuarButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton salirButton;
    private JButton a0Button;

    public accceso() {
        super("INGRESE SU CLAVE");
        setContentPane(JPanelacceso);
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            menu ventana_n = new menu();
            ventana_n.iniciar();
            dispose();
            }
        });

    }


    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
