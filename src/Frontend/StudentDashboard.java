package Frontend;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentDashboard extends JFrame {
    static private int userId;
    private JButton signOutButton;
    private JButton physicalRentalsButton;
    private JButton requestBookButton;
    private JButton newsletterButton;

    // public StudentDashboard() {
    // initializeUI();
    // }

    public StudentDashboard(int userId) { // Modify the constructor to accept the user ID
        this.userId = userId; // Store the user ID
        setTitle("Student Dashboard");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setVisible(true);
        initializeUI();

    }

    private void initializeUI() {
        setTitle("YorkU Library Management App - Student Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize buttons
        signOutButton = new JButton("Sign out");
        physicalRentalsButton = new JButton("Physical Rentals");
        requestBookButton = new JButton("Request a book");
        newsletterButton = new JButton("Newsletter");
        JButton studentTextbooksButton = new JButton("Student Textbooks");
        JButton cartButton = new JButton("Cart"); // New button
        JButton checkoutButton = new JButton("Renting");

        // Sign out action
        signOutButton.addActionListener(e -> signOut());

        // Navigate to Physical Rentals screen
        physicalRentalsButton.addActionListener(e -> navigateToPhysicalRentals());
        // Navigate to Request Book screen
        requestBookButton.addActionListener(e -> navigateToRequestBookScreen());
        // Navigate to Newsletter screen
        newsletterButton.addActionListener(e -> navigateToNewsletterScreen());

        // Student Textbooks action
        studentTextbooksButton.addActionListener(e -> navigateToStudentTextbooksScreen());
        // Cart action
        cartButton.addActionListener(e -> navigateToCartScreen());

        // Navigate to list of rented items screen
        checkoutButton.addActionListener(e -> navigateToCheckoutScreen());

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 5));
        buttonsPanel.add(physicalRentalsButton);
        buttonsPanel.add(requestBookButton);
        buttonsPanel.add(newsletterButton);
        buttonsPanel.add(studentTextbooksButton);
        buttonsPanel.add(cartButton);
        buttonsPanel.add(checkoutButton);

        // South panel and Sign out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(signOutButton);

        add(buttonsPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        checkForOverdueBooks();
    }

    private void signOut() {
        dispose();
        UserLogin loginScreen = new UserLogin();
        loginScreen.setVisible(true);
    }

    private void navigateToPhysicalRentals() {
        dispose();
        StudentPhysicalItemScreen physicalItemScreen = new StudentPhysicalItemScreen(userId); // Open the physical item
                                                                                              // screen
        physicalItemScreen.setVisible(true);
    }

    private void navigateToRequestBookScreen() {
        dispose();
        RequestBookScreen requestBookScreen = new RequestBookScreen(userId);
        requestBookScreen.setVisible(true);
    }

    private void navigateToNewsletterScreen() {
        dispose();
        NewspaperMainpage newsletterScreen = new NewspaperMainpage(userId);
        newsletterScreen.setVisible(true);
    }

    private void navigateToStudentTextbooksScreen() {
        dispose();
        StudentTextbooksScreen studentTextbooksScreen = new StudentTextbooksScreen(userId);

        studentTextbooksScreen.setVisible(true);
    }

    private void navigateToCartScreen() {
        dispose();
        CartScreen cartScreenRM = new CartScreen(userId);
        cartScreenRM.setVisible(true);
    }

    private void navigateToCheckoutScreen() {
        dispose();
        CheckedOutItems checkedOutItems = new CheckedOutItems(userId);
        checkedOutItems.setVisible(true);
    }

    private void checkForOverdueBooks() {
        String csvFile = "src/Database/UserBooksBrought.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int userIDFromFile = Integer.parseInt(data[0]);
                if (userIDFromFile == this.userId) {
                    int numberOfDaysOverdue = Integer.parseInt(data[5]);
                    System.out.println(numberOfDaysOverdue);
                    if (numberOfDaysOverdue > 30 && numberOfDaysOverdue < 45) {
                        double penalty = (numberOfDaysOverdue - 30) * 0.05;
                        JOptionPane.showMessageDialog(null,
                                "Penalty applied, item(s) overdue. Your total fine is: $" + penalty, "Overdue Penalty",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (numberOfDaysOverdue > 45) {
                        JOptionPane.showMessageDialog(null,
                                "Your items are over 15 days overdue and now considered lost.",
                                "Lost book notification.", JOptionPane.INFORMATION_MESSAGE);
                    } else if (numberOfDaysOverdue == 29) {
                        JOptionPane.showMessageDialog(null,
                                "Your items are due within the next 24 hours.", "Overdue Penalty",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new StudentDashboard(userId).setVisible(true));
    }
}