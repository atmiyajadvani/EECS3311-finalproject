package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPhysicalItemScreen extends JFrame {
    private JTextField searchTextField;
    private DefaultListModel<String> itemListModel;
    private JList<String> itemList;
    private List<String> cart = new ArrayList<>();

    public StudentPhysicalItemScreen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("YorkU Library Management App - Search for Physical Item");
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel searchPanel = new JPanel();
        searchTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JButton cartButton = new JButton("Cart");
        JLabel cartItemCount = new JLabel("0 items");

        searchPanel.add(new JLabel("Search for a book"));
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);
        topPanel.add(searchPanel, BorderLayout.CENTER);
        topPanel.add(cartButton, BorderLayout.EAST);
        topPanel.add(cartItemCount, BorderLayout.WEST);

        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemCellRenderer());

        JScrollPane scrollPane = new JScrollPane(itemList);
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Adding functionality to search items and update the list as the user types
        searchTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String searchText = searchTextField.getText();
                loadItems(searchText);
            }
        });

        // Action listener for cart button
        cartButton.addActionListener(e -> {
            CartScreen cartScreen = new CartScreen(cart);
            cartScreen.setVisible(true);
        });

        loadItems("");
    }

    private void loadItems(String searchText) {
        // Read items from CSV and filter based on searchText
        try {
            BufferedReader reader = new BufferedReader(new FileReader("items.csv"));
            String line;
            itemListModel.clear();
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(searchText.toLowerCase())) {
                    itemListModel.addElement(line);
                }
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading items from CSV.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    class ItemCellRenderer extends JPanel implements ListCellRenderer<String> {
        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            this.setLayout(new BorderLayout());
            JTextArea textArea = new JTextArea(value);
            textArea.setEditable(false);
            JButton addButton = new JButton("Add to Cart");

            addButton.addActionListener(e -> {
                cart.add(value);
                // Update the cart item count label here
            });

            if (isSelected) {
                textArea.setBackground(list.getSelectionBackground());
                textArea.setForeground(list.getSelectionForeground());
                this.setBackground(list.getSelectionBackground());
            } else {
                textArea.setBackground(list.getBackground());
                textArea.setForeground(list.getForeground());
                this.setBackground(list.getBackground());
            }

            this.add(textArea, BorderLayout.CENTER);
            this.add(addButton, BorderLayout.EAST);
            return this;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen().setVisible(true));
    }
}
