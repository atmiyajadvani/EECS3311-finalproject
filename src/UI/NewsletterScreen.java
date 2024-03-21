package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewsletterScreen extends JFrame {

    private JTextField searchTextField;

    public NewsletterScreen() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Newsletter");
        setSize(600, 400); // Set the window size
        setLocationRelativeTo(null); // Center the window on the screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close the window without stopping the application
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout for layout management

        // Search bar at the top
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search Newsletter:"));
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);

        // Newsletter list in the center
        JPanel newsletterListPanel = new JPanel();
        newsletterListPanel.setLayout(new BoxLayout(newsletterListPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(newsletterListPanel);
        addNewsletterRows(newsletterListPanel);

        // Back button at the bottom
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            dispose();
            new StudentDashboard().setVisible(true); // Go back to the student dashboard
        });
        bottomPanel.add(backButton);

        // Add all the panels to the frame
        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void addNewsletterRows(JPanel panel) {
        String[] newsletters = {"NY Times", "Tech Crunch", "YCombinator"};
        for (String newsletter : newsletters) {
            panel.add(createNewsletterRow(newsletter));
        }
    }

    private JPanel createNewsletterRow(String newsletterName) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel(newsletterName);
        nameLabel.setPreferredSize(new Dimension(100, 30)); // Ensure that the label is wide enough
        JButton viewButton = new JButton("View");
        JButton subscribeButton = new JButton("Subscribe");
        JButton unsubscribeButton = new JButton("Unsubscribe");

        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(viewButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(subscribeButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(unsubscribeButton);

        return panel; // Return the complete row
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NewsletterScreen().setVisible(true));
    }
}
