package Backend;

public class Student extends User {
    private int studentId;

    public Student(String email, String password, String userType, int studentId) {
        super(email, password, userType);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        //student id starts with 1
        studentId += 1000;
        this.studentId = studentId;
    }
}