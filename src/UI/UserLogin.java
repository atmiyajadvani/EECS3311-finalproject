package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserLogin extends JFrame {
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public UserLogin() {
        createUI();
    }

    private void createUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("YorkU Library Management App - Login");
        setSize(300, 150);
        setLocationRelativeTo(null);

        emailTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Sign In");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (authenticate(emailTextField.getText(), passwordField.getPassword())) {
                        // Hide the login window
                        setVisible(false);
                        dispose();
                        // Open the Student Dashboard
                        new Dashboard().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Email address"));
        add(emailTextField);
        add(new JLabel("Password"));
        add(passwordField);
        add(new JLabel("")); // This just adds an empty space
        add(loginButton);
    }

    private boolean authenticate(String email, char[] password) throws Exception {
        String hashedPassword = hashPassword(new String(password));
        try (BufferedReader reader = new BufferedReader(new FileReader("users.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(email) && credentials[1].equals(hashedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading from the CSV file", e);
        }
        return false;
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new UserLogin().setVisible(true);
        });
    }
}

class Dashboard extends JFrame {
    public Dashboard() {
        new StudentDashboard().setVisible(true);
    }
}
