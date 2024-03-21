package UI;

import javax.swing.*;
import java.awt.*;

public class CartScreenRM extends JFrame {
    private static CartScreenRM instance; // Singleton instance
    static private int userId;

    CartScreenRM(int userId) {
        CartScreenRM.userId = userId;
        setTitle("Cart");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Cart Screen, UserID: " + userId);
        add(label, BorderLayout.CENTER);
    }

    // Static method to get the singleton instance
    public static CartScreenRM getInstance(int userId) {
        if (instance == null) {
            instance = new CartScreenRM(userId);
        }
        return instance;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            // Instead of directly creating a new instance, use getInstance() method
            CartScreenRM cartScreen = CartScreenRM.getInstance(userId); // Pass any dummy userId for testing
            cartScreen.setVisible(true);
        });
    }
}
