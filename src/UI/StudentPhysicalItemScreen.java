package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
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

    public StudentPhysicalItemScreen(int id) {
        this.userID = id;
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveCart();
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

        loadCSVData("src/UI/ItemSpreadsheet.csv");
        cartScreen = new CartScreen(userID);

        // Add "See Cart" button
        JButton seeCartButton = new JButton("See Cart");
        seeCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

    }

    // Method to handle going back to the Student Dashboard
    private void goBackToDashboard() {
        // Read user info from CSV file
        String role = getUserRoleFromCSV(userID);

        if (role != null) {
            switch (role) {
                case "Student":
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
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/UserInfoSpreadsheet.csv"))) {
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

    private void loadCSVData(String filePath) {
        csvData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 6) {
                    double price = Double.parseDouble(values[5].trim());
                    Item item = new Item(values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(),
                            values[4].trim(), price);
                    csvData.add(item);
                } else {
                    System.out.println("Invalid item format: " + String.join(", ", values));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchItem() {
        String searchText = searchTextField.getText().trim().toLowerCase();
        itemListModel.clear();

        for (Item item : csvData) {
            String itemName = item.getName().toLowerCase();
            String author = item.getAuthor().toLowerCase();
            String itemType = item.getItemType().toLowerCase();

            if (itemName.contains(searchText) || author.contains(searchText) || itemType.contains(searchText)) {
                itemListModel.addElement(item);
            }
        }
    }

    private void openCartScreen() {
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

    private void saveCart() {
        String csvFile = "src/UI/userIdtoCart.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(userID).append(",");
            for (Item item : cart) {
                sb.append(item.getId()).append(",").append(item.toString()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
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

    static class Item {
        private String id;
        private String name;
        private String author;
        private String itemType;
        private String amountLeft;
        private double price; // New attribute

        public Item(String id, String name, String author, String itemType, String amountLeft, double price) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.itemType = itemType;
            this.amountLeft = amountLeft;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getItemType() {
            return itemType;
        }

        public String getAmountLeft() {
            return amountLeft;
        }

        public void setAmountLeft(String amountLeft) {
            this.amountLeft = amountLeft;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Item item = (Item) o;
            return Objects.equals(id, item.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return name + " | " + author + " | " + itemType + " | " + amountLeft + " Available copies.";
        }
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