package Backend;

public class Visitor extends User {
    private String visitorId;

    public Visitor(String email, String password, String userType, String visitorId) {
        super(email, password, userType);
        this.visitorId = visitorId;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        //visitor id starts with 2
        visitorId += 2000;
        this.visitorId = visitorId;
    }
}
