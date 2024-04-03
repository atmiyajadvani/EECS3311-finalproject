package Frontend;

import Backend.RegistrationException;
import Backend.UserManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistration extends JFrame {
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JPasswordField retypePasswordField;
    private JComboBox<String> userTypeComboBox;

    public UserRegistration() {
        createUI();
    }

    private void createUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("User Registration");
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        emailTextField = new JTextField();
        passwordField = new JPasswordField();
        retypePasswordField = new JPasswordField();
        String[] userTypes = { "Student", "Faculty", "Staff", "Visitor" };
        userTypeComboBox = new JComboBox<>(userTypes);

        panel.add(new JLabel("Email:"));
        panel.add(emailTextField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("Retype Password:"));
        panel.add(retypePasswordField);
        panel.add(new JLabel("User Type:"));
        panel.add(userTypeComboBox);

        JButton signInButton = new JButton("Sign In");
        JButton signUpButton = new JButton("Sign Up");

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Sign In button click
                dispose();
                new UserLogin().setVisible(true);
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Sign Up button click
                String email = emailTextField.getText();
                String password = new String(passwordField.getPassword());
                String retypePassword = new String(retypePasswordField.getPassword());
                String userType = (String) userTypeComboBox.getSelectedItem();

                try {
                    UserManager.registerUser(email, password, retypePassword, userType);
                } catch (RegistrationException ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });

        panel.add(signInButton);
        panel.add(signUpButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new UserRegistration().setVisible(true);
        });
    }
}
