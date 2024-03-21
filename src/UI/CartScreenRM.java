package UI;

import javax.swing.*;
import java.awt.*;

public class CartScreenRM extends JFrame {
    static private int userId;

    public CartScreenRM(int userId) {
        this.userId = userId;
        setTitle("Cart");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Cart Screen, UserID: " + userId);
        add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CartScreenRM cartScreenRM = new CartScreenRM(userId); // Pass any dummy userId for testing
            cartScreenRM.setVisible(true);
        });
    }
}
