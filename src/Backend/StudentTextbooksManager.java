package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTextbooksManager {
    private int userId;

    public StudentTextbooksManager(int userId) {
        this.userId = userId;
    }

    public boolean isCourseCodeValid(String courseCode) {
        boolean isValid = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    isValid = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isValid;
    }

    public String getTextbookForCourse(String courseCode) {
        String textbook = "N/A"; // Default value if no textbook found
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    textbook = parts[1].trim(); // Assuming the textbook is in the second column of TextbookSpreadsheet.csv
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textbook;
    }

    public String addCourse(String courseCode) {
        if (courseCode != null && !courseCode.isEmpty()) {
            if (isCourseCodeValid(courseCode)) {
                String textbook = getTextbookForCourse(courseCode); // Get the textbook for the course
                try {
                    FileWriter writer = new FileWriter("src/Database/VirtualCopies.csv", true); // Append mode
                    writer.append(userId + "," + courseCode + "," + textbook + "\n"); // Assuming userId is unique per user
                    writer.close();
                    return "Course added successfully!";
                } catch (IOException ex) {
                    ex.printStackTrace();
                    return "Error adding course.";
                }
            }
            return "Course code does not exist.";
        }
        return "Invalid course code.";
    }

}
