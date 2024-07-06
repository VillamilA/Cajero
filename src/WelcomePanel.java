import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    private JTextField passwordField;
    private JButton okButton;
    private final String CORRECT_PASSWORD = "1234";

    public WelcomePanel(BancoDelBuho frame) {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Bienvenido al Banco del Búho");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        passwordField = new JTextField(10);
        inputPanel.add(new JLabel("Password:"));
        inputPanel.add(passwordField);
        okButton = new JButton("OK");
        inputPanel.add(okButton);
        add(inputPanel, BorderLayout.CENTER);

        okButton.addActionListener(e -> {
            if (passwordField.getText().equals(CORRECT_PASSWORD)) {
                frame.showCard("Menu");
            } else {
                JOptionPane.showMessageDialog(frame, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                passwordField.setText("");
            }
        });
    }
}
