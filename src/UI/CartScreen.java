package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CartScreen extends JFrame {
    private List<String> cartItems;
    private DefaultListModel<String> cartListModel;
    private JTextField promoCodeTextField;
    private JLabel totalAmountLabel;


    public CartScreen(List<String> cartItems) {
        this.cartItems = cartItems;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Cart");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        cartListModel = new DefaultListModel<>();
        cartItems.forEach(cartListModel::addElement);

        JList<String> cartList = new JList<>(cartListModel);
        cartList.setFixedCellHeight(52);
        add(new JScrollPane(cartList), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(3, 1));
        JPanel promoPanel = new JPanel(new FlowLayout());
        promoCodeTextField = new JTextField(10);
        JButton applyButton = new JButton("Apply");
        promoPanel.add(new JLabel("Promo code"));
        promoPanel.add(promoCodeTextField);
        promoPanel.add(applyButton);

        JPanel totalPanel = new JPanel(new FlowLayout());
        totalAmountLabel = new JLabel("Current amount: $" + calculateTotalAmount());
        totalPanel.add(totalAmountLabel);

        JButton paymentButton = new JButton("Continue to payment");
        paymentButton.addActionListener(this::onPaymentClicked);

        bottomPanel.add(promoPanel);
        bottomPanel.add(totalPanel);
        bottomPanel.add(paymentButton);

        add(bottomPanel, BorderLayout.SOUTH);

        // Action listeners for the cart buttons
        applyButton.addActionListener(e -> applyPromoCode());
        // More action listeners for other buttons would go here
    }

    private void onPaymentClicked(ActionEvent e) {
        // Here you would handle the transition to the payment process
        JOptionPane.showMessageDialog(this, "Proceeding to payment");
    }

    private void applyPromoCode() {
        // Apply the promo code to the cart
        String promoCode = promoCodeTextField.getText();
        // You would have some logic here to adjust the price and recalculate the total amount
        // For demonstration, let's just print the entered promo code
        JOptionPane.showMessageDialog(this, "Promo code applied: " + promoCode);
        // Assuming a promo discount, update the total amount label
        totalAmountLabel.setText("Current amount: $" + calculateTotalAmountWithDiscount(promoCode));
    }

    private String calculateTotalAmount() {
        // Replace with real calculation logic
        return "45";
    }

    private String calculateTotalAmountWithDiscount(String promoCode) {
        // Replace with real calculation logic with promo code
        // Dummy discount logic for example
        if (promoCode.equalsIgnoreCase("SAVE10")) {
            return "40";  // Apply a $5 discount for this example
        }
        return calculateTotalAmount();
    }

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("String1", "String2", "String3", "String4", "String5");

        EventQueue.invokeLater(() -> {
            List<String> dummyCartItems = List.of(
                    "[book] Atomic Habits - $20",
                    "[magazine-9892] Tech Crunch Magazine - $15",
                    "[CD-1928] Demon Slayer Soundtrack - $10"
            ); // Dummy items for the cart
            new CartScreen(dummyCartItems).setVisible(true);
        });
    }
}
