package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Faculty extends User {
    private static int facultyId;
    private static final String filePath = "src/TestCases/CSV/UserInfoSpreadsheet2.csv";

    public Faculty(String email, String password, String userType, int facultyId) {
        super(email, password, userType);
        this.facultyId = facultyId;
    }

    public static int getNextFacultyId() {
        int maxFacultyId = 0;
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 1
                        && (values[3].equalsIgnoreCase("Faculty") || values[3].equalsIgnoreCase("Staff"))) {
                    int currentFacultyId = Integer.parseInt(values[0]);
                    if (currentFacultyId > maxFacultyId) {
                        maxFacultyId = currentFacultyId;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing FacultyID from the file: " + e.getMessage());
        }
        facultyId = maxFacultyId + 1;
        return maxFacultyId + 1;
    }

    public static int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {

        if(facultyId>0){
            this.facultyId = facultyId;
        }
    }
}
