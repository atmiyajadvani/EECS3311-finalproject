package Frontend;
import Backend.StudentTextbooksManager;

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
    private StudentTextbooksManager manager;

    public StudentTextbooksScreen(int userId) {
        this.userId = userId;
        this.manager = new StudentTextbooksManager(userId);
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

        itemListModel = new DefaultListModel<>();

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

        // South panel and add Sign Out button
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

        // Add titlePanel, centerPanel, and southPanel to the NORTH, CENTER, and SOUTH regions
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // For going back to the Student Dashboard
    private void goBackToDashboard() {
        dispose();
        StudentDashboard studentDashboard = new StudentDashboard(userId);
        studentDashboard.setVisible(true);
    }

    private void signOut() {
        dispose();
        UserLogin loginScreen = new UserLogin();
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
        Item newItem = new Item("User ID: " + userId + " - Course Code: " + courseCode + " - Textbook: " + textbook);
        newItem.getViewButton().addActionListener(e -> {
            ImageIcon icon = new ImageIcon(getClass().getResource("src/Assets/VirtualCopiesDemo.png"));
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(this, label, "View Virtual Copy", JOptionPane.PLAIN_MESSAGE);
        });

        itemListModel.addElement(newItem);
    }

    private void showTextbook() {
        ImageIcon imageIcon = new ImageIcon("src/Assets/VirtualCopiesDemo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        JScrollPane scrollPane = new JScrollPane(imageLabel);

        int width = imageIcon.getIconWidth();
        int fixedHeight = 600;
        scrollPane.setPreferredSize(new Dimension(width, fixedHeight));

        JOptionPane.showMessageDialog(null, scrollPane, "Image", JOptionPane.PLAIN_MESSAGE);
    }

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

    static class ItemListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Item) {
                Item item = (Item) value;
                JButton button = item.getViewButton();
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JLabel(item.getUserInfo()), BorderLayout.CENTER);
                panel.add(button, BorderLayout.EAST);
                return panel;
            }
            return this;
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            StudentTextbooksScreen textbooksScreen = new StudentTextbooksScreen(userId);
        });
    }
}
