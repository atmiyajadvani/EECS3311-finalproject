package UI;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FacultyDashboard extends JFrame {
    private JButton signOutButton;
    private JTextField inputTextField;
    private JTextArea userListTextArea;

    static private int userId;

    public FacultyDashboard(int userId) {
        this.userId = userId;
        setTitle("Faculty Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initializeUI();
    }

    private void initializeUI() {
        // Title panel with Faculty Dashboard title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Faculty Dashboard");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        /**
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
        */
        // Create a text area for displaying user list and textbooks
        userListTextArea = new JTextArea();
        userListTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(userListTextArea);

        // South panel with Sign Out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signOutButton = new JButton("Sign out");
        signOutButton.addActionListener(e -> signOut());
        southPanel.add(signOutButton);

        // Button for adding a course
        JButton addCourseButton = new JButton("Add Course");
        addCourseButton.addActionListener(e -> addCourse());
        southPanel.add(addCourseButton);

        // Create a panel to hold both searchPanel and userListTextArea
        JPanel centerPanel = new JPanel(new BorderLayout());
        //centerPanel.add(searchPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add titlePanel, centerPanel, and southPanel to the NORTH, CENTER, and SOUTH regions respectively
        add(titlePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        // Populate user list and textbooks
        //populateUserList();
    }

    private void signOut() {
        dispose(); // Dispose the current dashboard
        UserLogin loginScreen = new UserLogin(); // Open the login screen
        loginScreen.setVisible(true);
    }

    private void addCourse() {
        String courseCode = JOptionPane.showInputDialog(this, "Enter course code:");
        if (courseCode != null && !courseCode.isEmpty()) {
            if (isCourseCodeValid(courseCode)) {
                String textbook = getTextbookForCourse(courseCode); // Get the textbook for the course
                try {
                    FileWriter writer = new FileWriter("src/UI/FacultyUsers.csv", true); // Append mode
                    writer.append(userId + "," + courseCode + "," + textbook + "\n"); // Assuming userId is unique per user
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Course added successfully!");
                    // Update the user list after adding the course
                    updateUserList(courseCode, textbook);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error adding course.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Course code does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid course code.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateUserList(String courseCode, String textbook) {
        // Append the new course and textbook information to the user list text area
        userListTextArea.append("Course Code: " + courseCode + "\n");
        userListTextArea.append("Textbook: " + textbook + "\n\n");
    }


    private boolean isCourseCodeValid(String courseCode) {
        boolean isValid = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    isValid = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isValid;
    }
    /**
    private void populateUserList() {
        // Initialize the list of users
        ArrayList<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("FacultyUsers.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String userId = parts[0].trim();
                String courseCode = parts[1].trim();
                String textbook = getTextbookForCourse(courseCode); // Get the textbook for the course

                User user = new User(userId, courseCode, textbook);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Populate the text area with user list and textbooks
        for (User user : users) {
            userListTextArea.append("User ID: " + user.getUserId() + " - Course Code: " + user.getCourseCode() + " - Textbook: " + user.getTextbook() + "\n");
        }
    }
    */
    // Method to get the textbook associated with a course code
    private String getTextbookForCourse(String courseCode) {
        String textbook = "N/A"; // Default value if no textbook found
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    textbook = parts[1].trim(); // Assuming the textbook is in the second column of TextbookList.csv
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textbook;
    }

    // Inner class representing a user
    private class User {
        private String userId;
        private String courseCode;
        private String textbook;

        public User(String userId, String courseCode, String textbook) {
            this.userId = userId;
            this.courseCode = courseCode;
            this.textbook = textbook;
        }

        public String getUserId() {
            return userId;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getTextbook() {
            return textbook;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new FacultyDashboard(userId).setVisible(true));
    }
}
