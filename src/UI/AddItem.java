package UI;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class AddItem extends JFrame {
    private JTextField titleField;
    private JComboBox<String> itemTypeDropdown;
    private JTextField locationField;
    private JTextField purchaseFromField;
    private JTextField descriptionField;
    private JButton addItemButton;

    public AddItem() { initializeUI(); }

    private void initializeUI() {
        setTitle("Manager Dashboard - Add Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 20, 20));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // padding

        // initialize form elements
        titleField = new JTextField();
        itemTypeDropdown = new JComboBox<>(new String[]{"Book", "Magazine", "CD"});
        locationField = new JTextField();
        purchaseFromField = new JTextField();
        descriptionField = new JTextField();
        addItemButton = new JButton("Add Item");
        addItemButton.addActionListener(e -> addItem());

        // add elements to form panel
        formPanel.add(new JLabel("Title:"));
        formPanel.add(titleField);
        formPanel.add(new JLabel("Item Type:"));
        formPanel.add(itemTypeDropdown);
        formPanel.add(new JLabel("Location:"));
        formPanel.add(locationField);
        formPanel.add(new JLabel("Purchase From:"));
        formPanel.add(purchaseFromField);
        formPanel.add(new JLabel("Description:"));
        formPanel.add(descriptionField);

        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(addItemButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addItem() {
        String id = "7"; // will be static id instance var of item class
        String title = titleField.getText();
        String itemType = (String) itemTypeDropdown.getSelectedItem();
        String location = locationField.getText();
        String purchaseFrom = purchaseFromField.getText();
        String description = descriptionField.getText();

        FileWriter writer = null;
        try {
            writer = new FileWriter("items.csv", true);
            writer.append(id).append(",")
                    .append(title).append(",")
                    .append(itemType).append(",")
                    .append(location).append(",")
                    .append(purchaseFrom).append(",")
                    .append(description).append("\n");
            JOptionPane.showMessageDialog(this, "Item added successfully!");

            // return to manager dashboard
            this.dispose();
            new ManagerDashboard().setVisible(true);
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddItem().setVisible(true));
    }
}