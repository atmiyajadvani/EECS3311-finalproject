package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        createUI();
    }

    private void createUI() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        setSize(350, 200);
        setLocationRelativeTo(null); // Center the window

        // North panel for title
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Login to Your Account"));
        add(titlePanel, BorderLayout.NORTH);

        // Center panel for form
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        formPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        formPanel.add(usernameField);
        formPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        formPanel.add(passwordField);
        add(formPanel, BorderLayout.CENTER);

        // South panel for login button
        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        buttonPanel.add(loginButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void login() {
        // Placeholder for login logic
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        System.out.println("Logging in with Username: " + username + " and Password: " + password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage();
            }
        });
    }
}

