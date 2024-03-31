package Frontend;

import Backend.Item;
import Backend.StudentItemHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class StudentPhysicalItemScreen extends JFrame implements CartListener {
    private DefaultListModel<Item> itemListModel;
    private List<Item> csvData;
    private JTextField searchTextField;
    private List<Item> cart;
    private int userID;
    private CartScreen cartScreen;

    private Item item;
    private StudentItemHandler itemHandler;

    public StudentPhysicalItemScreen(int id) {
        this.userID = id;
        this.itemHandler = new StudentItemHandler();
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                itemHandler.saveCart(userID);
            }
        });

        cart = new ArrayList<>();
        itemListModel = new DefaultListModel<>();
        JList<Item> itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemListCellRenderer(this));
        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel searchPanel = new JPanel();
        searchTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search:"));
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);
        add(searchPanel, BorderLayout.NORTH);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchItem();
            }
        });

        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList<?> list = (JList<?>) evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                if (index >= 0) {
                    Item selected = itemListModel.getElementAt(index);
                    addToCart(selected);
                }
            }
        });

        cartScreen = new CartScreen(userID);

        // Add "See Cart" button
        JButton seeCartButton = new JButton("See Cart");
        seeCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                openCartScreen();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(seeCartButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> goBackToDashboard());
        buttonPanel.add(backButton);

        itemHandler.removeDisabledItems();
        searchItem();
    }

    // Method to handle going back to the Dashboard
    private void goBackToDashboard() {
        // Read user info from CSV file
        String role = getUserRoleFromCSV(userID);

        if (role != null) {
            switch (role) {
                case "Student":
                case "Visitor":
                    dispose(); // Dispose the current StudentTextbooksScreen frame
                    StudentDashboard studentDashboard = new StudentDashboard(userID); // Open the StudentDashboard
                    studentDashboard.setVisible(true);
                    break;
                case "Staff":
                case "Faculty":
                    dispose(); // Dispose the current StudentTextbooksScreen frame
                    FacultyDashboard facultyDashboard = new FacultyDashboard(userID); // Open the FacultyDashboard
                    facultyDashboard.setVisible(true);
                    break;
                case "Manager":
                    dispose();
                    ManagerDashboard managerDashboard = new ManagerDashboard(userID);
                    managerDashboard.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid user role.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "User not found or role not specified.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getUserRoleFromCSV(int userId) {
        String role = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/UserInfoSpreadsheet.csv"))) {
            String line;
            boolean firstLineSkipped = false; // Flag to track if the first line has been skipped
            while ((line = reader.readLine()) != null) {
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; // Skip the first line
                }
                String[] parts = line.split(",");
                if (parts.length >= 4 && Integer.parseInt(parts[0].trim()) == userId) {
                    role = parts[3].trim(); // Assuming role is in the fourth column of UserInfoSpreadsheet.csv
                    break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading user information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return role;
    }

    private void searchItem() {
        String searchText = searchTextField.getText().trim().toLowerCase();
        itemListModel.clear();
        List<Item> filteredItems = this.itemHandler.filterItems(searchText);
        for(Item item: filteredItems){
            itemListModel.addElement(item);
        }
    }

    private void openCartScreen() {
        cartScreen.setCartItems(cart);
        cartScreen.setVisible(true);
    }

    private void addToCart(Item item) {
        if (cart.size() == 10) {
            JOptionPane.showMessageDialog(this, "You have reached your max amount of items.", "Limit Reached",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (cart.contains(item)) {
                JOptionPane.showMessageDialog(this, "You already have this item in your cart!", "Limit Reached",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                cart.add(item);
                JOptionPane.showMessageDialog(this, item.getName() + " Added to cart!", "Item Added",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User " + userID + " added to cart: " + item.getName());
                cartScreen.itemAddedToCart(item);
            }
        }
    }



    @Override
    public void itemAddedToCart(Item item) {
        addToCart(item);
    }

    public static void main(String[] args) {
        int sampleUserId = 120;
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen(sampleUserId).setVisible(true));
    }

    static class ItemListCellRenderer extends DefaultListCellRenderer {
        private static final long serialVersionUID = 1L;
        private StudentPhysicalItemScreen studentPhysicalItemScreen;

        public ItemListCellRenderer(StudentPhysicalItemScreen studentPhysicalItemScreen) {
            this.studentPhysicalItemScreen = studentPhysicalItemScreen;
        }

        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Item) {
                Item item = (Item) value;
                JButton button = new JButton("Add to Cart");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Call addToCart method using the reference to StudentPhysicalItemScreen
                        studentPhysicalItemScreen.addToCart(item);
                    }
                });
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(this, BorderLayout.CENTER);
                panel.add(button, BorderLayout.EAST);
                return panel;
            }
            return this;
        }

    }
}