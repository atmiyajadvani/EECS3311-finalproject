package UI;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        // Setup the UI
        setTitle("YorkU Library Management App - Student Dashboard");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // North panel with the title
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Student Dashboard"));
        add(northPanel, BorderLayout.NORTH);

        // Center panel with the buttons
        JPanel centerPanel = new JPanel(new GridLayout(3, 1));

        JButton physicalRentalsButton = new JButton("Physical Rentals");
        physicalRentalsButton.addActionListener(e -> goToPhysicalItemSearch());
        centerPanel.add(physicalRentalsButton);

        JButton requestBookButton = new JButton("Request a book");
        requestBookButton.addActionListener(e -> goToRequestBookScreen());
        centerPanel.add(requestBookButton);

        JButton newsletterButton = new JButton("Newsletter");
        newsletterButton.addActionListener(e -> goToNewsletterScreen());
        centerPanel.add(newsletterButton);

        add(centerPanel, BorderLayout.CENTER);

        // South panel with the book list and sign out
        JPanel southPanel = new JPanel(new BorderLayout());
        String[] bookData = { // This data would actually come from your data source
                "Atomic Habits - Due: 24th April 2024",
                "Rich Dad Poor Dad - Due: 20th May 2024",
                "Atomic Habits - Due: 24th April 2024"
        };
        JList<String> bookList = new JList<>(bookData);
        southPanel.add(new JScrollPane(bookList), BorderLayout.CENTER);

        JButton signOutButton = new JButton("Sign out");
        signOutButton.addActionListener(e -> signOut());
        southPanel.add(signOutButton, BorderLayout.SOUTH);

        add(southPanel, BorderLayout.SOUTH);
    }

    private void goToPhysicalItemSearch() {
        // Implement navigation to PhysicalItemSearch
        System.out.println("Go to PhysicalItemSearch");
    }

    private void goToRequestBookScreen() {
        // Implement navigation to RequestBookScreen
        System.out.println("Go to RequestBookScreen");
    }

    private void goToNewsletterScreen() {
        // Implement navigation to NewsletterScreen
        System.out.println("Go to NewsletterScreen");
    }

    private void signOut() {
        // Implement sign out functionality
        System.out.println("Signing out");
        dispose();
        new UserLogin().setVisible(true); // This would show the login screen again
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}

// Below you would have the classes PhysicalItemSearch, RequestBookScreen, and NewsletterScreen.
// Each class would open a new window (JFrame) with the appropriate UI for the given task.

// Placeholder classes, they need to be implemented
class PhysicalItemSearch extends JFrame {
    // Code to initialize the UI for physical item search
}

class RequestBookScreen extends JFrame {
    // Code to initialize the UI for requesting a book
}

class NewsletterScreen extends JFrame {
    // Code to initialize the UI for the newsletter
}
