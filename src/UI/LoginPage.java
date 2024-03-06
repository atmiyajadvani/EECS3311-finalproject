package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// CSV to Json
public class LoginPage extends JFrame{
    private JTextField UserText;
    private JPanel panel1;
    private JPasswordField password;
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

        // Check login credentials (placeholder logic)
        boolean isValidLogin = true; // Placeholder for login validation
        if (isValidLogin) {
            // If login is valid, close the login page and open the dashboard
            dispose(); // Close the login page
            openDashboard(); // Open the dashboard
        } else {
            // If login is invalid, display an error message
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openDashboard() {
        SwingUtilities.invokeLater(() -> {
            new Dashboard().setVisible(true); // Open the dashboard
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage();
            }
        });
    }

    public LoginPage() {
        frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize((new Dimension(300, 250)));
        frame.setResizable(false);

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Add ActionListener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered username and password
                String username = UserText.getText();
                char[] passwordChars = password.getPassword();
                String enteredPassword = new String(passwordChars);

                // Validate against the database
                boolean isValid = validateAgainstDatabase(username, enteredPassword);

                // Display a message based on the validation result
                if (isValid) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                    // Perform actions after successful login
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials. Please try again.");
                    // Perform actions after unsuccessful login
                }
            }
        });
    }

    private boolean validateAgainstDatabase(String username, String enteredPassword) {

// Make a public database ig or csv reader


        // Update the JDBC URL, username, and password for your MySQL configuration
        String jdbcUrl = "jdbc:mysql://localhost:3306/user_info";
        String dbUsername = "root";
        String dbPassword = "1234";


        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
            String sql = "SELECT * FROM user_info WHERE name = ? AND password = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, enteredPassword);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if(resultSet.next()){
                        String testname = resultSet.getString("name");
                        String testPassword = resultSet.getString("password");

                        System.out.println("Name from Database: " + testname);
                        System.out.println("Password from Database: " + testPassword);

                        return true;
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }








}
