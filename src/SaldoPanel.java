import javax.swing.*;
import java.awt.*;

public class SaldoPanel extends JPanel {
    private JLabel saldoLabel;

    public SaldoPanel(BancoDelBuho frame) {
        setLayout(new BorderLayout());
        saldoLabel = new JLabel("Saldo: $" + frame.getSaldo());
        saldoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(saldoLabel, BorderLayout.CENTER);

        JButton menuButton = new JButton("Menú");
        add(menuButton, BorderLayout.SOUTH);

        menuButton.addActionListener(e -> frame.showCard("Menu"));
    }

    public void updateSaldo(double saldo) {
        saldoLabel.setText("Saldo: $" + saldo);
    }
}
