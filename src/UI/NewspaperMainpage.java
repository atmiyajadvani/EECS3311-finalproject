package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.awt.event.*;

public class NewspaperMainpage extends JFrame {

    static private int userId;
    int[] userData = new int[4];

    public NewspaperMainpage(int temp) {

        this.userId = temp;
        // int id = 1000; //temp id because user class not ready
        String csvFile = "src/UI/userSubs.csv";
        // Try-with-resources to automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                // Split the line by comma (assuming CSV format)
                String[] data = line.split(",");

                // Extract the user ID (assuming it's the first column)
                int userId1 = Integer.parseInt(data[0].trim());

                // Check if the user ID matches the target user ID
                if (userId1 == this.userId) {
                    // Extract the next four values (assuming they are 0s and 1s)
                    if (data[1].trim().isEmpty()) {
                        for (int i = 0; i < 4; i++) {
                            userData[i] = 0;
                        }
                    } else {
                        for (int i = 0; i < 4; i++) {
                            userData[i] = Integer.parseInt(data[i + 1].trim()); // Assuming the values start from the
                                                                                // second column
                            System.out.println(userData[i]);
                        }
                    }
                    break; // Stop reading further once the target user is found
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Newspapers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Newspapers");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Increase font size
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JLabel subtitleLabel = new JLabel("<html><i>Only subscribed users are able to preview papers</i></html>"); // Italics
        subtitleLabel.setFont(new Font("Arial", Font.ITALIC, 14)); // Decrease font size
        subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(subtitleLabel, BorderLayout.CENTER);

        JPanel sectionsPanel = new JPanel(new GridLayout(4, 1));

        // Section 1
        JPanel section1Panel = createSectionPanel("New York's Time",
                "New York's Time delivers bite-sized insights into NYC's culture, events, and hidden gems.", 0,
                userData);
        sectionsPanel.add(section1Panel);

        // Section 2
        JPanel section2Panel = createSectionPanel("The Mail and Globe",
                "\"The Mail and Globe\" is your weekly briefing. Stay informed on the latest news and trends shaping our world.",
                1, userData);
        sectionsPanel.add(section2Panel);

        // Section 3
        JPanel section3Panel = createSectionPanel("Toronto Moon",
                "\"Toronto Moon\" is your essential weekly digest of all things Toronto, featuring the latest events and gems.",
                2, userData);
        sectionsPanel.add(section3Panel);

        // Section 4
        JPanel section4Panel = createSectionPanel("The DC Post",
                "\"The DC Post\" delivers weekly updates on all things Washington D.C., from politics and culture to events and local news.",
                3, userData);
        sectionsPanel.add(section4Panel);

        add(sectionsPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Perform actions when the window is closing
                // For example, save user data before closing
                // UpdateUserInfo();
            }
        });

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {

            String redirecterDashboardRole = "";
            String temp1 = "";

            for (int i = 0; i < 4; i++) {
                System.out.println(userData[i]);
                temp1 += userData[i] + ",";
            }

            // open the UserInfoSpreadsheet.csv, look through the rows and find matching
            // row.
            // after the first comma, add/replace the following values with the temp1 string
            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                String line;
                StringBuilder updatedContent = new StringBuilder();
                // Read each line from the CSV file
                while ((line = br.readLine()) != null) {
                    // Split the line by comma (assuming CSV format)
                    String[] data = line.split(",");

                    // Extract the user ID (assuming it's the first column)
                    int userId1 = Integer.parseInt(data[0].trim());

                    // Check if the user ID matches the target user ID
                    if (userId1 == this.userId) {
                        // Change the following values
                        StringBuilder modifiedLine = new StringBuilder();
                        modifiedLine.append(data[0]); // Add the first column

                        // Add the temp1 string after the first column
                        modifiedLine.append(",").append(temp1);

                        // Append the rest of the columns
                        for (int i = 1; i < data.length; i++) {
                            modifiedLine.append(",").append(data[i]);
                        }
                        updatedContent.append(modifiedLine.toString()).append("\n");
                    } else {
                        // If the user ID doesn't match, keep the original line
                        updatedContent.append(line).append("\n");
                    }
                }

                // System.out.println("This works1");
                // Write the updated content back to the CSV file
                try (FileWriter writer = new FileWriter(csvFile)) {
                    writer.write(updatedContent.toString());

                    // System.out.println("This works2");
                }
            } catch (IOException g) {
                g.printStackTrace();
            }
            // System.out.println("This works2");
            try (BufferedReader br = new BufferedReader(new FileReader("src/UI/UserInfoSpreadsheet.csv"))) {
                String line;
                boolean firstLine = true; // Flag to indicate the first line
                // Read each line from the CSV file
                while ((line = br.readLine()) != null) {
                    if (firstLine) {
                        firstLine = false;
                        continue; // Skip processing the first line
                    }
                    // Split the line by comma (assuming CSV format)
                    String[] data = line.split(",");

                    // Extract the user ID (assuming it's the first column)
                    int userId2 = Integer.parseInt(data[0].trim());

                    // Check if the user ID matches the target user ID
                    if (userId2 == this.userId) {
                        // Change the following values
                        redirecterDashboardRole = data[3].trim();
                        break; // Stop reading further once the target user is found
                    }
                }
            } catch (IOException g) {
                g.printStackTrace();
            }

