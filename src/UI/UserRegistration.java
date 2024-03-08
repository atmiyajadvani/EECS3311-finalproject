package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserRegistration extends JFrame {

    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton registerButton;

    public UserRegistration() {
        createUI();
    }

    private void createUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("User Registration");
        setSize(300, 150);
        setLocationRelativeTo(null);

        emailTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        roleComboBox = new JComboBox<>(new String[]{"Student", "Faculty", "Staff"});
        registerButton = new JButton("Register");

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String email = emailTextField.getText();
                    String password = new String(passwordField.getPassword());
                    String role = (String) roleComboBox.getSelectedItem();

                    if (!isValidEmail(email)) {
                        JOptionPane.showMessageDialog(null, "Enter a valid email address.");
                        return;
                    }

                    if (!isValidPassword(password)) {
                        JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters, including uppercase, lowercase, and symbols.");
                        return;
                    }

                    if (registerUser(email, password, role)) {
                        JOptionPane.showMessageDialog(null, "User registered successfully!");
                        // Navigate to UserLogin screen
                        UserRegistration.this.dispose();
                        new UserLogin().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        setLayout(new GridLayout(4, 1));
        add(new JLabel("Email address"));
        add(emailTextField);
        add(new JLabel("Password"));
        add(passwordField);
        add(new JLabel("Role"));
        add(roleComboBox);
        add(registerButton);
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 4;
    }

    private boolean registerUser(String email, String password, String role) throws NoSuchAlgorithmException, IOException {
        String hashedPassword = hashPassword(password);
        try (FileWriter writer = new FileWriter("users.csv", true)) {
            writer.append(email).append(",").append(hashedPassword).append(",").append(role).append("\n");
            return true;
        } catch (IOException e) {
            throw new IOException("Error writing to the CSV file", e);
        }
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
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }
}
