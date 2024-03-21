package UI;

import javax.swing.*;
import java.awt.*;

public class ChoosePaymentScreen extends JFrame {
    private JLabel cartLabel;
    private JRadioButton creditCardRadio;
    private JRadioButton debitCardRadio;
    private JRadioButton paypalRadio;

    public ChoosePaymentScreen() {
        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        cartLabel = new JLabel("Items in Cart: 0");

        creditCardRadio = new JRadioButton("Credit Card");
        debitCardRadio = new JRadioButton("Debit Card");
        paypalRadio = new JRadioButton("PayPal");

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(creditCardRadio);
        paymentGroup.add(debitCardRadio);
        paymentGroup.add(paypalRadio);

        JButton payButton = new JButton("Proceed to Pay");
        payButton.addActionListener(e -> proceedToPay());

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(cartLabel);
        mainPanel.add(creditCardRadio);
        mainPanel.add(debitCardRadio);
        mainPanel.add(paypalRadio);

        add(mainPanel, BorderLayout.CENTER);
        add(payButton, BorderLayout.SOUTH);
    }

    private void proceedToPay() {
        // The selected payment method determines the payment strategy.
        String selectedPaymentMethod = getSelectedPaymentMethod();
        // Strategy chosen based on the selected payment method
        // Each payment method could have different processing logic encapsulated in its strategy
        // For simplification, displaying the chosen method:
        JOptionPane.showMessageDialog(this,
                "Items in Cart: " + "5" + "\nSelected Payment Method: " + selectedPaymentMethod,
                "Payment Details",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private String getSelectedPaymentMethod() {
        // This method essentially acts as a strategy selector based on the user's choice
        if (creditCardRadio.isSelected()) {
            return "Credit Card";
        } else if (debitCardRadio.isSelected()) {
            return "Debit Card";
        } else if (paypalRadio.isSelected()) {
            return "PayPal";
        } else {
            return "No payment method selected";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChoosePaymentScreen().setVisible(true));
    }
}
