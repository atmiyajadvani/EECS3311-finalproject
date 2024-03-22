package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ChoosePaymentScreen extends JFrame {
    private JLabel totalPriceLabel;
    private List<StudentPhysicalItemScreen.Item> cartItems;
    private int userID;
    private JTextField promoCodeField;

    public ChoosePaymentScreen(int userID) {
        this.userID = userID;
        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        totalPriceLabel = new JLabel("Total Price: $0.00");
        totalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        promoCodeField = new JTextField(10);
        promoCodeField.setHorizontalAlignment(SwingConstants.CENTER);

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
                applyPromoAndOpenDebitCardPayment();
            }
        });

        debitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyPromoAndOpenDebitCardPayment();
            }
        });

        paypalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyPromoAndOpenDebitCardPayment();
            }
        });

        JPanel promoCodePanel = new JPanel();
        promoCodePanel.add(new JLabel("Promo code:"));
        promoCodePanel.add(promoCodeField);

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(totalPriceLabel);
        mainPanel.add(promoCodePanel);
        mainPanel.add(paymentOptionsPanel);

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

    private void applyPromoAndOpenDebitCardPayment() {
        String promoCode = promoCodeField.getText().trim();
        double discount = 0.0;
        if ("fo40".equals(promoCode)) {
            discount = 0.4; // 40% discount
        }

        double totalPrice = calculateTotalPrice() * (1 - discount);

        PayWithDebitScreen debitScreen = new PayWithDebitScreen(userID, totalPrice);
        debitScreen.setCartItems(cartItems); // Pass the cart items to the PayWithDebitScreen
        debitScreen.setVisible(true);
        this.setVisible(false); // Hide the ChoosePaymentScreen
    }
}
