package UI;

import javax.swing.*;
import java.awt.*;

public class ManagerDashboard extends JFrame {
    private JButton addItemButton;
    private JButton enableDisableItemButton;
    private JButton signOutButton;

    public ManagerDashboard() { initializeUI(); }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Manager Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize buttons
        addItemButton = new JButton("Add physical item");
        enableDisableItemButton = new JButton("Enable/disable physical item");
        signOutButton = new JButton("Sign out");

        // Navigate to Add Item screen
        addItemButton.addActionListener(e -> navigateToAddItem());
        // Navigate to Enable/Disable Item screen
        enableDisableItemButton.addActionListener(e -> navigateToEnableDisableItem());

        // Sign out action
        signOutButton.addActionListener(e -> signOut());

        // Options panel
        JPanel optionsPanel = new JPanel(new GridLayout(1, 2));
        optionsPanel.add(addItemButton);
        optionsPanel.add(enableDisableItemButton);

        // South panel with Sign out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(signOutButton);

        add(optionsPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void navigateToAddItem() {
        dispose(); // close current frame
        new AddItem().setVisible(true);
    }

    private void navigateToEnableDisableItem() {
        dispose(); // close current frame
        new EnableDisableItem().setVisible(true);
    }

    private void signOut() {
        dispose(); // close current frame
        new UserLogin().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ManagerDashboard().setVisible(true));
    }
}