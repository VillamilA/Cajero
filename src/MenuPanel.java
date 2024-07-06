import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    public MenuPanel(BancoDelBuho frame) {
        setLayout(new GridLayout(4, 1));
        JButton saldoButton = new JButton("Ver Saldo");
        JButton retiroButton = new JButton("Retiro");
        JButton depositoButton = new JButton("Depósito");
        JButton salirButton = new JButton("Salir");

        add(saldoButton);
        add(retiroButton);
        add(depositoButton);
        add(salirButton);

        saldoButton.addActionListener(e -> frame.showCard("Saldo"));
        retiroButton.addActionListener(e -> frame.showCard("Retiro"));
        depositoButton.addActionListener(e -> frame.showCard("Deposito"));
        salirButton.addActionListener(e -> System.exit(0));
    }
}
