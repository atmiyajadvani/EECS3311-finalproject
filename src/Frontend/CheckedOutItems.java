package Frontend;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckedOutItems extends JFrame {
    static private int userId;
    private JLabel itemsRented;
    private JTextArea displayArea;
    private List<String[]> itemsData;

    public CheckedOutItems(int userId) {
        this.userId = userId;
        setTitle("Checked Out Items");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        itemsRented = new JLabel("", SwingConstants.CENTER);
        itemsRented.setText("Items Rented: " + getNumItemsRented(userId));
        itemsRented.setFont(new Font(itemsRented.getFont().getName(), Font.BOLD, 20));
        displayArea = new JTextArea(20, 50);
        displayArea.setFont(new Font(itemsRented.getFont().getName(), Font.PLAIN, 15));
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(itemsRented, BorderLayout.NORTH);
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
        loadItemsDataFromFile();
        displayItemsForUser(userId);
    }

    private void goBackToDashboard() {
        String role = getUserRoleFromCSV(userId);

        if (role != null) {
            switch (role) {
                case "Student":
                case "Visitor":
                    dispose();
                    StudentDashboard studentDashboard = new StudentDashboard(userId);
                    studentDashboard.setVisible(true);
                    break;
                case "Staff":
                case "Faculty":
                    dispose();
                    FacultyDashboard facultyDashboard = new FacultyDashboard(userId);
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

    private String getNumItemsRented(int userID) {
        BufferedReader br = null;
        FileWriter writer = null;

        try {
            br = new BufferedReader(new FileReader("src/Database/UserInfoSpreadsheet.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(Integer.toString(userID))) {
                    return data[6];
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

        return "";
    }

    private String getUserRoleFromCSV(int userId) {
        String role = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/UserInfoSpreadsheet.csv"))) {
            String line;
            boolean firstLineSkipped = false;
            while ((line = reader.readLine()) != null) {
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length >= 4 && Integer.parseInt(parts[0].trim()) == userId) {
                    role = parts[3].trim();
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
        String csvFile = "src/Database/UserInfoSpreadsheet.csv";
        String line;
        String role = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && !data[0].isEmpty()) {
                    try {
                        int id = Integer.parseInt(data[0]);
                        if (id == userId) {
                            role = data[3];
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
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/UserBooksBrought.csv"))) {
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
            if (item.length >= 2 && item[0].equals(String.valueOf(userId))) {
                for (int i = 1; i < 5; i++) {
                    displayText.append(item[i]);
                    if (i < 4) {
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
        //int userId = 1004;
        SwingUtilities.invokeLater(() -> {
            CheckedOutItems app = new CheckedOutItems(userId);
            app.setVisible(true);
        });
    }
}
