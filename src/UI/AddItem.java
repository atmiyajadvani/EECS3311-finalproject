package UI;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class AddItem extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JComboBox<String> itemTypeDropdown;
    private JButton addItemButton;
    private JButton backButton;

    public AddItem() { initializeUI(); }

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
        itemTypeDropdown = new JComboBox<>(new String[]{"Book", "Magazine", "CD"});
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
        String id = "7"; // will be static id instance var of item class
        String title = titleField.getText();
        String author = authorField.getText();
        String itemType = (String) itemTypeDropdown.getSelectedItem();

        FileWriter writer = null;
        try {
            writer = new FileWriter("physicalitems.csv", true);
            writer.append(id).append(",")
                    .append(title).append(",")
                    .append(author).append(",")
                    .append(itemType).append("\n");
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

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddItem().setVisible(true));
    }
}