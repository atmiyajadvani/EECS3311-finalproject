package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class StudentPhysicalItemScreen extends JFrame {
    private DefaultListModel<Item> itemListModel;
    private List<Item> csvData;
    private JTextField searchTextField;
    private List<Item> cart;
    private int userID;

    public StudentPhysicalItemScreen(int id) {
        this.userID = id;
        setTitle("Item Search");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveCart();
            }
        });

        cart = new ArrayList<>();
        itemListModel = new DefaultListModel<>();
        JList<Item> itemList = new JList<>(itemListModel);
        itemList.setCellRenderer(new ItemListCellRenderer());
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
                searchItem();
            }
        });

        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList<?> list = (JList<?>) evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                if (index >= 0) {
                    Item selected = itemListModel.getElementAt(index);
                    addToCart(selected);
                }
            }
        });

        loadCSVData("src/UI/ItemSpreadsheet.csv");
    }

    private void loadCSVData(String filePath) {
        csvData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 5) {
                    Item item = new Item(values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(),
                            values[4].trim());
                    csvData.add(item);
                } else {
                    System.out.println("Invalid item format: " + String.join(", ", values));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchItem() {
        String searchText = searchTextField.getText().trim().toLowerCase();
        itemListModel.clear();

        for (Item item : csvData) {
            String itemName = item.getName().toLowerCase();
            String author = item.getAuthor().toLowerCase();
            String itemType = item.getItemType().toLowerCase();

            if (itemName.contains(searchText) || author.contains(searchText) || itemType.contains(searchText)) {
                itemListModel.addElement(item);
            }
        }
    }

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
                System.out.println("User " + userID + " added to cart: " + item.getName());
            }
        }
    }

    private void saveCart() {
        String csvFile = "src/UI/userIdtoCart.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(userID).append(",");
            for (Item item : cart) {
                sb.append(item.getId()).append(",").append(item.toString()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int sampleUserId = 120;
        EventQueue.invokeLater(() -> new StudentPhysicalItemScreen(sampleUserId).setVisible(true));
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

        public String getAuthor() {
            return author;
        }

        public String getItemType() {
            return itemType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Item item = (Item) o;
            return Objects.equals(id, item.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return name + " | " + author + " | " + itemType + " | " + amountLeft + " Available copies.";
        }
    }

    static class ItemListCellRenderer extends DefaultListCellRenderer {
        private static final long serialVersionUID = 1L;

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Item) {
                Item item = (Item) value;
                JButton button = new JButton("Add to Cart");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Handle add to cart action here
                    }
                });
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(this, BorderLayout.CENTER);
                panel.add(button, BorderLayout.EAST);
                return panel;
            }
            return this;
        }
    }
}
