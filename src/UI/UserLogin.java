package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Strategy Pattern for Authentication
interface AuthenticationStrategy {
    boolean authenticate(String username, String password);
}

class CsvAuthenticationStrategy implements AuthenticationStrategy {
    private final String csvFile = "src/UI/UserInfoSpreadsheet.csv";

    @Override
    public boolean authenticate(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (userInfo.length >= 4 && userInfo[1].equals(username) && userInfo[2].equals(password)) {
                    UserLogin.setId(Integer.parseInt(userInfo[0]));
                    UserLogin.setUserType(userInfo[3]);
                    return true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

// Factory Pattern for Dashboard Creation
abstract class DashboardFactory {
    abstract JFrame createDashboard(String userType, int userId);
}

class DashboardFactoryImpl extends DashboardFactory {
    @Override
    public JFrame createDashboard(String userType, int userId) {
        switch (userType) {
            case "Visitor":
            case "Student":
                return new StudentDashboard(userId);
            case "Faculty":
            case "Staff":
                return new FacultyDashboard(userId);
            case "Manager":
                return new ManagerDashboard();
            default:
                throw new IllegalArgumentException("Invalid user type: " + userType);
        }
    }
}

public class UserLogin extends JFrame {
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private static int id;
    private static String userType;
    private AuthenticationStrategy authenticationStrategy = new CsvAuthenticationStrategy();
    private DashboardFactory dashboardFactory = new DashboardFactoryImpl();

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
                String password = new String(passwordField.getPassword()).trim(); // Trim to remove leading/trailing spaces

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email and password are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String csvFile = "src/UI/UserInfoSpreadsheet.csv";

                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                    String line;
                    boolean found = false;
                    while ((line = reader.readLine()) != null) {
                        String[] userInfo = line.split(",");
                        if (userInfo.length >= 4 && userInfo[1].equals(username) && userInfo[2].equals(password)) {
                            found = true;
                            id = Integer.parseInt(userInfo[0]);
                            String userType = userInfo[3];
                            switch (userType) {
                                case "Visitor" :
                                case "Student":
                                    // Hide the login window
                                    setVisible(false);
                                    dispose();
                                    // Open the Student Dashboard
                                    new StudentDashboard(id).setVisible(true);
                                    break;
                                case "Faculty":
                                case "Staff":
                                    // Hide the login window
                                    setVisible(false);
                                    dispose();
                                    // Open the Faculty/Staff Dashboard
                                    new FacultyDashboard(id).setVisible(true);
                                    break;
                                case "Manager":
                                    // Hide the login window
                                    setVisible(false);
                                    dispose();
                                    // Open the Manager Dashboard
                                    new ManagerDashboard().setVisible(true);
                                    break;
                            }
                            break;
                        }
                    }
                    reader.close();
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "Username or password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
                        // Clear the fields
                        emailTextField.setText("");
                        passwordField.setText("");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred while reading the user data.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
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

    private void onLogin(ActionEvent e) {
        String username = emailTextField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email and password are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (authenticationStrategy.authenticate(username, password)) {
            setVisible(false);
            dispose();
            dashboardFactory.createDashboard(userType, id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Username or password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
            // Clear fields
            emailTextField.setText("");
            passwordField.setText("");
        }
    }

    public static void setId(int userId) {
        id = userId;
    }

    public static void setUserType(String type) {
        userType = type;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new UserLogin().setVisible(true));
    }
}