            switch (redirecterDashboardRole) {
                case "Student":
                case "Visitor":
                    new StudentDashboard(userId).setVisible(true);
                    break;
                case "Faculty":
                case "Staff":
                    new FacultyDashboard(userId).setVisible(true);
                    break;
                case "Manager":
                    new ManagerDashboard(userId).setVisible(true);
                    break;
                case "":
                    System.out.println("Dashboard not accessible.");
            }

            // Organize Classes, correct dashboard
            StudentDashboard dashboard = new StudentDashboard(userId); // Assuming this class exists
            dashboard.setVisible(true);
            dispose(); // Close the current frame
        });

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(backButton);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createSectionPanel(String title, String description, int num, int[] userData) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(title);
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setEditable(false);
        panel.add(descriptionArea, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton button1;
        if (userData[num] == 1) {
            button1 = new JButton("Unsubscribe");
        } else {
            button1 = new JButton("  Subscribe  ");
        }
        JButton button2 = new JButton("View");
        button1.setPreferredSize(new Dimension(150, 30));
        button2.setPreferredSize(new Dimension(150, 30));
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        panel.add(buttonsPanel, BorderLayout.SOUTH);

        // Add action listener to the "Subscribe" button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button1.getText().equals("  Subscribe  ")) {
                    // Show input dialog for payment information
                    String paymentInfo = JOptionPane.showInputDialog(null, "Please enter your payment information:");
                    // Show payment accepted message
                    JOptionPane.showMessageDialog(null, "Payment Accepted!");
                    userData[num] = 1;
                    // Enable the "View" button
                    button2.setEnabled(true);
                    // Change the button text to "Unsubscribe"
                    button1.setText("Unsubscribe");
                } else {
                    // Show confirmation dialog
                    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to unsubscribe?",
                            "Unsubscribe", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        // Update userData array
                        userData[num] = 0;
                        // Change the button text to "Subscribe"
                        button1.setText("  Subscribe  ");
                        // Disable the "View" button
                        button2.setEnabled(false);
                    }
                }
            }
        });

        if (userData[num] == 0) {
            button2.setEnabled(false);
        }

        // Add action listener to the "View" button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userData[num] == 1) {
                    openImage(num);
                }
            }
        });

        return panel;
    }

    // Method to open the image corresponding to the section
    private void openImage(int num) {
        String imagePath = "src/UI/newspaperPhotos/" + num + ".png";
        try {
            ImageIcon imageIcon = new ImageIcon(imagePath);
            JLabel imageLabel = new JLabel(imageIcon);
            JScrollPane scrollPane = new JScrollPane(imageLabel);

            // Set preferred size of the scroll pane to fit width and set a fixed height
            int width = imageIcon.getIconWidth();
            int fixedHeight = 600; // You can adjust this as needed
            scrollPane.setPreferredSize(new Dimension(width, fixedHeight));

            // Show the scrollable window
            JOptionPane.showMessageDialog(null, scrollPane, "Image", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error opening image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NewspaperMainpage(userId));
    }
}