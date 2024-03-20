package UI;

import javax.swing.*;
import java.awt.*;

public class EnableDisableItem extends JFrame {
    private JButton backButton;
    private JTextField searchTextField;
    private DefaultListModel<String> itemListModel;
    private JList<String> itemList;
    private JButton enableButton;
    private JButton disableButton;

    public EnableDisableItem() { initializeUI(); }

    private void initializeUI() {
        setTitle("Manager Dashboard - Enable/Disable Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // initialize elements
        searchTextField = new JTextField(20);
        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        itemList.setFixedCellHeight(50);
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");
        backButton = new JButton("Back");

        enableButton.addActionListener(e -> enableItem());
        disableButton.addActionListener(e -> disableItem());
        backButton.addActionListener(e -> goBack());

        JPanel topPanel = new JPanel();
        topPanel.add(backButton);
        topPanel.add(new JLabel("Search for Item"));
        topPanel.add(searchTextField);
        add(topPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(enableButton);
        bottomPanel.add(disableButton);
        add(bottomPanel, BorderLayout.SOUTH);

        loadItems("");
    }

    private void loadItems(String searchText) {
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

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    private void enableItem() {
        int itemNum = itemList.getSelectedIndex() + 1;
        if (itemNum == 0) {
            System.out.println("please select an item");
            return;
        }

        System.out.println("ENABLED ITEM " + itemNum);
    }

    private void disableItem() {
        int itemNum = itemList.getSelectedIndex() + 1;
        if (itemNum == 0) {
            System.out.println("please select an item");
            return;
        }

        System.out.println("disABLED ITEM " + itemNum);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnableDisableItem().setVisible(true));
    }
}
