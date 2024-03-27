package Frontend;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentTextbooksScreen extends JFrame {
    private JButton signOutButton;
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
        JList<Item> itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemListCellRenderer());
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        itemList.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPane = new JScrollPane(itemList);

        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList<?> list = (JList<?>) evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                if (index >= 0) {
                    StudentTextbooksScreen.Item selected = itemListModel.getElementAt(index);
                    System.out.println(selected);
                    showTextbook();
                }
            }
        });

        // South panel with Sign Out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signOutButton = new JButton("Sign out");
        signOutButton.addActionListener(e -> signOut());
        southPanel.add(signOutButton);

        // Button for adding a course
        JButton addCourseButton = new JButton("Add Course");
        addCourseButton.addActionListener(e -> addCourse());
        southPanel.add(addCourseButton);

        // Add Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> goBackToDashboard());
        southPanel.add(backButton);

        // Add titlePanel, centerPanel, and southPanel to the NORTH, CENTER, and SOUTH regions respectively
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    // Method to handle going back to the Student Dashboard
    private void goBackToDashboard() {
        dispose(); // Dispose the current StudentTextbooksScreen frame
        StudentDashboard studentDashboard = new StudentDashboard(userId); // Open the StudentDashboard
        studentDashboard.setVisible(true);
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
                    FileWriter writer = new FileWriter("src/Database/VirtualCopies.csv", true); // Append mode
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
        // Create a new Item with user information and button
        Item newItem = new Item("User ID: " + userId + " - Course Code: " + courseCode + " - Textbook: " + textbook);
        newItem.getViewButton().addActionListener(e -> {
            // Handle the action when "View Virtual Copy" button is clicked
            ImageIcon icon = new ImageIcon(getClass().getResource("src/UI/VirtualCopiesDemo.png"));
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(this, label, "View Virtual Copy", JOptionPane.PLAIN_MESSAGE);
        });

        // Add the new item to the list model
        itemListModel.addElement(newItem);
    }

    private boolean isCourseCodeValid(String courseCode) {
        boolean isValid = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/TextbookSpreadsheet.csv"))) {
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
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    textbook = parts[1].trim(); // Assuming the textbook is in the second column of TextbookSpreadsheet.csv
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textbook;
    }

    private void showTextbook() {
        ImageIcon imageIcon = new ImageIcon("src/UI/VirtualCopiesDemo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        JScrollPane scrollPane = new JScrollPane(imageLabel);

        // Set preferred size of the scroll pane to fit width and set a fixed height
        int width = imageIcon.getIconWidth();
        int fixedHeight = 600; // You can adjust this as needed
        scrollPane.setPreferredSize(new Dimension(width, fixedHeight));

        // Show the scrollable window
        JOptionPane.showMessageDialog(null, scrollPane, "Image", JOptionPane.PLAIN_MESSAGE);
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
    static class ItemListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Item) {
                Item item = (Item) value;
                JButton button = item.getViewButton(); // Use the view button from the item
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JLabel(item.getUserInfo()), BorderLayout.CENTER); // Add item information
                panel.add(button, BorderLayout.EAST); // Add view button
                return panel;
            }
            return this;
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            StudentTextbooksScreen textbooksScreen = new StudentTextbooksScreen(userId); // Dummy userId for testing
        });
    }
}

