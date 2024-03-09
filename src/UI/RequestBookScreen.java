package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequestBookScreen extends JFrame {
    private JButton btnCourseTeaching, btnSelfImprovement, btnRequestBook;
    private JTextField txtBookName;
    private boolean isCourseTeachingSelected = false, isSelfImprovementSelected = false;

    public RequestBookScreen() {
        setTitle("Request a Book");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        initUI();
    }

    private void initUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        JLabel lblTitle = new JLabel("Request a Book");
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Set the font size for the title
        lblTitle.setFont(new Font(lblTitle.getFont().getName(), Font.BOLD, 20)); // Adjust the font size as needed
        mainPanel.add(lblTitle);

        // Add vertical space after the title
        mainPanel.add(Box.createVerticalStrut(20)); // Adjust the height (20) as needed

        JLabel lblSubtitle = new JLabel("What is book for?");
        lblSubtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblSubtitle);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnCourseTeaching = new JButton("Course Teaching");
        btnSelfImprovement = new JButton("Self Improvement");
        buttonPanel.add(btnCourseTeaching);
        buttonPanel.add(btnSelfImprovement);
        mainPanel.add(buttonPanel);

        JLabel lblNameOfTheBook = new JLabel("Name of the book:");
        lblNameOfTheBook.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblNameOfTheBook);

        // Panel to hold both the text field and the info button next to each other
        JPanel bookNamePanel = new JPanel();
        bookNamePanel.setLayout(new BoxLayout(bookNamePanel, BoxLayout.X_AXIS));
        txtBookName = new JTextField(20);
        bookNamePanel.add(txtBookName);

        JButton btnInfo = new JButton("i");
        btnInfo.setToolTipText("Priority is given to books for course teaching");

        // Add ActionListener to btnInfo
        btnInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a JOptionPane message dialog
                JOptionPane.showMessageDialog(RequestBookScreen.this,
                        "Priority is given to books for course teaching purposes.", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        bookNamePanel.add(btnInfo);

        // To ensure the bookNamePanel doesn't stretch horizontally in the BoxLayout
        bookNamePanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, bookNamePanel.getPreferredSize().height));

        mainPanel.add(bookNamePanel);

        // Add vertical space between the book name input and the request button
        mainPanel.add(Box.createVerticalStrut(20)); // Adjust the height (20) as needed

        btnRequestBook = new JButton("Request a Book");
        btnRequestBook.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(btnRequestBook);

        addListeners();
    }

    private void addListeners() {
        btnCourseTeaching.addActionListener(e -> {
            toggleButtonStates(btnCourseTeaching, btnSelfImprovement);
            isCourseTeachingSelected = true;
            isSelfImprovementSelected = false;
            checkFormValidity();
        });

        btnSelfImprovement.addActionListener(e -> {
            toggleButtonStates(btnSelfImprovement, btnCourseTeaching);
            isSelfImprovementSelected = true;
            isCourseTeachingSelected = false;
            checkFormValidity();
        });

        txtBookName.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                checkFormValidity();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                checkFormValidity();
            }

            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                checkFormValidity();
            }
        });

        btnRequestBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFormValid()) {
                    JOptionPane.showMessageDialog(RequestBookScreen.this, "Book Requested Successfully!");
                } else {
                    // Display error message
                    JOptionPane.showMessageDialog(RequestBookScreen.this,
                            "Please select a category and enter the name of the book.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // This method checks if the form is valid
    private boolean isFormValid() {
        boolean isBookNameEntered = !txtBookName.getText().trim().isEmpty();
        return (isCourseTeachingSelected || isSelfImprovementSelected) && isBookNameEntered;
    }

    private void toggleButtonStates(JButton selected, JButton other) {
        selected.setEnabled(false); // This button appears "pressed"
        other.setEnabled(true); // The other button is enabled and appears "normal"
    }

    private void checkFormValidity() {
        boolean isBookNameEntered = !txtBookName.getText().trim().isEmpty();
        btnRequestBook.setEnabled((isCourseTeachingSelected || isSelfImprovementSelected) && isBookNameEntered);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RequestBookScreen().setVisible(true);
        });
    }
}
