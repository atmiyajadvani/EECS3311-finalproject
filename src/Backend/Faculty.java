package Backend;

public class Faculty extends User {
    private String facultyId;

    public Faculty(String email, String password, String userType, String facultyId) {
        super(email, password, userType);
        this.facultyId = facultyId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        //faculty id starts with 1
        facultyId += 3000;
        this.facultyId = facultyId;
    }
}
