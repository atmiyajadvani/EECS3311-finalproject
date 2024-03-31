package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FacultyCoursesManager {
    private int userId;

    public FacultyCoursesManager(int userId) {
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
        String textbook = "N/A";
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Database/TextbookSpreadsheet.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(courseCode.trim())) {
                    textbook = parts[1].trim();
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
                String textbook = getTextbookForCourse(courseCode);
                try {
                    FileWriter writer = new FileWriter("src/Database/FacultyUsers.csv", true);
                    writer.append(userId + "," + courseCode + "," + textbook + "\n");
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