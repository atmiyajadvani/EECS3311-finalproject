package Backend;

import javax.swing.*;
import Frontend.FacultyDashboard;
import Frontend.ManagerDashboard;
import Frontend.StudentDashboard;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager {

    public static boolean registerUser(String email, String password, String retypePassword, String userType) {
        String canBorrow = "yes";
        int itemsBorrowed = 0;
        int itemsOverdue = 0;

        // Check if all fields are filled out
        if (email.isEmpty() || password.isEmpty() || retypePassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if email format is valid
        if (!isValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if email is unique
        if (!isEmailUnique(email)) {
            JOptionPane.showMessageDialog(null, "This email is already in use!", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if passwords match
        if (!password.equals(retypePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if user type is Visitor
        if (!userType.equals("Visitor")) {
            String verificationCode = JOptionPane.showInputDialog(null, "Enter verification code:");
            if (verificationCode == null || !verificationCode.equals("123")) {
                JOptionPane.showMessageDialog(null, "Invalid verification code!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        // Write user information to the spreadsheet
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("src/Database/UserInfoSpreadsheet.csv", true))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            String dateRegistered = dateFormat.format(new Date());
            int id = getNextUserId("src/Database/UserInfoSpreadsheet.csv", userType);
            String id1 = String.valueOf(id);

            registerUserWithDashboard(email, password, retypePassword, userType, id);

            String userData = id1 + "," + email + "," + password + "," + userType + "," + dateRegistered + ","
                    + canBorrow + "," + itemsBorrowed + "," + itemsOverdue;
            writer.write("\n" + userData); // Add a newline character before writing the new entry
            writer.flush();
            // Write user ID to userToTextbook.csv
            try (BufferedWriter writerToTextbook = new BufferedWriter(
                    new FileWriter("src/Database/userToTextbook.csv", true))) {
                writerToTextbook.write(id1);
                writerToTextbook.newLine(); // Add a newline after writing the ID
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            // Write user ID to userSubs.csv
            try (BufferedWriter writerSubs = new BufferedWriter(
                    new FileWriter("src/Database/userSubs.csv", true))) {
                writerSubs.write(id1 + ",0,0,0,0");
                writerSubs.newLine(); // Add a newline after writing the ID
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            if (userType.equals("Faculty")) {
                try (BufferedWriter writerFaculty = new BufferedWriter(
                        new FileWriter("src/Database/FacultyUsers.csv", true))) {
                    writerFaculty.write(id1);
                    writerFaculty.newLine(); // Add a newline after writing the ID
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (userType.equals("Student")) {
                try (BufferedWriter writerFaculty = new BufferedWriter(
                        new FileWriter("src/Database/VirtualCopies.csv", true))) {
                    writerFaculty.write(id1);
                    writerFaculty.newLine(); // Add a newline after writing the ID
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            return true;

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while writing the user data.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
    }

    // Method to validate email format
    public static boolean isValidEmailFormat(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    // Method to check if the email is unique
    public static boolean isEmailUnique(String email) {
        String filePath = "src/Database/UserInfoSpreadsheet.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 1 && values[1].equalsIgnoreCase(email)) {
                    return false; // Email already exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true; // Email is unique
    }

    public static int getNextUserId(String filePath, String userType) {
        // int maxUserId = 0;
        // String line = "";
        // try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        // while ((line = br.readLine()) != null) {
        // if (!line.trim().isEmpty() && !line.split(",")[0].equalsIgnoreCase("UserID"))
        // {
        // int userId = Integer.parseInt(line.split(",")[0]);
        // if (userId > maxUserId) {
        // maxUserId = userId;
        // }
        // }
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (NumberFormatException e) {
        // System.out.println("Error parsing UserID from the file: " + e.getMessage());
        // }
        // return maxUserId + 1;
        int id = 0;
        switch (userType) {
            case "Student":
                id = Student.getNextStudentId();
                break;
            case "Visitor":
                id = Visitor.getNextVisitorId();
                break;
            case "Faculty":
            case "Staff":
                id = Faculty.getNextFacultyId();
                break;
            case "Manager":
                id = Manager.getNextManagerId();
                break;
        }
        return id;

    }

    public static void registerUserWithDashboard(String email, String password, String retypePassword,
            String userType, int id) {
        switch (userType) {
            case "Student":
                // String email, String password, String userType, int studentId
                Student student = new Student(email, password, userType, id);
                new StudentDashboard(student).setVisible(true);
                break;
            case "Visitor":
                Visitor visitor = new Visitor(email, password, userType, id);
                new StudentDashboard(visitor).setVisible(true);
                break;
            case "Faculty":
            case "Staff":
                Faculty faculty = new Faculty(email, password, userType, id);
                new FacultyDashboard(faculty).setVisible(true);
                break;
            case "Manager":
                Manager manager2 = new Manager(email, password, userType, id);
                new ManagerDashboard(manager2).setVisible(true);
                break;
        }
    }
}
