package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import Backend.RequestBookBackend;
import Backend.Item;

import Backend.RequestBookBackend;
public class RequestBookScreen extends JFrame implements ActionListener {
    private JButton btnBack, btnRequestBook;
    private JTextField txtBookName;
    private JComboBox<String> purposeComboBox;
    private int userId;
    private RequestBookBackend backend;

    public RequestBookScreen(int userId) {
        this.userId = userId;
        setTitle("Request a Book");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        btnBack = new JButton("Back");
        btnBack.addActionListener(this::goBackToDashboard);
        northPanel.add(btnBack);

        add(northPanel, BorderLayout.NORTH);
        add(createMainPanel(), BorderLayout.CENTER);

        // Initialize the backend
        backend = new RequestBookBackend();
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
        String[] purposes = {"Course Teaching", "Self Improvement"};
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
            JOptionPane.showMessageDialog(this, "Please enter the name of the book.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the selected purpose
        String purpose = (String) purposeComboBox.getSelectedItem();

        // Call the backend method to request the book
        boolean bookRequested = backend.requestBook(bookName, purpose, userId);

        if (bookRequested) {
            JOptionPane.showMessageDialog(this, "Item Added!\nItem priority is given to " + purpose + ".\nPress Okay to continue.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            // Continue with whatever action is needed
        } else {
            JOptionPane.showMessageDialog(this, "Book not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // No need for action listener for JComboBox
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RequestBookScreen(123).setVisible(true); // Replace 123 with the actual userId
        });
    }


}
