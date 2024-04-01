package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Visitor extends User {
    private static int visitorId;
    private static final String filePath = "src/Database/UserInfoSpreadsheet.csv";

    public Visitor(String email, String password, String userType, int visitorId) {
        super(email, password, userType);
        this.visitorId = visitorId;
    }

    public static int getNextVisitorId() {
        int maxVisitorId = 0;
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 1 && values[3].equalsIgnoreCase("Visitor")) {
                    int currentVisitorId = Integer.parseInt(values[0]);
                    if (currentVisitorId > maxVisitorId) {
                        maxVisitorId = currentVisitorId;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing VisitorID from the file: " + e.getMessage());
        }
        visitorId = maxVisitorId + 1;
        return maxVisitorId + 1;
    }

    public static int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }
}
