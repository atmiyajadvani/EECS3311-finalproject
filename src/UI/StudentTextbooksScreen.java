package UI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Strategy Interface for Validation
interface CourseCodeValidationStrategy {
    boolean validate(List<String> inputCodes);
}

// Concrete Strategy for Course Code Validation
class BasicCourseCodeValidation implements CourseCodeValidationStrategy {
    private List<String> validCourseCodes = Arrays.asList(
            "EECS", "MODR", "SOSC", "SCOE", "MECH", "ARTS", "POLI", "PSYC", "ANTH",
            "FINC", "BIOC", "MGMT", "PHYS", "LITR", "MARK");

    @Override
    public boolean validate(List<String> inputCodes) {
        // Logic for validation
        for (String code : inputCodes) {
            if (!validCourseCodes.contains(code.trim().toUpperCase())) {
                return false;
            }
        }
        return true;
    }
}

public class StudentTextbooksScreen extends JFrame {
    private int userId;
    private CourseCodeValidationStrategy validationStrategy;

    public StudentTextbooksScreen(int userId) {
        this.userId = userId;
        this.validationStrategy = new BasicCourseCodeValidation(); // Use basic validation strategy

        setTitle("Student Textbooks");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkUserCourseCodes();
    }

    private void checkUserCourseCodes() {
        // This method's implementation might be similar to the original,
        // assuming it eventually calls `promptForCourseCodes` for user input.
        promptForCourseCodes();
    }

    private void promptForCourseCodes() {
        String courseCodesInput = JOptionPane.showInputDialog(this,
                "Enter your course codes separated by commas:",
                "Enter Course Codes", JOptionPane.PLAIN_MESSAGE);

        if (courseCodesInput != null && !courseCodesInput.trim().isEmpty()) {
            List<String> inputCodes = Arrays.asList(courseCodesInput.split(","));
            if (validationStrategy.validate(inputCodes)) {
                // Proceed if validation passes
                System.out.println("Valid codes: " + inputCodes);
                // Further processing
            } else {
                // Retry if validation fails
                JOptionPane.showMessageDialog(this, "Invalid course code(s). Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                promptForCourseCodes();
            }
        } else {
            // Handle cancelation or empty input appropriately
            System.out.println("No input or cancelled");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new StudentTextbooksScreen(123).setVisible(true));
    }
}
