package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FacultyDashboard extends JFrame {
    private JButton signOutButton;
    private JTextField inputTextField;
    private JTextArea userListTextArea;
    private ArrayList<User> users; // Declare the users list

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

        // Initialize the users list
        users = new ArrayList<>();

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
        //facultytextbooks, where the textbooks they pick go into the list
        // Read from CSV file and populate the user list
        try (BufferedReader reader = new BufferedReader(new FileReader("textbooks.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) { // Check for minimum required parts
                    String title = parts[1].trim();
                    String author = parts[3].trim();

                    // Create a formatted string for each textbook with title and author only
                    String textbookInfo = "Title: " + title + "\nAuthor: " + author + "\n";

                    userListTextArea.append(textbookInfo + "\n"); // Append the formatted string
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle file reading error
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