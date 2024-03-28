package Backend;

public class Manager extends User {
    private String managerId;

    public Manager(String email, String password, String userType, String managerId) {
        super(email, password, userType);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerRole(String managerId) {
        //manager id starts with 1
        managerId += 4000;
        this.managerId = managerId;
    }
}