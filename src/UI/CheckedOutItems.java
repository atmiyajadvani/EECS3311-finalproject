package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckedOutItems extends JFrame {
    static private int userID;
    private JTextArea displayArea;
    private List<String[]> itemsData;

    public CheckedOutItems(int userId) {
        this.userID = userId;
        setTitle("Checked Out Items");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayArea = new JTextArea(20, 50);
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to go back
                System.out.println(1);
                // Read the user's role from UserInfoSpreadsheet.csv
                String role = getUserRole(1002);
                dispose();
                // Redirect the user based on their role
                if (role.equalsIgnoreCase("student") || role.equalsIgnoreCase("visitor")) {
                    StudentDashboard studentDashboard = new StudentDashboard(userId);
                    studentDashboard.setVisible(true);
                } else if (role.equalsIgnoreCase("faculty") || role.equalsIgnoreCase("staff")) {
                    FacultyDashboard facultyDashboard = new FacultyDashboard(userId);
                    facultyDashboard.setVisible(true);
                } else if (role.equalsIgnoreCase("manager")) {
                    ManagerDashboard managerDashboard = new ManagerDashboard(userId);
                    managerDashboard.setVisible(true);
                }
            }
        });
        southPanel.add(backButton);

        add(southPanel, BorderLayout.SOUTH);

        itemsData = new ArrayList<>();
        loadItemsDataFromFile(); // Load data from CSV file
        displayItemsForUser(userId); // Display items for the provided user ID
    }

    private String getUserRole(int userId) {
        String csvFile = "src/UI/UserInfoSpreadsheet.csv";
        String line;
        String role = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the first line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (id == userId) {
                    role = data[3]; // Assuming role is in the fourth column
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(role);
        return role;
    }

    private void loadItemsDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/UserBooksBrought.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                itemsData.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayItemsForUser(int userId) {
        StringBuilder displayText = new StringBuilder();

        for (String[] item : itemsData) {
            if (item.length >= 2 && item[0].equals(String.valueOf(userId))) { // Convert userId to String
                for (int i = 1; i < item.length; i++) {
                    displayText.append(item[i]);
                    if (i < item.length - 1) {
                        displayText.append(", ");
                    }
                }
                displayText.append("\n");
            }
        }

        if (displayText.length() == 0) {
            displayText.append("No items found for the specified user ID.");
        }

        displayArea.setText(displayText.toString());
    }

    public static void main(String[] args) {
        //int userId = 1004; // Example user ID
        SwingUtilities.invokeLater(() -> {
            CheckedOutItems app = new CheckedOutItems(userID);
            app.setVisible(true);
        });
    }
}
