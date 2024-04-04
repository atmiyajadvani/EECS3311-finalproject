package Frontend;

import Backend.ItemHandler;
import Backend.Item;
import Backend.CartScreenBackEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CartScreen extends JFrame {
    private CartScreenBackEnd backend;
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JScrollPane scrollPane;
    private JButton backButton;
    private JButton checkoutButton;
    private JTextField promoCodeField;
    private JButton promoCodeButton;
    private ChoosePaymentScreen paymentScreen;
    private List<Item> cartItems;
    private static int userId;
    private static final String CSV_FILE_PATH = "src/Database/userIdtoCart.csv";


    public CartScreen(int userId) {
        this.userId = userId;
        backend = new CartScreenBackEnd();

        setTitle("Cart Screen");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });
        topPanel.add(backButton);

        middlePanel = new JPanel();
        middlePanel.setBackground(Color.WHITE);
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));

        bottomPanel = new JPanel();
        checkoutButton = new JButton("Checkout");

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (backend.canRentMoreItems(userId)) {
                    goToPaymentScreen();
                } else {
                    JOptionPane.showMessageDialog(getParent(), "You have more than 10 items currently rented.");
                }
            }
        });

        bottomPanel.add(new JLabel("Enter promo code: "));
        bottomPanel.add(checkoutButton);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        cartItems = backend.loadCartItems(userId);
        paymentScreen = new ChoosePaymentScreen(userId);
        refreshCartView();
    }

    private void refreshCartView() {
        middlePanel.removeAll();
        for (Item item : cartItems) {
            JLabel label = new JLabel(item.toString());
            label.setFont(label.getFont().deriveFont(Font.PLAIN, 16));
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            middlePanel.add(label);
            middlePanel.add(Box.createVerticalStrut(10));
        }
        middlePanel.revalidate();
        middlePanel.repaint();
    }

    private void goBack() {
        String role = backend.getUserRole(userId);
        switch (role.toLowerCase()) {
            case "student":
            case "visitor":
                new StudentDashboard(userId).setVisible(true);
                break;
            case "faculty":
            case "staff":
                new FacultyDashboard(userId).setVisible(true);
                break;
            case "manager":
                new ManagerDashboard(userId).setVisible(true);
                break;
            default:
                // Handle unknown role
                break;
        }
        this.dispose(); // Close the current window after navigating back
    }

    private void goToPaymentScreen() {
        paymentScreen.setCartItems(cartItems);
        paymentScreen.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        CartScreen cartScreen = new CartScreen(userId);
        cartScreen.setVisible(true);
    }


    public void itemAddedToCart(Item item) {

        // Add the item to the cartItems list
        cartItems.add(item);
        // Refresh the cart view to reflect the changes
        refreshCartView();
        // Optionally, you may also save the cart items to the backend
        backend.setCartItems(cartItems);
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
        refreshCartView();
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

}
