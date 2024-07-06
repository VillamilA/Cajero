import javax.swing.*;
import java.awt.*;

public class RetiroPanel extends JPanel {
    public RetiroPanel(BancoDelBuho frame) {
        setLayout(new BorderLayout());
        JTextField retiroField = new JTextField(10);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Cantidad a retirar:"));
        inputPanel.add(retiroField);
        add(inputPanel, BorderLayout.CENTER);

        JButton okButton = new JButton("OK");
        inputPanel.add(okButton);

        JButton menuButton = new JButton("Menú");
        add(menuButton, BorderLayout.SOUTH);

        okButton.addActionListener(e -> {
            try {
                double retiro = Double.parseDouble(retiroField.getText());
                if (retiro <= frame.getSaldo()) {
                    frame.setSaldo(frame.getSaldo() - retiro);
                    JOptionPane.showMessageDialog(frame, "Retiro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
                }
                retiroField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Entrada no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        menuButton.addActionListener(e -> frame.showCard("Menu"));
    }
}
