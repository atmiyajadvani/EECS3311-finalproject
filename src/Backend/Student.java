package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student extends User {
    private static int studentId;
    private static final String filePath = "src/Database/UserInfoSpreadsheet.csv";

    public Student(String email, String password, String userType, int studentId) {
        super(email, password, userType);
        this.studentId = studentId;
    }

    public static int getNextStudentId() {
        int maxStudentId = 0;
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 1 && values[3].equalsIgnoreCase("Student")) {
                    int currentStudentId = Integer.parseInt(values[0]);
                    if (currentStudentId > maxStudentId) {
                        maxStudentId = currentStudentId;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing StudentID from the file: " + e.getMessage());
        }
        studentId = maxStudentId + 1;
        return maxStudentId + 1;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {

        if(studentId > 0){
            this.studentId = studentId;
        }

    }
}