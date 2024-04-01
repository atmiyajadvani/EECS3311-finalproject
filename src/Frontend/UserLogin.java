package Frontend;

import javax.swing.*;

import Backend.UserAuthenticator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserLogin extends JFrame {
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    static private int id;

    public UserLogin() {
        createUI();
    }

    private void createUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("YorkU Library Management App - Login");
        setSize(400, 150); // Increased width to accommodate both buttons
        setLocationRelativeTo(null);

        emailTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Sign In");
        JButton signUpButton = new JButton("Sign-up");

        // Sign-in button action listener
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = emailTextField.getText().trim(); // Trim to remove leading/trailing spaces
                String password = new String(passwordField.getPassword()).trim(); // Trim to remove leading/trailing
                                                                                  // spaces

                String csvFile = "src/Database/UserInfoSpreadsheet.csv";
                boolean found = UserAuthenticator.checking(username, password, id);

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Username or password is incorrect!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    // Clear the fields
                    emailTextField.setText("");
                    passwordField.setText("");
                } else {
                    setVisible(false);
                    dispose();
                }

            }

        });

        // Sign-up button action listener
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Sign-up button click
                setVisible(false);
                dispose();
                new UserRegistration().setVisible(true);
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(loginButton);
        buttonPanel.add(signUpButton);

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Email address"));
        add(emailTextField);
        add(new JLabel("Password"));
        add(passwordField);
        add(new JLabel("")); // This just adds an empty space
        add(buttonPanel); // Adding buttons panel
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new UserLogin().setVisible(true);
        });
    }
}

class Dashboard extends JFrame {
    public Dashboard(int id) {
        new StudentDashboard(id).setVisible(true);
    }
}