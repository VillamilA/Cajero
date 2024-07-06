import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {
    private JRadioButton verSaldoRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton retirarRadioButton;
    private JRadioButton salirRadioButton;
    private JButton continuarButton;
    private JPanel JPanelmenu;

public menu(){
    super("ESCOJA UNA OPCION");
    setContentPane(JPanelmenu);


    continuarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

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
