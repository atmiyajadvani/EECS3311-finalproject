package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Payment_info


public class PayWithDebitScreen extends JFrame {
    private JLabel totalPriceLabel;
    private JTextField cardholderNameField;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JTextField expirationDateField;

    public PayWithDebitScreen() {
        setTitle("Checkout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        totalPriceLabel = new JLabel("Total Price: $0.00");

        JLabel cardholderNameLabel = new JLabel("Cardholder's Name:");
        cardholderNameField = new JTextField();

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField();

        JLabel expirationDateLabel = new JLabel("Expiration Date (MM/YYYY):");
        expirationDateField = new JTextField();

        JButton processButton = new JButton("Process Payment");
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processPayment();
            }
        });

        JPanel mainPanel = new JPanel(new GridLayout(6, 2));
        mainPanel.add(totalPriceLabel);
        mainPanel.add(new JLabel()); // Spacer
        mainPanel.add(cardholderNameLabel);
        mainPanel.add(cardholderNameField);
        mainPanel.add(cardNumberLabel);
        mainPanel.add(cardNumberField);
        mainPanel.add(cvvLabel);
        mainPanel.add(cvvField);
        mainPanel.add(expirationDateLabel);
        mainPanel.add(expirationDateField);

        add(mainPanel, BorderLayout.CENTER);
        add(processButton, BorderLayout.SOUTH);
    }

    private void processPayment() {
        // Get the entered card details
        String cardholderName = cardholderNameField.getText();
        String cardNumber = cardNumberField.getText();
        String cvv = cvvField.getText();
        String expirationDate = expirationDateField.getText();

        // Replace this with the actual calculation of the total price based on items in the cart
        double totalPrice = calculateTotalPrice();

        // Display a message with the total price and card details
        String message = "Total Price: $" + String.format("%.2f", totalPrice) + "\n\nCardholder's Name: " +
                cardholderName + "\nCard Number: " + cardNumber + "\nCVV: " + cvv +
                "\nExpiration Date: " + expirationDate;
        JOptionPane.showMessageDialog(this, message, "Payment Details", JOptionPane.INFORMATION_MESSAGE);
    }

    private double calculateTotalPrice() {
        // Replace this with the actual calculation of the total price based on items in the cart
        // For simplicity, let's assume the total price is $100.00
        return 100.00;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PayWithDebitScreen().setVisible(true);
            }
        });
    }
}