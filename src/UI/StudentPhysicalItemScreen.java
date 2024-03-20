package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentPhysicalItemScreen extends JFrame {
    private DefaultListModel<String> model;
    private JList<String> itemList;
    private JTextField searchTextField;
    private JButton backButton;
    private static int userId;

    public StudentPhysicalItemScreen(int id) {
        this.userId = id;
        setTitle("Library Management Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Initialize components
        model = new DefaultListModel<>();
        itemList = new JList<>(model);
        itemList.setCellRenderer(new ItemCellRenderer());
        JScrollPane scrollPane = new JScrollPane(itemList);
        JPanel topPanel = new JPanel(new FlowLayout());
        searchTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        backButton = new JButton("Back");

        // Add components to the top panel
        topPanel.add(backButton);
        topPanel.add(new JLabel("Search:"));
        topPanel.add(searchTextField);
        topPanel.add(searchButton);

        // Add action listeners
        backButton.addActionListener(this::goBackToDashboard);
        searchButton.addActionListener(e -> loadItems(searchTextField.getText()));

        // Set layout
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void loadItems(String searchText) {
        model.clear(); // Clear the existing items before loading new ones

        String csvFile = "src/UI/ItemSpreadsheet.csv";
        String line;
        String csvSplitBy = ",";

        ArrayList<String> itemList = new ArrayList<>(); // ArrayList to hold formatted items

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Read line: " + line); // Debugging output
                String[] columns = line.split(csvSplitBy);

                String formattedItem = columns[1].trim() + " | " + columns[2].trim() + " | " + columns[3].trim();
                System.out.println(formattedItem);
                itemList.add(formattedItem); // Adding formatted item to ArrayList
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert ArrayList to array
        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        // Assuming itemListModel is an existing array list model
        for (String item : itemsArray) {
            model.addElement(item); // Adding items from array to itemListModel
        }
    }

    private void goBackToDashboard(ActionEvent e) {
        // Code to go back to the dashboard
        // For now, let's just close this window
        dispose();
    }

    private class ItemCellRenderer extends JPanel implements ListCellRenderer<String> {
        private JButton addButton;

        public ItemCellRenderer() {
            setLayout(new BorderLayout());
            addButton = new JButton("Add to Cart");
            add(addButton, BorderLayout.EAST);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
                boolean isSelected, boolean cellHasFocus) {
            JLabel label = new JLabel(value);
            add(label, BorderLayout.CENTER);
            return this;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentPhysicalItemScreen app = new StudentPhysicalItemScreen(userId);
            app.setVisible(true);
        });
    }
}
