package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manager extends User {
    private static int managerId;
    private static final String filePath = "src/Database/UserInfoSpreadsheet.csv";

    public Manager(String email, String password, String userType, int managerId) {
        super(email, password, userType);
        this.managerId = managerId;
    }

    public static int getNextManagerId() {
        int maxManagerId = 0;
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 1 && values[3].equalsIgnoreCase("Manager")) {
                    int currentManagerId = Integer.parseInt(values[0]);
                    if (currentManagerId > maxManagerId) {
                        maxManagerId = currentManagerId;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing ManagerID from the file: " + e.getMessage());
        }
        managerId = maxManagerId + 1;
        return maxManagerId + 1;
    }

    public static int getManagerId() {
        return managerId;
    }

    public void setManagerRole(int managerId) {
        if(managerId>0){
            this.managerId = managerId;
        }
    }
}
