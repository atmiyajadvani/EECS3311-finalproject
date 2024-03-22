package UI;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddItem extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JComboBox<String> itemTypeDropdown;
    private JButton addItemButton;
    private JButton backButton;

    public AddItem() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Manager Dashboard - Add Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 20, 20));
        JPanel bottomPanel = new JPanel();
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // padding
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // padding

        // initialize form elements
        titleField = new JTextField();
        itemTypeDropdown = new JComboBox<>(new String[] { "Book", "Magazine", "CD" });
        authorField = new JTextField();
        addItemButton = new JButton("Add Item");
        addItemButton.addActionListener(e -> addItem());
        backButton = new JButton("Back");
        backButton.addActionListener(e -> goBack());

        // add elements to form panel
        formPanel.add(new JLabel("Title:"));
        formPanel.add(titleField);
        formPanel.add(new JLabel("Author:"));
        formPanel.add(authorField);
        formPanel.add(new JLabel("Item Type:"));
        formPanel.add(itemTypeDropdown);

        bottomPanel.add(backButton);
        bottomPanel.add(addItemButton);

        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addItem() {
        String id = String.valueOf(getNextItemID("src/UI/ItemSpreadsheet.csv"));
        String title = titleField.getText();
        String author = authorField.getText();
        String itemType = (String) itemTypeDropdown.getSelectedItem();
        String quantity = "20";
        String status = "enabled";

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/UI/ItemSpreadsheet.csv", true);
            writer.append(id).append(",")
                    .append(title).append(",")
                    .append(author).append(",")
                    .append(itemType).append(",")
                    .append(quantity).append(",")
                    .append("1").append(",")
                    .append(status).append("\n");
            JOptionPane.showMessageDialog(this, "Item added successfully!");

            // return to manager dashboard
            goBack();
        } catch (IOException e) {
            System.err.println("Error appending data to CSV file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing FileWriter: " + e.getMessage());
            }
        }
    }

    private static int getNextItemID(String filePath) {
        int maxItemID = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    int currItemID = Integer.parseInt(line.split(",")[0]);
                    if (currItemID > maxItemID) {
                        maxItemID = currItemID;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing UserID from the file: " + e.getMessage());
        }

        return maxItemID + 1;
    }

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddItem().setVisible(true));
    }
}
