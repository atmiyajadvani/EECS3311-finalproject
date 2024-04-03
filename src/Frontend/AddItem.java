package Frontend;

import Backend.Item;
import Backend.ItemHandler;

import javax.swing.*;
import java.awt.*;

public class AddItem extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JComboBox<String> itemTypeDropdown;
    private JTextField priceField;
    private JButton addItemButton;
    private JButton backButton;
    private ItemHandler itemHandler;

    public AddItem() { initializeUI(); }

    private void initializeUI() {
        itemHandler = new ItemHandler();
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
        priceField = new JTextField();
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
        formPanel.add(new JLabel("Price:"));
        formPanel.add(priceField);

        bottomPanel.add(backButton);
        bottomPanel.add(addItemButton);

        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addItem() {
        String id = String.valueOf(Item.getNextID());
        String title = titleField.getText();
        String author = authorField.getText();
        String itemType = (String) itemTypeDropdown.getSelectedItem();
        String quantity = "20";
        String price = priceField.getText();
        Item item = new Item(id, title, author, itemType, quantity, Double.parseDouble(price), "enabled");

        if (!Item.isValidPrice(price)) {
            JOptionPane.showMessageDialog(this, "ERROR! Invalid price.");
            return;
        }

        itemHandler.addItem(item);
        JOptionPane.showMessageDialog(this, "Item added successfully!");

        // return to manager dashboard
        goBack();
    }

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddItem().setVisible(true));
    }
}
