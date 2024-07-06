import javax.swing.*;
import java.awt.*;

public class BancoDelBuho extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private double saldo = 200.00;

    public BancoDelBuho() {
        setTitle("Banco del Búho");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        WelcomePanel welcomePanel = new WelcomePanel(this);
        MenuPanel menuPanel = new MenuPanel(this);
        SaldoPanel saldoPanel = new SaldoPanel(this);
        RetiroPanel retiroPanel = new RetiroPanel(this);
        DepositoPanel depositoPanel = new DepositoPanel(this);

        mainPanel.add(welcomePanel, "Welcome");
        mainPanel.add(menuPanel, "Menu");
        mainPanel.add(saldoPanel, "Saldo");
        mainPanel.add(retiroPanel, "Retiro");
        mainPanel.add(depositoPanel, "Deposito");

        add(mainPanel);
    }

    public void showCard(String card) {
        cardLayout.show(mainPanel, card);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
