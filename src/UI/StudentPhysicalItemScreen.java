package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentPhysicalItemScreen extends JFrame {
    private List<Item> items;
    private List<Item> cart; // Cart to hold items
    static private int userId;

    public StudentPhysicalItemScreen(int id) {
        this.userId = id;
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveCart(); // Save cart when window is closing
            }
        });

        items = readItemsFromCSV("src/UI/ItemSpreadsheet.csv");
        cart = new ArrayList<>(); // Initialize the cart

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCart();
            }
        });
        topPanel.add(backButton);
        add(topPanel, BorderLayout.NORTH);

        JPanel itemsPanel = new JPanel();
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(itemsPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        for (Item item : items) {
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            JLabel itemLabel = new JLabel(item.toString());
            JButton addButton = new JButton("Add to Cart");
            addButton.addActionListener(e -> {
                addToCart(item);
            });
            itemPanel.add(itemLabel);
            itemPanel.add(addButton);
            itemsPanel.add(itemPanel);
        }
    }

    // Method to add an item to the cart and print the cart contents
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
                System.out.println("User " + userId + " added to cart: " + item.getName());
            }
        }
        // printCartContents(); // For demonstration, print cart contents
    }

    private void saveCart() {
        String csvFile = "src/UI/userIdtoCart.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId).append(",");
            for (Item item : cart) {
                sb.append(item.getId()).append(",").append(item.toString()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1); // Remove the trailing comma
            sb.append("\n"); // Add newline after each cart entry
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Item> readItemsFromCSV(String filePath) {
        List<Item> itemList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip the header line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Item item = new Item(values[0], values[1], values[2], values[3], values[4]);
                itemList.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    public static void main(String[] args) {
        // int sampleUserId = 120; // This should be replaced with actual logic to
        // obtain a user's ID
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen(1002).setVisible(true));
    }

    static class Item {
        private String id;
        private String name;
        private String author;
        private String itemType;
        private String amountLeft;

        public Item(String id, String name, String author, String itemType, String amountLeft) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.itemType = itemType;
            this.amountLeft = amountLeft;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " | " + author + " | " + itemType + " | " + amountLeft + " Available copies.";
        }
    }
}
