package Frontend;
import Backend.FacultyCoursesManager;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FacultyCourses extends JFrame {
    private JButton signOutButton;
    private JList<Item> userList;
    private DefaultListModel<Item> itemListModel;
    static private int userId;
    private FacultyCoursesManager manager;

    public FacultyCourses(int userId) {
        this.userId = userId;
        this.manager = new FacultyCoursesManager(userId);
        setTitle("Faculty Courses");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initializeUI();
    }

    private void initializeUI() {
        // Title panel with Faculty Courses title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Faculty Courses");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // Create a DefaultListModel to hold user information and textbooks
        itemListModel = new DefaultListModel<>();

        // Create a JList with the list model
        userList = new JList<>(itemListModel);
        userList.setCellRenderer(new ItemListCellRenderer());
        userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        userList.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPane = new JScrollPane(userList);

        userList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList<?> list = (JList<?>) evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                if (index >= 0) {
                    FacultyCourses.Item selected = itemListModel.getElementAt(index);
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
        addCourseButton.addActionListener(e -> addCourseUI());
        southPanel.add(addCourseButton);

        // Add Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> goBackToDashboard());
        southPanel.add(backButton);

        // Add titlePanel, scrollPane, and southPanel to the NORTH, CENTER, and SOUTH regions respectively
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void goBackToDashboard() {
        dispose(); // Dispose the current StudentTextbooksScreen frame
        FacultyDashboard facultyDashboard = new FacultyDashboard(userId); // Open the StudentDashboard
        facultyDashboard.setVisible(true);
    }

    private void signOut() {
        dispose(); // Dispose the current page
        UserLogin loginScreen = new UserLogin(); // Open the login screen
        loginScreen.setVisible(true);
    }

    private void addCourseUI() {
        String courseCode = JOptionPane.showInputDialog(this, "Enter course code:");
        String message = manager.addCourse(courseCode);
        String textbook = manager.getTextbookForCourse(courseCode);

        if (message == "Course added successfully!") {
            JOptionPane.showMessageDialog(this,message);
            updateUserList(courseCode, textbook);
        }
        else {
            JOptionPane.showMessageDialog(this,message);
        }
    }

    private void updateUserList(String courseCode, String textbook) {
        // Create a new Item with user information and button
        Item newItem = new Item("Course Code: " + courseCode + " - Textbook: " + textbook);
        newItem.getViewButton().addActionListener(e -> {
            // Handle the action when "View Textbook" button is clicked
            ImageIcon icon = new ImageIcon(getClass().getResource("src/Assets/VirtualCopiesDemo.png"));
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(this, label, "View Textbook", JOptionPane.PLAIN_MESSAGE);
        });

        // Add the new item to the list model
        itemListModel.addElement(newItem);
    }

    private void showTextbook() {
        ImageIcon imageIcon = new ImageIcon("src/Assets/VirtualCopiesDemo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        JScrollPane scrollPane = new JScrollPane(imageLabel);

        // Set preferred size of the scroll pane to fit width and set a fixed height
        int width = imageIcon.getIconWidth();
        int fixedHeight = 600; // You can adjust this as needed
        scrollPane.setPreferredSize(new Dimension(width, fixedHeight));

        // Show the scrollable window
        JOptionPane.showMessageDialog(null, scrollPane, "Image", JOptionPane.PLAIN_MESSAGE);
    }

    private static class Item {
        private String userInfo;
        private JButton viewButton;

        public Item(String userInfo) {
            this.userInfo = userInfo;
            this.viewButton = new JButton("View Textbook"); // Updated button name
            // Add action listener to the viewButton
            this.viewButton.addActionListener(e -> {
                // Handle the action when "View Textbook" button is clicked
                ImageIcon icon = new ImageIcon(getClass().getResource("src/Assets/VirtualCopiesDemo.png"));
                JLabel label = new JLabel(icon);
                JOptionPane.showMessageDialog(null, label, "View Textbook", JOptionPane.PLAIN_MESSAGE);
            });
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
        EventQueue.invokeLater(() -> new FacultyCourses(userId).setVisible(true));
    }
}
