package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserRegistration {

    public static void main(String[] args) {
        UserRegistrationView view = new UserRegistrationView();
        UserRegistrationModel model = new UserRegistrationModel();
        new UserRegistrationController(view, model);
    }
}

class UserRegistrationView extends JFrame {
    JTextField emailTextField;
    JPasswordField passwordField;
    JComboBox<String> roleComboBox;
    JButton registerButton;

    public UserRegistrationView() {
        emailTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        roleComboBox = new JComboBox<>(new String[]{"Student", "Faculty", "Staff"});
        registerButton = new JButton("Register");

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Email address"));
        panel.add(emailTextField);
        panel.add(new JLabel("Password"));
        panel.add(passwordField);
        panel.add(new JLabel("Role"));
        panel.add(roleComboBox);
        panel.add(registerButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("User Registration");
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    public String getEmail() {
        return emailTextField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public String getRole() {
        return (String) roleComboBox.getSelectedItem();
    }

    public void addRegisterListener(ActionListener actionListener) {
        registerButton.addActionListener(actionListener);
    }
}

class UserRegistrationController {
    UserRegistrationView view;
    UserRegistrationModel model;

    public UserRegistrationController(UserRegistrationView view, UserRegistrationModel model) {
        this.view = view;
        this.model = model;
        view.addRegisterListener(new RegisterListener());
    }

    class RegisterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String email = view.getEmail();
            String password = view.getPassword();
            String role = view.getRole();

            if (model.registerUser(email, password, role)) {
                JOptionPane.showMessageDialog(null, "User registered successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class UserRegistrationModel {
    public boolean registerUser(String email, String password, String role) {
        try {
            String hashedPassword = hashPassword(password);
            FileWriter writer = new FileWriter("users.csv", true);
            writer.append(email).append(",").append(hashedPassword).append(",").append(role).append("\n");
            writer.flush();
            writer.close();
            return true;
        } catch (IOException | NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return false;
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
}
