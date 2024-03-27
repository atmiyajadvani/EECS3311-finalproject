package Frontend;

import javax.swing.*;
import java.awt.*;

public class FacultyDashboard extends JFrame {
    private JButton signOutButton;
    static private int userId;
    private JButton physicalRentalsButton;
    private JButton addCourseButton;
    private JButton checkoutButton;
    private JButton cartButton;

    public FacultyDashboard(int userId) {
        this.userId = userId;
        setTitle("Faculty Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new BorderLayout());

        initializeUI();
    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Faculty Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize buttons
        signOutButton = new JButton("Sign out");
        physicalRentalsButton = new JButton("Physical Rentals");
        addCourseButton = new JButton("Add Course");
        cartButton = new JButton("Cart");
        checkoutButton = new JButton("Renting");

        // Sign out action
        signOutButton.addActionListener(e -> signOut());

        // Navigate to Physical Rentals screen
        physicalRentalsButton.addActionListener(e -> navigateToPhysicalRentals());

        //Navigate to faculty add courses screen
        addCourseButton.addActionListener(e -> navigateToAddCourse());

        // Cart action
        cartButton.addActionListener(e -> navigateToCartScreen());

        //Navigate to list of rented items screen
        checkoutButton.addActionListener(e -> navigateToCheckoutScreen());

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 5)); // Adjust the grid size for new buttons
        buttonsPanel.add(physicalRentalsButton);
        buttonsPanel.add(addCourseButton); // Add the new button
        buttonsPanel.add(cartButton); // Add the new button
        buttonsPanel.add(checkoutButton);

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
        StudentPhysicalItemScreen physicalItemScreen = new StudentPhysicalItemScreen(userId); // Open the physical item screen
        physicalItemScreen.setVisible(true);
    }

    private void navigateToAddCourse() {
        dispose(); // Dispose the current dashboard
        FacultyCourses facultyCourses = new FacultyCourses(userId); // Open the physical item screen
        facultyCourses.setVisible(true);
    }

    private void navigateToCartScreen() {
        dispose(); // Dispose the current dashboard
        CartScreen cartScreenRM = new CartScreen(userId); // Open the physical item screen
        cartScreenRM.setVisible(true);
    }

    private void navigateToCheckoutScreen() {
        dispose();
        CheckedOutItems checkedOutItems = new CheckedOutItems(userId);
        checkedOutItems.setVisible(true);
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
                ImageIcon icon = new ImageIcon(getClass().getResource("src/UI/VirtualCopiesDemo.png"));
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
        EventQueue.invokeLater(() -> new FacultyDashboard(userId).setVisible(true));
    }
}
