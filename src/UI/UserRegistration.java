package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
        setTitle("User Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200); // Adjusted size for better UI appearance
        setLocationRelativeTo(null); // Center on screen
    }

    private void createUI() {
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 10, 10)); // Grid layout for form elements
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding

        emailTextField = new JTextField();
        passwordField = new JPasswordField();
        roleComboBox = new JComboBox<>(new String[]{"Student", "Faculty", "Staff", "Visitor"});
        registerButton = new JButton("Register");

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailTextField);
        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);
        formPanel.add(new JLabel("Role:"));
        formPanel.add(roleComboBox);

        registerButton.addActionListener(e -> registerUser());

        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(registerButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void registerUser() {
        try {
            String email = emailTextField.getText();
            String password = new String(passwordField.getPassword());
            String role = (String) roleComboBox.getSelectedItem();

            if (registerUser(email, password, role)) {
                JOptionPane.showMessageDialog(this, "User registered successfully!");
                this.dispose(); // Close the registration window
                new UserLogin().setVisible(true); // Open the login screen
            } else {
                JOptionPane.showMessageDialog(this, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
    /**
    private Boolean addToRoleCSV() throws IOException {
        String role = (String) roleComboBox.getSelectedItem();
        if (role == "Faculty") {
            try (FileWriter writer = new FileWriter("facultyusers.csv", true)) {
                writer.append(email).append(",").append(hashedPassword).append(",").append(role).append("\n");
                return true;
            } catch (IOException e) {
                throw new IOException("Error writing to the CSV file", e);
            }
        }

        if (role == "Student") {
            try (FileWriter writer = new FileWriter("facultyusers.csv", true)) {
                writer.append(email).append(",").append(hashedPassword).append(",").append(role).append("\n");
                return true;
            } catch (IOException e) {
                throw new IOException("Error writing to the CSV file", e);
            }
        }
    }
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserRegistration().setVisible(true));
    }
}
