package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FacultyDashboard extends JFrame {
    private JButton signOutButton;
    private JTextField inputTextField;
    private JTextArea userListTextArea;

    private int userId;

    public FacultyDashboard(int userId) { // Modify the constructor to accept the user ID
        this.userId = userId; // Store the user ID
        setTitle("Student Dashboard");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeUI();
    }
    public FacultyDashboard() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Faculty Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title panel with Faculty Dashboard title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Faculty Dashboard");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // Title label for the input box
        JLabel searchLabel = new JLabel("Search for a user:");
        searchLabel.setFont(new Font("Arial", Font.BOLD, 14));
        searchLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Panel for search components
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchPanel.add(searchLabel);
        inputTextField = new JTextField(15); // Adjust the size here
        inputTextField.setPreferredSize(new Dimension(150, inputTextField.getPreferredSize().height)); // Set preferred size
        searchPanel.add(inputTextField);

        // Create a text area for displaying user list and textbooks
        userListTextArea = new JTextArea();
        userListTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(userListTextArea);

        // South panel with Sign Out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signOutButton = new JButton("Sign out");
        signOutButton.addActionListener(e -> signOut());
        southPanel.add(signOutButton);

        // Create a panel to hold both searchPanel and userListTextArea
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(searchPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add titlePanel, centerPanel, and southPanel to the NORTH, CENTER, and SOUTH regions respectively
        add(titlePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        // Populate user list and textbooks
        populateUserList();
    }


    private void signOut() {
        dispose(); // Dispose the current dashboard
        UserLogin loginScreen = new UserLogin(); // Open the login screen
        loginScreen.setVisible(true);
    }

    private void populateUserList() {
        // Sample data: Two users with their textbooks
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John Doe", "Mathematics", new String[]{"Book 1", "Book 2"}));
        users.add(new User("Jane Smith", "Physics", new String[]{"Book 3", "Book 4"}));

        // Populate the text area with user list and textbooks
        for (User user : users) {
            userListTextArea.append("Name: " + user.getName() + " - Subject: " + user.getSubject() + "\n");
            for (String textbook : user.getTextbooks()) {
                userListTextArea.append("   Textbook: " + textbook + "\n");
            }
            userListTextArea.append("\n");
        }
    }

    // Inner class representing a user
    private class User {
        private String name;
        private String subject;
        private String[] textbooks;

        public User(String name, String subject, String[] textbooks) {
            this.name = name;
            this.subject = subject;
            this.textbooks = textbooks;
        }

        public String getName() {
            return name;
        }

        public String getSubject() {
            return subject;
        }

        public String[] getTextbooks() {
            return textbooks;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new FacultyDashboard().setVisible(true));
    }
}