package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ChoosePaymentScreen extends JFrame {
    private JLabel totalPriceLabel;
    private List<StudentPhysicalItemScreen.Item> cartItems;

    public ChoosePaymentScreen() {
        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        totalPriceLabel = new JLabel("Total Price: $0.00");
        totalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton creditCardButton = new JButton("Credit Card");
        JButton debitCardButton = new JButton("Debit Card");
        JButton paypalButton = new JButton("PayPal");

        JPanel paymentOptionsPanel = new JPanel(new GridLayout(1, 3));
        paymentOptionsPanel.add(creditCardButton);
        paymentOptionsPanel.add(debitCardButton);
        paymentOptionsPanel.add(paypalButton);

        creditCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDebitCardPayment();
            }
        });

        debitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDebitCardPayment();
            }
        });

        paypalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDebitCardPayment();
            }
        });

        // JButton payButton = new JButton("Proceed to Pay");
        // payButton.addActionListener(e -> {
        // // Handle payment processing
        // });

        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        mainPanel.add(totalPriceLabel);
        mainPanel.add(paymentOptionsPanel);
        // mainPanel.add(payButton);

        add(mainPanel, BorderLayout.CENTER);
    }

    public void setCartItems(List<StudentPhysicalItemScreen.Item> cartItems) {
        this.cartItems = cartItems;
        updateTotalPriceLabel();
    }

    private void updateTotalPriceLabel() {
        double totalPrice = calculateTotalPrice();
        totalPriceLabel.setText("Total Price: $" + String.format("%.2f", totalPrice));
    }

    private double calculateTotalPrice() {
        double totalPrice = 0.0;
        if (cartItems != null) {
            for (StudentPhysicalItemScreen.Item item : cartItems) {
                totalPrice += item.getPrice();
            }
        }
        return totalPrice;
    }

    private void openDebitCardPayment() {
        PayWithDebitScreen debitScreen = new PayWithDebitScreen();
        debitScreen.setCartItems(cartItems); // Pass the cart items to the PayWithDebitScreen
        debitScreen.setTotalPrice(calculateTotalPrice()); // Pass the total price to the payment screen
        debitScreen.setVisible(true);
        this.setVisible(false); // Hide the ChoosePaymentScreen
    }
}