package UI;

import javax.swing.*;
import java.awt.*;

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

    private void addItem() { // add new item to csv

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddItem().setVisible(true));
    }
}
