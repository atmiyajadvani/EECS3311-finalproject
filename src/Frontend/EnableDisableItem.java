package Frontend;

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
        BufferedReader br = null;
        FileWriter writer = null;

        try {
            br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(itemID)) {
                    if (data[6].equals("enabled")) {
                        enableButton.setEnabled(false);
                        disableButton.setEnabled(true);
                    } else if (data[6].equals("disabled")) {
                        enableButton.setEnabled(true);
                        disableButton.setEnabled(false);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void loadItems() {
        List<String> items = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace(",", " | ");
                items.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        itemListModel.clear();
        for (String attribute : items) {
            itemListModel.addElement(attribute);
        }
    }

    private void executeSearch() {
        loadItems();
        String searchText = searchTextField.getText().trim().toLowerCase();
        List<String> searchResult = new ArrayList<>();

        for (int i = 0; i < itemListModel.getSize(); i++) {
            String originalItem = itemListModel.getElementAt(i);
            String trimmedItem = originalItem.toLowerCase().substring(7, originalItem.length()-19);

            if (trimmedItem.contains(searchText)) {
                searchResult.add(originalItem);
            }
        }

        itemListModel.clear();
        for (String item : searchResult) {
            itemListModel.addElement(item);
        }
    }

    private void goBack() {
        this.dispose();
        new ManagerDashboard().setVisible(true);
    }

    private void enableItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);
        BufferedReader br = null;
        FileWriter writer = null;
        String line = "";
        List<String[]> lines = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(itemID)) {
                    data[6] = "enabled";
                }
                lines.add(data);
            }

            writer = new FileWriter("src/Database/ItemSpreadsheet.csv");
            for (String[] rowData : lines) {
                writer.append(String.join(",", rowData));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        loadItems();
        JOptionPane.showMessageDialog(this, "Item enabled.");
    }

    private void disableItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);
        BufferedReader br = null;
        FileWriter writer = null;
        String line = "";
        List<String[]> lines = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(itemID)) {
                    data[6] = "disabled";
                }
                lines.add(data);
            }

            writer = new FileWriter("src/Database/ItemSpreadsheet.csv");
            for (String[] rowData : lines) {
                writer.append(String.join(",", rowData));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        loadItems();
        JOptionPane.showMessageDialog(this, "Item disabled.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnableDisableItem().setVisible(true));
    }
}
