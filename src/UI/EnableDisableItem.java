package UI;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnableDisableItem extends JFrame {
    private JButton backButton;
    private JTextField searchTextField;
    private DefaultListModel<String> itemListModel;
    private JList<String> itemList;
    private JButton enableButton;
    private JButton disableButton;

    public EnableDisableItem() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Manager Dashboard - Enable/Disable Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        searchTextField = new JTextField(20);
        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        itemList.setFixedCellHeight(50);
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");
        backButton = new JButton("Back");

        // Selection listener for list items
        itemList.getSelectionModel().addListSelectionListener(e -> selectItem());

        // Command pattern applied through ActionListener implementations
        enableButton.addActionListener(e -> enableItem());
        disableButton.addActionListener(e -> disableItem());
        backButton.addActionListener(e -> goBack());

        JPanel topPanel = new JPanel();
        topPanel.add(backButton);
        topPanel.add(new JLabel("Search for Item"));
        topPanel.add(searchTextField);

        JScrollPane scrollPane = new JScrollPane(itemList);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(enableButton);
        bottomPanel.add(disableButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        loadItems();
    }

    private void selectItem() {
        String itemID = String.valueOf(itemList.getSelectedIndex() + 1001);
        BufferedReader br = null;
        FileWriter writer = null;

        try {
            br = new BufferedReader(new FileReader("physicalitems.csv"));
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
            br = new BufferedReader(new FileReader("physicalitems.csv"));
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
            br = new BufferedReader(new FileReader("physicalitems.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(itemID)) {
                    data[6] = "enabled";
                }
                lines.add(data);
            }

            writer = new FileWriter("physicalitems.csv");
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
            br = new BufferedReader(new FileReader("physicalitems.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(itemID)) {
                    data[6] = "disabled";
                }
                lines.add(data);
            }

            writer = new FileWriter("physicalitems.csv");
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
