package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class StudentPhysicalItemScreen extends JFrame {
    private JTextField searchTextField;
    private DefaultListModel<String> itemListModel;
    private JList<String> itemList;
    private List<String> cart;
    private JButton backButton;

    public StudentPhysicalItemScreen() {
        this.cart = cart;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("YorkU Library Management App - Search for Physical Items");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        backButton = new JButton("Back");
        backButton.addActionListener(this::goBackToDashboard);
        searchTextField = new JTextField(20);
        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemCellRenderer());
        itemList.setFixedCellHeight(70); // Increased cell height

        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel topPanel = new JPanel();
        topPanel.add(backButton);
        topPanel.add(new JLabel("Search for Physical Item"));
        topPanel.add(searchTextField);
        add(topPanel, BorderLayout.NORTH);

        // Load items (simulation)
        loadItems("");
    }

    private void goBackToDashboard(ActionEvent e) {
        // Close the current screen and open the StudentDashboard
        this.dispose();
        new Dashboard();  // Ensure that StudentDashboard constructor is public
    }

    private void loadItems(String searchText) {
        // Simulate item loading. Replace with actual loading logic.
        String[] items = {
                "Atomic Habits by James Clear | Book | Location: Central Library | Purchase from online store | A supremely practical and useful book.",
                "Tech Crunch Magazine Issue 2021 | Magazine | Location: Central Library | Purchase from online store | Stay updated with the latest technology trends.",
                "Demon Slayer - A Mega Saga | CD | Location: Central Library | Purchase from online store | Experience the epic soundtrack."
        };

        itemListModel.clear();
        for (String item : items) {
            if (item.toLowerCase().contains(searchText.toLowerCase())) {
                itemListModel.addElement(item);
            }
        }
    }

    private class ItemCellRenderer extends JPanel implements ListCellRenderer<String> {
        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            setLayout(new BorderLayout(10, 10));
            setBackground(isSelected ? Color.LIGHT_GRAY : Color.WHITE);

            JTextArea itemLabel = new JTextArea(value);
            itemLabel.setWrapStyleWord(true);
            itemLabel.setLineWrap(true);
            itemLabel.setEditable(false);
            JButton addButton = new JButton("Add to Cart");

            addButton.addActionListener(e -> addToCart(value));

            add(itemLabel, BorderLayout.CENTER);
            add(addButton, BorderLayout.EAST);

            return this;
        }
    }

    private void addToCart(String item) {
        cart.add(item);
        // Show the CartScreen with the updated cart
        CartScreen cartScreen = new CartScreen((DefaultListModel<String>) cart);
        cartScreen.setVisible(true);
    }

    public static void main(String[] args) {
        // For testing purposes, start with an empty cart.
        DefaultListModel<String> cartListModel = new DefaultListModel<>();
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen().setVisible(true));
    }
}
