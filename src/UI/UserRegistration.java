package UI;

import javax.swing.*;
import java.awt.*;

public class UserRegistration {
    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new JFrame("User Registration");

        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the layout for the JPanel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Creating JLabel for email
        JLabel userLabel = new JLabel("Email address");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Creating text field for email
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Creating JLabel for password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        // Creating text field for password
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Creating JLabel for role
        JLabel roleLabel = new JLabel("Role");
        roleLabel.setBounds(10, 80, 80, 25);
        panel.add(roleLabel);

        // Creating Dropdown for roles
        String[] roles = new String[]{"Student", "Faculty", "Staff", "Visitor"};
        JComboBox<String> roleList = new JComboBox<>(roles);
        roleList.setBounds(100, 80, 165, 25);
        panel.add(roleList);

        // Creating register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100, 110, 100, 25);
        panel.add(registerButton);
    }
}
