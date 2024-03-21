import UI.UserRegistration;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Initialize and display the UserRegistration form
                UserRegistration registrationForm = new UserRegistration();
                registrationForm.setVisible(true);
            }
        });
    }
}
