package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RequestBookScreen extends JFrame implements ActionListener {
    private JButton btnBack, btnRequestBook;
    private JTextField txtBookName, txtSearch;
    private JComboBox<String> purposeComboBox;
    private static int userId;

    public RequestBookScreen(int userId) {
        this.userId = userId;
        setTitle("Request a Book");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        txtSearch = new JTextField(20);
        btnBack = new JButton("Back");
        btnBack.addActionListener(this::goBackToDashboard);
        northPanel.add(btnBack);

        add(northPanel, BorderLayout.NORTH);
        add(createMainPanel(), BorderLayout.CENTER);
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Set insets to control spacing

        JLabel lblTitle = new JLabel("Request a Book");
        lblTitle.setFont(new Font(lblTitle.getFont().getName(), Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(lblTitle, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        JLabel lblSubtitle = new JLabel("What is the book for?");
        mainPanel.add(lblSubtitle, gbc);

        JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        String[] purposes = { "Course Teaching", "Self Improvement" };
        purposeComboBox = new JComboBox<>(purposes);
        comboBoxPanel.add(purposeComboBox);
        gbc.gridy = 2;
        mainPanel.add(comboBoxPanel, gbc);

        gbc.gridy = 3;
        JLabel lblNameOfTheBook = new JLabel("Name of the book:");
        mainPanel.add(lblNameOfTheBook, gbc);

        gbc.gridy = 4;
        txtBookName = new JTextField(20);
        mainPanel.add(txtBookName, gbc);

        JLabel courseP = new JLabel("Priority is given to course teaching.");

        gbc.gridy = 5;
        btnRequestBook = new JButton("Request Book");
        btnRequestBook.addActionListener(this::requestBook);
        mainPanel.add(btnRequestBook, gbc);

        return mainPanel;
    }

    private void goBackToDashboard(ActionEvent e) {
        this.dispose(); // Close the current screen
        // Assuming StudentDashboard is accessible and has a public constructor
        new StudentDashboard(userId).setVisible(true); // Open the student dashboard
    }

    private void requestBook(ActionEvent e) {
        String bookName = txtBookName.getText().trim();
        if (bookName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the name of the book.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Assuming the CSV file is in the same directory as the application
        String csvFile = "src/UI/TextbookSpreadsheet.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] book = line.split(cvsSplitBy);
                if (book.length >= 2 && book[1].trim().equalsIgnoreCase(bookName)) {
                    int choice = JOptionPane.showOptionDialog(this,
                            "Item Added!\nItem priority is given to course teaching.\nPress Okay to continue.",
                            "Confirmation",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            new Object[] { "Okay" },
                            "Okay");

                    if (choice == 0) {
                        // Continue with whatever action is needed
                        int num = updatePriorityQueue(bookName);
                        JOptionPane.showMessageDialog(this, "You are: " + num + " in line for this item",
                                "Queue Information", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Okay button clicked + " + num);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Book not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private int updatePriorityQueue(String bookName) {
        int num = 0; // Initialize the position to 0

        try (BufferedReader br = new BufferedReader(new FileReader("src/UI/TextbookPriorityQueue.csv"))) {
            StringBuilder updatedContent = new StringBuilder();
            String line;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                // Split the line by comma (assuming CSV format)
                String[] data = line.split(",");

                // Extract the second column as a string
                String bookNameInFile = data[1].trim();

                // Check if the book name matches the target book name
                if (bookNameInFile.equalsIgnoreCase(bookName)) {
                    // check which dropdown option
                    if (purposeComboBox.getSelectedItem().equals("Course Teaching")) {
                        data[2] += userId + " ";
                        // Count occurrences of the user's ID in the third column
                        num = countOccurrences(data[2], Integer.toString(userId));
                    } else {
                        // else - add user id with a space after to the fourth column
                        data[3] += userId + " ";
                        // Count occurrences of the user's ID in the fourth column
                        num = countOccurrences(data[3], Integer.toString(userId));
                    }
                }
                // Reconstruct the line with updated data
                String updatedLine = String.join(",", data);
                // Append the updated line to the StringBuilder
                updatedContent.append(updatedLine).append("\n");
            }

            // Write the updated content back to the CSV file
            Files.write(Paths.get("src/UI/TextbookPriorityQueue.csv"), updatedContent.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return num; // Return the position of the user in the queue
    }

    // Helper method to count occurrences of a substring in a string
    private int countOccurrences(String str, String subStr) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(subStr, idx)) != -1) {
            count++;
            idx += subStr.length();
        }
        return count;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // No need for action listener for JComboBox
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RequestBookScreen(userId).setVisible(true);
        });
    }
}
