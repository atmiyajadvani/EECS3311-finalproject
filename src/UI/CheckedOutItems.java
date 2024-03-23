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
    static private int userId;
    private JTextArea displayArea;
    private List<String[]> itemsData;

    public CheckedOutItems(int userId) {
        this.userId = userId;
        setTitle("Checked Out Items");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayArea = new JTextArea(20, 50);
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        JButton backButton = new JButton("Back");
        /*
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to go back
                System.out.println(1);
                // Read the user's role from UserInfoSpreadsheet.csv
                String role = getUserRole(userId);
                dispose();

            }
        });*/
        backButton.addActionListener(e -> goBackToDashboard());
        southPanel.add(backButton);

        add(southPanel, BorderLayout.SOUTH);

        itemsData = new ArrayList<>();
        loadItemsDataFromFile(); // Load data from CSV file
        displayItemsForUser(userId); // Display items for the provided user ID
    }

    private void goBackToDashboard() {
        // Read user info from CSV file
        String role = getUserRoleFromCSV(userId);

        if (role != null) {
            switch (role) {
                case "Student":
                case "Visitor":
                    dispose(); // Dispose the current StudentTextbooksScreen frame
                    StudentDashboard studentDashboard = new StudentDashboard(userId); // Open the StudentDashboard
                    studentDashboard.setVisible(true);
                    break;
                case "Staff":
                case "Faculty":
                    dispose(); // Dispose the current StudentTextbooksScreen frame
                    FacultyDashboard facultyDashboard = new FacultyDashboard(userId); // Open the FacultyDashboard
                    facultyDashboard.setVisible(true);
                    break;
                case "Manager":
                    dispose();
                    ManagerDashboard managerDashboard = new ManagerDashboard(userId);
                    managerDashboard.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid user role.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "User not found or role not specified.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getUserRoleFromCSV(int userId) {
        String role = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UI/UserInfoSpreadsheet.csv"))) {
            String line;
            boolean firstLineSkipped = false; // Flag to track if the first line has been skipped
            while ((line = reader.readLine()) != null) {
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; // Skip the first line
                }
                String[] parts = line.split(",");
                if (parts.length >= 4 && Integer.parseInt(parts[0].trim()) == userId) {
                    role = parts[3].trim(); // Assuming role is in the fourth column of UserInfoSpreadsheet.csv
                    break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading user information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return role;
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
                if (data.length > 0 && !data[0].isEmpty()) {
                    try {
                        int id = Integer.parseInt(data[0]);
                        if (id == userId) {
                            role = data[3]; // Assuming role is in the fourth column
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing user ID to integer: " + e.getMessage());
                    }
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
            CheckedOutItems app = new CheckedOutItems(userId);
            app.setVisible(true);
        });
    }
}
