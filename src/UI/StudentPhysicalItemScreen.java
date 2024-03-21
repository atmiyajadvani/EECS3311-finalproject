package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentPhysicalItemScreen extends JFrame {
    private DefaultListModel<String> itemListModel;
    private List<String[]> csvData;
    private JTextField searchTextField;

    public StudentPhysicalItemScreen(int id) {
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        itemListModel = new DefaultListModel<>();
        JList<String> itemList = new JList<>(itemListModel);
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
                searchItem(e);
            }
        });

        loadCSVData("src/UI/ItemSpreadsheet.csv");
    }

<<<<<<< Updated upstream
=======
    // Method to add an item to the cart and print the cart contents
    private void addToCart(Item item) {
        if (cart.size() == 10){
            JOptionPane.showMessageDialog(this, "You have reached your max amount of items.", "Limit Reached", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(cart.contains(item)){
                JOptionPane.showMessageDialog(this, "You already have this item in your cart!", "Limit Reached", JOptionPane.ERROR_MESSAGE);
            }
            else {
                cart.add(item);
                JOptionPane.showMessageDialog(this, item.getName() + " Added to cart!", "Item Added", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User " + userId + " added to cart: " + item.getName());
            }
        }
        //printCartContents(); // For demonstration, print cart contents
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

>>>>>>> Stashed changes
    private void loadCSVData(String filePath) {
        csvData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                csvData.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchItem(ActionEvent e) {
        String searchText = searchTextField.getText().trim().toLowerCase();
        itemListModel.clear();

        // Keep track of added items to avoid duplicates
        Set<String> addedItems = new HashSet<>();

        for (String[] item : csvData) {
            if (item.length >= 4) { // Ensure the item has at least 4 parts (ID, name, author, type)
                String itemName = item[1].trim().toLowerCase();
                String author = item[2].trim().toLowerCase();
                String itemType = item[3].trim().toLowerCase();

                // Check if any part of the item matches the search text
                if (itemName.contains(searchText) || author.contains(searchText) || itemType.contains(searchText)) {
                    String itemInfo = "Item Name: " + item[1] + "\nAuthor: " + item[2] + "\nItem Type: " + item[3] + "\n";

                    // Check if the item info is already added to avoid duplicates
                    if (!addedItems.contains(itemInfo.toLowerCase())) {
                        itemListModel.addElement(itemInfo);
                        addedItems.add(itemInfo.toLowerCase());
                    }
                }
            } else {
                System.out.println("Invalid item format: " + String.join(", ", item));
            }
        }
    }

    public static void main(String[] args) {
        int sampleUserId = 1;
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen(sampleUserId).setVisible(true));
    }
}
