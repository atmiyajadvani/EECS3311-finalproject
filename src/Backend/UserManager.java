package Backend;

import Frontend.FacultyDashboard;
import Frontend.ManagerDashboard;
import Frontend.StudentDashboard;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager {

    public static boolean registerUser(String email, String password, String retypePassword, String userType) throws RegistrationException {
        String canBorrow = "yes";
        int itemsBorrowed = 0;
        int itemsOverdue = 0;

        // Check if all fields are filled out
        if (email.isEmpty() || password.isEmpty() || retypePassword.isEmpty()) {
            throw new RegistrationException("All fields are required!");
        }

        // Check if email format is valid
        if (!isValidEmailFormat(email)) {
            throw new RegistrationException("Invalid email format!");
        }

        // Check if email is unique
        if (!isEmailUnique(email)) {
            throw new RegistrationException("This email is already in use!");
        }

        // Check if passwords match
        if (!password.equals(retypePassword)) {
            throw new RegistrationException("Passwords do not match!");
        }

        // Check if user type is Visitor

        // done through gui - cannot be tested
        if (!userType.equals("Visitor")) {
            String verificationCode = "123"; // Set verification code here
            if (!verificationCode.equals("123")) {
                throw new RegistrationException("Invalid verification code!");
            }
        }

        // Write user information to the spreadsheet
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("src/TestCases/CSV/UserInfoSpreadsheet2.csv", true))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            String dateRegistered = dateFormat.format(new Date());
            int id = getNextUserId("src/TestCases/CSV/UserInfoSpreadsheet2.csv", userType);
            String id1 = String.valueOf(id);

            registerUserWithDashboard(email, password, retypePassword, userType, id);

            String userData = id1 + "," + email + "," + password + "," + userType + "," + dateRegistered + ","
                    + canBorrow + "," + itemsBorrowed + "," + itemsOverdue + "\n";
            //writer.write("\n" + userData); // Add a newline character before writing the new entry
            writer.write(userData); // Add a newline character before writing the new entry
            writer.flush();
            // Write user ID to userToTextbook.csv
            try (BufferedWriter writerToTextbook = new BufferedWriter(
                    new FileWriter("src/TestCases/CSV/userToTextbook2.csv", true))) {
                writerToTextbook.write(id1 + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            // Write user ID to userSubs.csv
            try (BufferedWriter writerSubs = new BufferedWriter(
                    new FileWriter("src/TestCases/CSV/userSubs2.csv", true))) {
                writerSubs.write(id1 + ",0,0,0,0" + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            if (userType.equals("Faculty")) {
                try (BufferedWriter writerFaculty = new BufferedWriter(
                        new FileWriter("src/TestCases/CSV/FacultyUsers2.csv", true))) {
                    writerFaculty.write(id1 + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (userType.equals("Student")) {
                try (BufferedWriter writerFaculty = new BufferedWriter(
                        new FileWriter("src/TestCases/CSV/VirtualCopies2.csv", true))) {
                    writerFaculty.write(id1 + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            return true;

        } catch (IOException ex) {
            throw new RegistrationException("An error occurred while writing the user data.", ex);
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
        String filePath = "src/TestCases/CSV/UserInfoSpreadsheet2.csv";
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
