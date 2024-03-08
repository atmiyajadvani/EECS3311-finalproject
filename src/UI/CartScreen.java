package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CartScreen extends JFrame {
    private DefaultListModel<String> cartListModel;
    private JList<String> cartList;
    private JTextField promoCodeField;
    private JLabel totalAmountLabel;
    private float totalAmount = 45.0f; // Example starting amount

    public CartScreen(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;
        setTitle("YorkU Library Management App - Cart");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cartList = new JList<>(this.cartListModel);
        cartList.setFixedCellHeight(70); // Increased cell height
        cartList.setCellRenderer(new CartListCellRenderer(cartListModel, this));

        JScrollPane scrollPane = new JScrollPane(cartList);
        add(scrollPane, BorderLayout.CENTER);

        promoCodeField = new JTextField(10);
        JButton applyPromoButton = new JButton("APPLY");
        applyPromoButton.addActionListener(this::applyPromoCode);

        JPanel promoPanel = new JPanel();
        promoPanel.add(new JLabel("Promo code"));
        promoPanel.add(promoCodeField);
        promoPanel.add(applyPromoButton);
        add(promoPanel, BorderLayout.NORTH);

        totalAmountLabel = new JLabel("Current amount: $" + String.format("%.2f", totalAmount));
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> goBack());

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(backButton);
        bottomPanel.add(totalAmountLabel);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void goBack() {
        this.dispose();
        // Assuming StudentPhysicalItemScreen is accessible and has a public constructor.
        new StudentPhysicalItemScreen().setVisible(true);
    }

    private void applyPromoCode(ActionEvent event) {
        // Example logic to apply a promo code
        if ("DISCOUNT10".equals(promoCodeField.getText())) {
            totalAmount *= 0.9; // Apply a 10% discount
            updateTotalAmount();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid promo code.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeFromCart(String item) {
        cartListModel.removeElement(item);
        updateTotalAmount();
    }

    private void updateTotalAmount() {
        // Update the total amount label; replace this with real calculation logic
        totalAmountLabel.setText("Current amount: $" + String.format("%.2f", totalAmount));
    }

    private static class CartListCellRenderer extends JPanel implements ListCellRenderer<String> {
        private final DefaultListModel<String> model;
        private final JFrame frame;

        CartListCellRenderer(DefaultListModel<String> model, JFrame frame) {
            this.model = model;
            this.frame = frame;
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            setLayout(new BorderLayout(10, 10));
            setBackground(isSelected ? Color.LIGHT_GRAY : Color.WHITE);

            JTextArea itemLabel = new JTextArea(value);
            itemLabel.setWrapStyleWord(true);
            itemLabel.setLineWrap(true);
            itemLabel.setEditable(false);
            JButton removeButton = new JButton("Remove");
            removeButton.addActionListener(e -> {
                model.removeElementAt(index);
                ((CartScreen)frame).updateTotalAmount();
            });

            add(itemLabel, BorderLayout.CENTER);
            add(removeButton, BorderLayout.EAST);
            return this;
        }
    }

    public static void main(String[] args) {
        // For demonstration, create a model with some items
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Atomic Habits by James Clear | Book");
        model.addElement("Tech Crunch Magazine | Magazine");
        model.addElement("Demon Slayer - A Mega Saga | CD");

        EventQueue.invokeLater(() -> new CartScreen(model).setVisible(true));
    }
}
