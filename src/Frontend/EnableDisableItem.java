package Frontend;

import Backend.Item;
import Backend.StudentItemHandler;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class EnableDisableItem extends JFrame {
    private JButton backButton;
    private JTextField searchTextField;
    private JButton searchButton;
    private DefaultListModel<Item> itemListModel;
    private JList<Item> itemList;
    private JButton enableButton;
    private JButton disableButton;
    private StudentItemHandler itemHandler;

    public EnableDisableItem() { initializeUI(); }

    private void initializeUI() {
        itemHandler = new StudentItemHandler();
        setTitle("Manager Dashboard - Enable/Disable Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // initialize elements
        backButton = new JButton("Back");
        searchTextField = new JTextField(20);
        searchButton = new JButton("Search");
        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        itemList.setFixedCellHeight(50);
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");

        backButton.addActionListener(e -> goBack());
        searchButton.addActionListener(e -> executeSearch());
        enableButton.addActionListener(e -> enableItem());
        enableButton.setEnabled(false);
        disableButton.addActionListener(e -> disableItem());
        disableButton.setEnabled(false);

        itemList.getSelectionModel().addListSelectionListener(e -> selectItem());

        JPanel topPanel = new JPanel();
        topPanel.add(backButton);
        topPanel.add(new JLabel("Search for Item"));
        topPanel.add(searchTextField);
        topPanel.add(searchButton);
        add(topPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(enableButton);
        bottomPanel.add(disableButton);
        add(bottomPanel, BorderLayout.SOUTH);

        loadItems();
    }

    private void selectItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);

        for (Item item : itemHandler.getCsvData()) {
            if (item.getId().equals(itemID)) {
                if (item.isEnabled()) {
                    enableButton.setEnabled(false);
                    disableButton.setEnabled(true);
                } else {
                    enableButton.setEnabled(true);
                    disableButton.setEnabled(false);
                }
            }
        }
    }

    private void loadItems() {
        itemListModel.clear();
        for (Item attribute : itemHandler.getCsvData()) {
            itemListModel.addElement(attribute);
        }
    }

    private void executeSearch() {
        String searchText = searchTextField.getText().trim().toLowerCase();
        itemListModel.clear();
        List<Item> filteredItems = itemHandler.filterItems(searchText);
        for (Item item: filteredItems) {
            itemListModel.addElement(item);
        }
    }

    private void enableItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);
        itemHandler.enableItem(itemID);
        loadItems();
        JOptionPane.showMessageDialog(this, "Item enabled.");
    }

    private void disableItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);
        itemHandler.disableItem(itemID);
        loadItems();
        JOptionPane.showMessageDialog(this, "Item disabled.");
    }

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnableDisableItem().setVisible(true));
    }
}
