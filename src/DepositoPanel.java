import javax.swing.*;
import java.awt.*;

public class DepositoPanel extends JPanel {
    public DepositoPanel(BancoDelBuho frame) {
        setLayout(new BorderLayout());
        JTextField depositoField = new JTextField(10);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Cantidad a depositar:"));
        inputPanel.add(depositoField);
        add(inputPanel, BorderLayout.CENTER);

        JButton okButton = new JButton("OK");
        inputPanel.add(okButton);

        JButton menuButton = new JButton("Menú");
        add(menuButton, BorderLayout.SOUTH);

        okButton.addActionListener(e -> {
            try {
                double deposito = Double.parseDouble(depositoField.getText());
                frame.setSaldo(frame.getSaldo() + deposito);
                JOptionPane.showMessageDialog(frame, "Depósito exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                depositoField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Entrada no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        menuButton.addActionListener(e -> frame.showCard("Menu"));
    }
}
