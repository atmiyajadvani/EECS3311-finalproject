package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define the User model with a Builder pattern
class User {
    private String email;
    private String password;
    private Role role;

    public enum Role {
        STUDENT, FACULTY, STAFF, VISITOR;

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    private User(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
    }

    // Getters and additional methods (if necessary)

    public static class Builder {
        private String email;
        private String password;
        private Role role;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

// Define the Controller for the registration
class RegistrationController {
    public void registerUser(String email, String password, User.Role role) {
        User user = new User.Builder()
                .email(email)
                .password(password)
                .role(role)
                .build();

        // Here you would add code to actually register the user, such as saving to a database.
        System.out.println("Registered User with email: " + email + " and role: " + role);
    }
}

// Define the View using Java Swing
class RegistrationView extends JFrame {
    private JTextField emailTextField = new JTextField(20);
    private JPasswordField passwordField = new JPasswordField(20);
    private JComboBox<User.Role> roleComboBox = new JComboBox<>(User.Role.values());
    private JButton registerButton = new JButton("Register");
    private RegistrationController controller;

    public RegistrationView() {
        this.controller = new RegistrationController();
        setupUI();
    }

    private void setupUI() {
        setTitle("User Registration");
        setSize(300, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2));
        formPanel.add(new JLabel("Email address:"));
        formPanel.add(emailTextField);
        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);
        formPanel.add(new JLabel("Role:"));
        formPanel.add(roleComboBox);

        // Add action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTextField.getText();
                String password = new String(passwordField.getPassword());
                User.Role role = (User.Role) roleComboBox.getSelectedItem();
                controller.registerUser(email, password, role);
                JOptionPane.showMessageDialog(RegistrationView.this,
                        "User Registered: " + role);
            }
        });

        // Add form panel and register button to the frame
        add(formPanel, BorderLayout.CENTER);
        add(registerButton, BorderLayout.SOUTH);

        // Pack the components and set visible
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Set the look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Launch the GUI
        SwingUtilities.invokeLater(() -> new RegistrationView());
    }
}
