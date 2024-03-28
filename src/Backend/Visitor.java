package Backend;

public class Visitor extends User {
    private String visitorPurpose;

    public Visitor(String email, String password, String userType, String visitorPurpose) {
        super(email, password, userType);
        this.visitorPurpose = visitorPurpose;
    }

    public String getVisitorPurpose() {
        return visitorPurpose;
    }

    public void setVisitorPurpose(String visitorPurpose) {
        this.visitorPurpose = visitorPurpose;
    }
}
