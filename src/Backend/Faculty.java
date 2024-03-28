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
        this.facultyId = facultyId;
    }
}
