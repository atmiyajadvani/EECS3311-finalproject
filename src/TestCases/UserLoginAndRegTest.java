package TestCases;
import Backend.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class UserLoginAndRegTest {
    //REGISTRATION - UserManager
    // Test for registerUser method when all fields are filled correctly
    @Test
    public void testRegisterUserValid() {
        assertTrue(UserManager.registerUser("test@example.com", "password123", "password123", "Visitor"));
    }

    // Test for registerUser method when email is empty
    @Test
    public void testRegisterUserEmptyEmail() {
        assertFalse(UserManager.registerUser("", "password123", "password123", "Visitor"));
    }

    // Test for registerUser method when password is empty
    @Test
    public void testRegisterUserEmptyPassword() {
        assertFalse(UserManager.registerUser("test@example.com", "", "password123", "Visitor"));
    }

    // Test for registerUser method when retypePassword is empty
    @Test
    public void testRegisterUserEmptyRetypePassword() {
        assertFalse(UserManager.registerUser("test@example.com", "password123", "", "Visitor"));
    }

    // Test for registerUser method when email format is invalid
    @Test
    public void testRegisterUserInvalidEmailFormat() {
        assertFalse(UserManager.registerUser("invalidemail", "password123", "password123", "Visitor"));
    }

    // Test for registerUser method when email is not unique
    @Test
    public void testRegisterUserNonUniqueEmail() {
        // Assuming "test@example.com" already exists in the database
        assertFalse(UserManager.registerUser("test@example.com", "password123", "password123", "Visitor"));
    }

    // Test for registerUser method when passwords do not match
    @Test
    public void testRegisterUserPasswordsDoNotMatch() {
        assertFalse(UserManager.registerUser("test@example.com", "password123", "password456", "Visitor"));
    }

    // Test for registerUser method when user type is not Visitor and verification code is incorrect
    @Test
    public void testRegisterUserIncorrectVerificationCode() {
        // Assuming verification code entered is incorrect
        assertFalse(UserManager.registerUser("test@example.com", "password123", "password123", "Student"));
    }

    // Test for isValidEmailFormat method when email format is valid
    @Test
    public void testIsValidEmailFormatValid() {
        assertTrue(UserManager.isValidEmailFormat("test@example.com"));
    }

    // Test for isValidEmailFormat method when email format is invalid
    @Test
    public void testIsValidEmailFormatInvalid() {
        assertFalse(UserManager.isValidEmailFormat("invalidemail"));
    }

    // Test for isEmailUnique method when email is unique
    @Test
    public void testIsEmailUniqueUniqueEmail() {
        assertTrue(UserManager.isEmailUnique("unique@example.com"));
    }

    // Test for isEmailUnique method when email is not unique
    @Test
    public void testIsEmailUniqueNonUniqueEmail() {
        // Assuming "test@example.com" already exists in the database
        assertFalse(UserManager.isEmailUnique("test@example.com"));
    }

    // Test for getNextUserId method
    @Test
    public void testGetNextUserId() {
        // Write test cases for each user type
        int studentId = UserManager.getNextUserId("src/Database/UserInfoSpreadsheet.csv", "Student");
        assertTrue(studentId > 0);

        int visitorId = UserManager.getNextUserId("src/Database/UserInfoSpreadsheet.csv", "Visitor");
        assertTrue(visitorId > 0);

        int facultyId = UserManager.getNextUserId("src/Database/UserInfoSpreadsheet.csv", "Faculty");
        assertTrue(facultyId > 0);

        int managerId = UserManager.getNextUserId("src/Database/UserInfoSpreadsheet.csv", "Manager");
        assertTrue(managerId > 0);
    }

    // Test for registerUserWithDashboard method
    @Test
    public void testRegisterUserWithDashboard() {
        // Write test cases for each user type
        UserManager.registerUserWithDashboard("test@example.com", "password123", "password123", "Visitor", 1);
        // Ensure respective dashboard is opened for each user type
        // Assertions or UI testing may be needed here
    }


    //LOGIN
}
