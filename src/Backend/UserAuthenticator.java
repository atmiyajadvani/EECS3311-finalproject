package Backend;

import javax.swing.*;

import Frontend.FacultyDashboard;
import Frontend.ManagerDashboard;
import Frontend.StudentDashboard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserAuthenticator {
    private static String csvFile = "src/TestCases/CSV/UserInfoSpreadsheet2.csv";
    private static String username;
    private static String password;

    public static boolean checking(String email1, String pass1, int id) {
        username = email1;
        password = pass1;

        if (username.isEmpty() || password.isEmpty()) {
            // JOptionPane.showMessageDialog(null, "Email and password are required!",
            // "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

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
                        case "Visitor":
                            Visitor visitor = new Visitor(email1, pass1, "Visitor", id);
                            new StudentDashboard(id).setVisible(true);
                            break;
                        case "Student":
                            Student student = new Student(email1, pass1, "Student", id);
                            new StudentDashboard(id).setVisible(true);
                            break;
                        case "Faculty":
                            Faculty faculty1 = new Faculty(email1, pass1, "Faculty", id);
                            new FacultyDashboard(id).setVisible(true);
                            break;
                        case "Staff":
                            Faculty faculty = new Faculty(email1, pass1, "Faculty", id);
                            new FacultyDashboard(id).setVisible(true);
                            break;
                        case "Manager":
                            Manager manager = new Manager(email1, pass1, "Manager", id);
                            // Open the Student Dashboard
                            new ManagerDashboard(id).setVisible(true);
                            break;
                    }
                    break;
                }
            }
            reader.close();
            return found;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while reading the user data.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return false;
    }
}