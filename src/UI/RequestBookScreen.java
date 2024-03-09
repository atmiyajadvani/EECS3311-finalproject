package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RequestBookScreen extends JFrame {
    private JButton btnBack, btnCourseTeaching, btnSelfImprovement, btnRequestBook;
    private JTextField txtBookName, txtSearch;
    private boolean isCourseTeachingSelected = false, isSelfImprovementSelected = false;

    public RequestBookScreen() {
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
        northPanel.add(txtSearch);

        add(northPanel, BorderLayout.NORTH);
        add(createMainPanel(), BorderLayout.CENTER);
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel lblTitle = new JLabel("Request a Book");
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitle.setFont(new Font(lblTitle.getFont().getName(), Font.BOLD, 20));
        mainPanel.add(lblTitle);

        mainPanel.add(Box.createVerticalStrut(20));

        JLabel lblSubtitle = new JLabel("What is the book for?");
        lblSubtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblSubtitle);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnCourseTeaching = new JButton("Course Teaching");
        btnSelfImprovement = new JButton("Self Improvement");
        buttonPanel.add(btnCourseTeaching);
        buttonPanel.add(btnSelfImprovement);

        mainPanel.add(buttonPanel);

        JLabel lblNameOfTheBook = new JLabel("Name of the book:");
        lblNameOfTheBook.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblNameOfTheBook);

        txtBookName = new JTextField(20);
        txtBookName.setMaximumSize(new Dimension(Integer.MAX_VALUE, txtBookName.getPreferredSize().height));
        mainPanel.add(txtBookName);

        btnRequestBook = new JButton("Request Book");
        btnRequestBook.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(btnRequestBook);

        mainPanel.add(Box.createVerticalStrut(20));

        addListeners();

        return mainPanel;
    }

    private void addListeners() {
        // Add action listeners for buttons
        // ...
    }

    private void goBackToDashboard(ActionEvent e) {
        this.dispose(); // Close the current screen
        // Assuming StudentDashboard is accessible and has a public constructor
        new StudentDashboard().setVisible(true); // Open the student dashboard
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RequestBookScreen().setVisible(true);
        });
    }
}
