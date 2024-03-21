package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        String[] userTypes = {"Student", "Faculty", "Staff", "Manager", "Visitor"};
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
                dispose(); // Close the registration window
                new UserLogin().setVisible(true); // Open the login window
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

                // Check if all fields are filled out
                if (email.isEmpty() || password.isEmpty() || retypePassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if passwords match
                if (!password.equals(retypePassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                    // Clear fields on error
                    clearFields();
                    return;
                }

                // Check if user type is Visitor
                if (!userType.equals("Visitor")) {
                    String verificationCode = JOptionPane.showInputDialog(null, "Enter verification code:");
                    if (verificationCode == null || !verificationCode.equals("123")) {
                        JOptionPane.showMessageDialog(null, "Invalid verification code!", "Error", JOptionPane.ERROR_MESSAGE);
                        // Clear fields on error
                        clearFields();
                        return;
                    }
                }

                // Write user information to the spreadsheet
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/UI/UserInfoSpreadsheet.csv", true))) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
                    String dateRegistered = dateFormat.format(new Date());
                    int id = getNextUserId("src/UI/UserInfoSpreadsheet.csv") + 1; // Increment the last ID from the spreadsheet
                    String id1 = String.valueOf(id);
                    String userData = id1 + "," + email + "," + password + "," + userType + "," + dateRegistered;
                    writer.write("\n" + userData); // Add a newline character before writing the new entry
                    writer.flush();
                    // Write user ID to userToTextbook.csv
                    try (BufferedWriter writerToTextbook = new BufferedWriter(new FileWriter("src/UI/userToTextbook.csv", true))) {
                        writerToTextbook.write(id1);
                        writerToTextbook.newLine(); // Add a newline after writing the ID
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    // Write user ID to userSubs.csv
                    try (BufferedWriter writerSubs = new BufferedWriter(new FileWriter("src/UI/userSubs.csv", true))) {
                        writerSubs.write(id1);
                        writerSubs.newLine(); // Add a newline after writing the ID
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }



                    // Redirect to the appropriate dashboard
                    switch (userType) {
                        case "Student":
                        case "Visitor":
                            new StudentDashboard(id).setVisible(true);
                            break;
                        case "Faculty":
                        case "Staff":
                            new FacultyDashboard(id).setVisible(true);
                            break;
                        case "Manager":
                            new ManagerDashboard(id).setVisible(true);
                            break;
                    }

                    // Close the registration window
                    dispose();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred while writing the user data.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    return;
                }
            }
        });

        panel.add(signInButton);
        panel.add(signUpButton);

        add(panel);

        setVisible(true);
    }

    private static int getNextUserId(String filePath) {
        int maxUserId = 0;
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.split(",")[0].equalsIgnoreCase("UserID")) {
                    int userId = Integer.parseInt(line.split(",")[0]);
                    if (userId > maxUserId) {
                        maxUserId = userId;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing UserID from the file: " + e.getMessage());
        }
        return maxUserId + 1;
    }

    private void clearFields() {
        emailTextField.setText("");
        passwordField.setText("");
        retypePasswordField.setText("");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new UserRegistration().setVisible(true);
        });
    }
}
