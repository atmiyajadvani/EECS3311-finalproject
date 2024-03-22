package UI;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentTextbooksScreen extends JFrame {
    private JButton signOutButton;
    private JTextField inputTextField;
    private JList<Item> itemList;
    static private int userId;
    private DefaultListModel<Item> itemListModel;

    public StudentTextbooksScreen(int userId) {
        this.userId = userId;
        setTitle("Student Textbooks");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeUI();
    }

    private void initializeUI() {
        // Title panel with Student Textbooks title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Student Textbooks");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // Create a list model to hold user information and textbooks
        itemListModel = new DefaultListModel<>();

        // Create a JList with the list model
        itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemRenderer());
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        itemList.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPane = new JScrollPane(itemList);

        // South panel with Sign Out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signOutButton = new JButton("Sign out");
        signOutButton.addActionListener(e -> signOut());
        southPanel.add(signOutButton);

        // Button for adding a course
        JButton addCourseButton = new JButton("Add Course");
        addCourseButton.addActionListener(e -> addCourse());
        southPanel.add(addCourseButton);

        // Create a panel to hold the JList
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add titlePanel, centerPanel, and southPanel to the NORTH, CENTER, and SOUTH
        // regions respectively
        add(titlePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
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
                    FileWriter writer = new FileWriter("src/UI/VirtualCopies.csv", true); // Append mode
                    writer.append(userId + "," + courseCode + "," + textbook + "\n"); // Assuming userId is unique per
                                                                                      // user
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
        // Create a new Item with user information and button
        Item newItem = new Item("User ID: " + userId + " - Course Code: " + courseCode + " - Textbook: " + textbook);
        newItem.getViewButton().addActionListener(e -> {
            // Handle the action when "View Virtual Copy" button is clicked
            ImageIcon icon = new ImageIcon(getClass().getResource("src/UI/VirtualCopiesDemo.png")); // Replace
                                                                                                    // "/path/to/your/image.png"
                                                                                                    // with the correct
                                                                                                    // path to your PNG
                                                                                                    // file
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(this, label, "View Virtual Copy", JOptionPane.PLAIN_MESSAGE);
        });

        // Add the new item to the list model
        itemListModel.addElement(newItem);
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

    private String getTextbookForCourse(String courseCode) {
        String textbook = "N/A"; // Default value if no textbook found
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    textbook = parts[1].trim(); // Assuming the textbook is in the second column of
                                                // TextbookSpreadsheet.csv
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textbook;
    }

    // Inner class representing a user
    private static class User {
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

    // Inner class representing an item in the list
    private static class Item {
        private String userInfo;
        private JButton viewButton;

        public Item(String userInfo) {
            this.userInfo = userInfo;
            this.viewButton = new JButton("View Virtual Copy");
        }

        public String getUserInfo() {
            return userInfo;
        }

        public JButton getViewButton() {
            return viewButton;
        }

        @Override
        public String toString() {
            return userInfo;
        }
    }

    // Custom cell renderer for the JList
    private static class ItemRenderer extends JPanel implements ListCellRenderer<Item> {
        private JLabel label;
        private JButton button;

        public ItemRenderer() {
            setLayout(new BorderLayout());
            label = new JLabel();
            add(label, BorderLayout.CENTER);

            button = new JButton("View Virtual Copy");
            button.addActionListener(e -> {
                // Handle the action when the button is clicked
                Item item = (Item) ((JButton) e.getSource()).getClientProperty("item");
                if (item != null) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("src/UI/VirtualCopiesDemo.png"));
                    JLabel imageLabel = new JLabel(icon);
                    JOptionPane.showMessageDialog(null, imageLabel, "View Virtual Copy", JOptionPane.PLAIN_MESSAGE);
                }
            });
            add(button, BorderLayout.EAST);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Item> list, Item item, int index,
                boolean isSelected, boolean cellHasFocus) {
            label.setText(item.getUserInfo());
            button.putClientProperty("item", item);

            return this;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            StudentTextbooksScreen textbooksScreen = new StudentTextbooksScreen(userId); // Dummy userId for testing
        });
    }
}
