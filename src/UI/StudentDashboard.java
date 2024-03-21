package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Command interface
interface Command {
    void execute();
}

// Concrete Command to navigate to different screens
class NavigateCommand implements Command {
    private JFrame currentScreen;
    private JFrame nextScreen;

    public NavigateCommand(JFrame currentScreen, JFrame nextScreen) {
        this.currentScreen = currentScreen;
        this.nextScreen = nextScreen;
    }

    @Override
    public void execute() {
        currentScreen.dispose(); // Dispose the current dashboard
        nextScreen.setVisible(true); // Show the next screen
    }
}

// Invoker class that triggers the command
class ButtonInvoker extends JButton {
    private Command command;

    public ButtonInvoker(String text) {
        super(text);
    }

    public void setCommand(Command command) {
        this.command = command;
        this.addActionListener((ActionEvent e) -> {
            if (this.command != null) {
                this.command.execute();
            }
        });
    }
}

public class StudentDashboard extends JFrame {
    static private int userId;
    private JButton signOutButton;
    private JButton physicalRentalsButton;
    private JButton requestBookButton;
    private JButton newsletterButton;

    public StudentDashboard(int userId) {
        this.userId = userId;
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
        JButton studentTextbooksButton = new JButton("Student Textbooks"); // New button
        JButton cartButton = new JButton("Cart"); // New button

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

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 5)); // Adjust the grid size for new buttons
        buttonsPanel.add(physicalRentalsButton);
        buttonsPanel.add(requestBookButton);
        buttonsPanel.add(newsletterButton);
        buttonsPanel.add(studentTextbooksButton); // Add the new button
        buttonsPanel.add(cartButton); // Add the new button

        // South panel with Sign out button
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(signOutButton);

        add(buttonsPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void signOut() {
        dispose(); // Dispose the current dashboard
        UserLogin loginScreen = new UserLogin(); // Open the login screen
        loginScreen.setVisible(true);
    }

    private void navigateToPhysicalRentals() {
        dispose(); // Dispose the current dashboard
        StudentPhysicalItemScreen physicalItemScreen = new StudentPhysicalItemScreen(userId); // Open the physical item screen
        physicalItemScreen.setVisible(true);
    }

    private void navigateToRequestBookScreen() {
        dispose(); // Dispose the current dashboard
        RequestBookScreen requestBookScreen = new RequestBookScreen(userId); // Open the physical item screen
        requestBookScreen.setVisible(true);
    }

    private void navigateToNewsletterScreen() {
        dispose(); // Dispose the current dashboard
        NewspaperMainpage newsletterScreen = new NewspaperMainpage(userId); // Open the physical item screen
        newsletterScreen.setVisible(true);
    }

    private void navigateToStudentTextbooksScreen() {
        dispose(); // Dispose the current dashboard
        StudentTextbooksScreen studentTextbooksScreen = new StudentTextbooksScreen(userId); // Open the physical item screen
        studentTextbooksScreen.setVisible(true);
    }

    private void navigateToCartScreen() {
        dispose(); // Dispose the current dashboard
        CartScreenRM cartScreenRM = new CartScreenRM(userId); // Open the physical item screen
        cartScreenRM.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new StudentDashboard(120).setVisible(true)); // Example userID
    }

}
