package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDashboard extends JFrame {
    private JButton signOutButton;
    private JButton physicalRentalsButton;
    private JButton requestBookButton;
    private JButton newsletterButton;

    public StudentDashboard() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Student Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize buttons
        signOutButton = new JButton("Sign out");
        physicalRentalsButton = new JButton("Physical Rentals");
        requestBookButton = new JButton("Request a book");
        newsletterButton = new JButton("Newsletter");

        // Sign out action
        signOutButton.addActionListener(e -> signOut());

        // Navigate to Physical Rentals screen
        physicalRentalsButton.addActionListener(e -> navigateToPhysicalRentals());

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3));
        buttonsPanel.add(physicalRentalsButton);
        buttonsPanel.add(requestBookButton);
        buttonsPanel.add(newsletterButton);

        // South panel with Sign out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(signOutButton);

        add(buttonsPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void signOut() {
        dispose(); // Dispose the current dashboard
        UserLogin loginScreen = new UserLogin(); // Open the login screen
        loginScreen.setVisible(true);
    }

    private void navigateToPhysicalRentals() {
        dispose(); // Dispose the current dashboard
        StudentPhysicalItemScreen physicalItemScreen = new StudentPhysicalItemScreen(); // Open the physical item screen
        physicalItemScreen.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new StudentDashboard().setVisible(true));
    }
}
