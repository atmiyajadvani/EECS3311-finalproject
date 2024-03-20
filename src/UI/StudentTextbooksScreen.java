package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTextbooksScreen extends JFrame {
    static private int userId;

    public StudentTextbooksScreen(int userId) {
        this.userId = userId;
        setTitle("Student Textbooks");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JLabel label = new JLabel("Welcome to Student Textbooks Screen, UserID: " + userId);
        //add(label, BorderLayout.CENTER);

        // Check user's course codes
        checkUserCourseCodes();
    }

    private void checkUserCourseCodes() {
        //find user id amongst csv file with userToTestbook.csv

        //if found
        //check if there is a value in the next column
        //yes there is? great, take it and send it to another method
        //no there is not? go to prompt for Course codes

    }


    private void promptForCourseCodes() {
        System.out.println(5);
        String courseCodesInput = JOptionPane.showInputDialog(this,
                "Please enter your four letter course code.\nIf there is more than one, please put a comma in between with no spaces.\n(EECS, MODR, SOSC, SCOE, MECH, ARTS, POLI, PSYC, ANTH, FINC, BIOC, MGMT, PHYS, LITR, MARK):",
                "Enter Course Codes",
                JOptionPane.PLAIN_MESSAGE);

        if (courseCodesInput != null) {
            List<String> validCourseCodes = Arrays.asList("EECS", "MODR", "SOSC", "SCOE", "MECH", "ARTS", "POLI", "PSYC", "ANTH", "FINC", "BIOC", "MGMT", "PHYS", "LITR", "MARK");
            List<String> inputCodes = Arrays.asList(courseCodesInput.split(","));

            // Trim each code
            List<String> trimmedCodes = new ArrayList<>();
            for (String code : inputCodes) {
                trimmedCodes.add(code.trim());
            }

            if (validCourseCodes.containsAll(trimmedCodes)) {
                System.out.println(6);
                // All codes are valid, continue to the textbook screen
                // Navigate to the textbook screen
                dispose(); // Close the current screen
                // Pass userId and courseCodesInput to the next screen
                // For now, let's just print them
                System.out.println("UserID: " + userId);
                System.out.println("Course Codes: " + courseCodesInput);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid course code(s). Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                // Prompt again if invalid codes
                promptForCourseCodes();
            }
        } else {
            // User canceled or pressed back
            // Navigate back to the student dashboard
            dispose(); // Close the current screen
            StudentDashboard dashboard = new StudentDashboard(userId);
            dashboard.setVisible(true);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            StudentTextbooksScreen textbooksScreen = new StudentTextbooksScreen(123); // Pass any dummy userId for testing
            textbooksScreen.setVisible(true);
        });
    }
}
