package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosePaymentScreen extends JFrame {
    private JLabel cartLabel;
    private JRadioButton creditCardRadio;
    private JRadioButton debitCardRadio;
    private DefaultListModel<String> cartListModel;

    public ChoosePaymentScreen(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;

        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        int itemsInCart = cartListModel.size();

        cartLabel = new JLabel("Items in Cart: " + itemsInCart);

        creditCardRadio = new JRadioButton("Credit Card");
        debitCardRadio = new JRadioButton("Debit Card");

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(creditCardRadio);
        paymentGroup.add(debitCardRadio);

        JButton payButton = new JButton("Proceed to Pay");
        payButton.addActionListener(e -> proceedToPay(itemsInCart));

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(cartLabel);
        mainPanel.add(creditCardRadio);
        mainPanel.add(debitCardRadio);
        mainPanel.add(payButton);

        add(mainPanel, BorderLayout.CENTER);
    }

    private void proceedToPay(int itemsInCart) {
        String selectedPaymentMethod = getSelectedPaymentMethod();

        if (itemsInCart == getActualItemsInCart()) {
            if ("Credit Card".equals(selectedPaymentMethod) || "Debit Card".equals(selectedPaymentMethod)) {
                openPaymentScreen(selectedPaymentMethod);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid payment method selected.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: The number of items in the cart has changed.", "Payment Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int getActualItemsInCart() {
        return cartListModel.size();
    }

    private String getSelectedPaymentMethod() {
        if (creditCardRadio.isSelected()) {
            return "Credit Card";
        } else if (debitCardRadio.isSelected()) {
            return "Debit Card";
        } else {
            return "No payment method selected";
        }
    }

    private void openPaymentScreen(String paymentMethod) {
        if ("Credit Card".equals(paymentMethod) || "Debit Card".equals(paymentMethod)) {
            SwingUtilities.invokeLater(() -> {
                if ("Credit Card".equals(paymentMethod)) {
                    new PayWithDebitScreen().setVisible(true);
                } else {
                    new PayWithDebitScreen().setVisible(true);
                }
                this.dispose();
            });
        }
    }

    public static void main(String[] args) {
        // Example usage
        SwingUtilities.invokeLater(() -> {
            // For demonstration, create a model with some items
            DefaultListModel<String> cartListModel = new DefaultListModel<>();
            cartListModel.addElement("Item 1");
            cartListModel.addElement("Item 2");
            cartListModel.addElement("Item 3");

            new ChoosePaymentScreen(cartListModel).setVisible(true);
        });
    }
}
