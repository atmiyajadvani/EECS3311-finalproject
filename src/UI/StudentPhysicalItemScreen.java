package UI;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentPhysicalItemScreen extends JFrame {
    private List<Item> items;
    private int userId; // Changed to an instance variable, not static

    public StudentPhysicalItemScreen(int id) {
        this.userId = id; // Properly set the userId for this instance
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        items = readItemsFromCSV("ItemSpreadsheet.csv");
        JPanel itemsPanel = new JPanel();
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(itemsPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        for (Item item : items) {
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
            JLabel itemLabel = new JLabel(item.toString());
            JButton addButton = new JButton("Add to Cart");
            addButton.addActionListener(e -> {
                // Implement your add to cart logic here, potentially involving `userId`
                System.out.println("User " + userId + " added to cart: " + item.getName());
            });
            itemPanel.add(itemLabel);
            itemPanel.add(addButton);
            itemsPanel.add(itemPanel);
        }
    }

    private List<Item> readItemsFromCSV(String filePath) {
        List<Item> itemList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip the header line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Item item = new Item(values[1], values[2], values[3], values[4]);
                itemList.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    public static void main(String[] args) {
        // The userId needs to be passed in some way. This example will set it manually
        // for demonstration.
        int sampleUserId = 1; // This should be replaced with actual logic to obtain a user's ID
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen(sampleUserId).setVisible(true));
    }

    static class Item {
        private String name;
        private String author;
        private String itemType;
        private String amountLeft;

        public Item(String name, String author, String itemType, String amountLeft) {
            this.name = name;
            this.author = author;
            this.itemType = itemType;
            this.amountLeft = amountLeft;
        }

        @Override
        public String toString() {
            return name + " | " + author + " | " + itemType + " | " + amountLeft;
        }

        public String getName() {
            return this.name;
        }
    }
}
