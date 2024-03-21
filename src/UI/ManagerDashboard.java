package UI;

import javax.swing.*;
import java.awt.*;

public class ManagerDashboard extends JFrame {
    private JButton addItemButton;
    private JButton enableDisableItemButton;
    private JButton signOutButton;
    private static int userId;

    public ManagerDashboard() {
        this.userId = this.userId;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Manager Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button initialization
        addItemButton = new JButton("Add physical item");
        enableDisableItemButton = new JButton("Enable/disable physical item");
        signOutButton = new JButton("Sign out");

        // Command pattern conceptual application
        // Add Item Action
        addItemButton.addActionListener(e -> {
            dispose();
            // Command to navigate to AddItem screen
            new AddItem().setVisible(true);
        });

        // Enable/Disable Item Action
        enableDisableItemButton.addActionListener(e -> {
            dispose();
            // Command to navigate to EnableDisableItem screen
            new EnableDisableItem().setVisible(true);
        });

        // Sign Out Action
        signOutButton.addActionListener(e -> {
            dispose();
            // Command to sign out and show the login screen
            new UserLogin().setVisible(true);
        });

        // Layout setup
        JPanel optionsPanel = new JPanel(new GridLayout(1, 2));
        optionsPanel.add(addItemButton);
        optionsPanel.add(enableDisableItemButton);

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(signOutButton);

        add(optionsPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ManagerDashboard().setVisible(true)); // Using 0 for demonstration
    }
}
