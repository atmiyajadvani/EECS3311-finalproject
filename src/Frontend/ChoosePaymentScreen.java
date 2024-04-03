package Frontend;

import Backend.Item;
import Backend.PaymentOptions;
import Backend.ItemHandler;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ChoosePaymentScreen extends JFrame {
    private JLabel totalPriceLabel;
    private List<Item> cartItems;
    private int userID;
    private JTextField promoCodeField;
    private PaymentOptions OptionsToPay;
    private double totalPrice ;


    public ChoosePaymentScreen(int userID) {
        this.userID = userID;
        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        OptionsToPay = new PaymentOptions();

        totalPriceLabel = new JLabel("Total Price: $0.0");
//        totalPriceLabel = new JLabel("Total Price: $" + String.format("%.2f", OptionsToPay.calculateTotalPrice(cartItems)));
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
                navigateToPayWithDebitScreen();
            }
        });

        debitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPayWithDebitScreen();
            }
        });

        paypalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPayWithDebitScreen();
            }
        });

        JPanel promoCodePanel = new JPanel();
        promoCodePanel.add(new JLabel("Promo code:"));
        promoCodePanel.add(promoCodeField);

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(totalPriceLabel);
        mainPanel.add(promoCodePanel);
        mainPanel.add(paymentOptionsPanel);
        cartItems = new ArrayList<>();

        add(mainPanel, BorderLayout.CENTER);
    }

    private void navigateToPayWithDebitScreen() {
        double discountedPrice = OptionsToPay.applyPromo(this.totalPrice, promoCodeField.getText().trim());
        totalPriceLabel.setText("Total Price: $" + String.format("%.2f", discountedPrice));

        PayWithDebitScreen debitScreen = new PayWithDebitScreen(userID, discountedPrice);
        debitScreen.setCartItems(cartItems); // Pass the cart items to the PayWithDebitScreen
        debitScreen.setVisible(true);
        this.setVisible(false); // Hide the ChoosePaymentScreen
    }


    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
        this.totalPrice = OptionsToPay.calculateTotalPrice(cartItems);
        totalPriceLabel.setText("Total Price: $" + String.format("%.2f", totalPrice));

    }
}
