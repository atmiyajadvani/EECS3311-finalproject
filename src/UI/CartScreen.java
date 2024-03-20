package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CartScreen extends JFrame {
    private DefaultListModel<String> cartListModel;
    private JList<String> cartList;
    private JTextField promoCodeField;
    private JLabel totalAmountLabel;
    private float totalAmount; // Assuming this value will be computed dynamically

    public CartScreen(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;
        this.totalAmount = totalAmount;

        setTitle("YorkU Library Management App - Cart");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cart list configuration
        cartList = new JList<>(this.cartListModel);
        cartList.setCellRenderer(new CartListCellRenderer());
        JScrollPane scrollPane = new JScrollPane(cartList);

        // Promo code panel
        JPanel promoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        promoCodeField = new JTextField(10);
        JButton applyPromoButton = new JButton("APPLY");
        applyPromoButton.addActionListener(this::applyPromoCode);
        promoPanel.add(new JLabel("Promo code"));
        promoPanel.add(promoCodeField);
        promoPanel.add(applyPromoButton);

        // Total amount label
        totalAmountLabel = new JLabel("Current amount: $" + String.format("%.2f", totalAmount));

        // Continue to payment button
        JButton paymentButton = new JButton("Continue to payment");
        paymentButton.addActionListener(e -> navigateToPaymentScreen());

        // Bottom panel configuration
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.add(promoPanel);
        bottomPanel.add(totalAmountLabel);
        bottomPanel.add(paymentButton);

        // Add panels to the frame
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void applyPromoCode(ActionEvent event) {
        // Implement promo code application logic here
    }

    private void navigateToPaymentScreen() {
        // Implement navigation to payment screen logic here
    }

    private class CartListCellRenderer extends JPanel implements ListCellRenderer<String> {
        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            setLayout(new BorderLayout(10, 10));
            setBackground(Color.WHITE);

            JTextArea itemLabel = new JTextArea(value);
            itemLabel.setEditable(false);
            JButton removeButton = new JButton("Remove");
            removeButton.addActionListener(e -> removeItemFromCart(index));

            add(itemLabel, BorderLayout.CENTER);
            add(removeButton, BorderLayout.EAST);

            return this;
        }
    }

    private void removeItemFromCart(int index) {
        // Implement item removal logic here
    }

    public static void main(String[] args) {
        // For demonstration, create a model with some items
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("[magazine-9892] Tech Crunch Magazine | ID: 1233 | Location: Scott Library | Purchase from online store");
        model.addElement("[CD-1928] Demon Slayer - A Mega Saga | ID: 1233 | Location: Scott Library | Purchase from online store");

        // Example usage
        SwingUtilities.invokeLater(() -> new CartScreen(model).setVisible(true));
    }
}