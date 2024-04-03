package TestCases;
import Backend.UserAuthenticator;
import Frontend.FacultyDashboard;
import Frontend.ManagerDashboard;
import Frontend.StudentDashboard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserAuthenticatorTest {

    @Test
    void testChecking_ValidCredentials_Manager() {
        assertTrue(UserAuthenticator.checking("casey.dawn@example.com", "pass123!", 0));
    }

    @Test
    void testChecking_ValidCredentials_Student() {
        assertTrue(UserAuthenticator.checking("student@test.com", "test", 0));
    }

    @Test
    void testChecking_ValidCredentials_Faculty() {
        assertTrue(UserAuthenticator.checking("faculty@test.com", "test", 0));
    }

    @Test
    void testChecking_ValidCredentials_Staff() {
        assertTrue(UserAuthenticator.checking("staff@test.com", "test", 0)); // Staff is not handled in the method
    }

    @Test
    void testChecking_ValidCredentials_Visitor() {
        assertTrue(UserAuthenticator.checking("visitor@gmail.com", "test", 0));
    }

    @Test
    void testChecking_ValidCredentials_UnknownUser() {
        assertFalse(UserAuthenticator.checking("unknown@example.com", "test", 0)); // Unknown user
    }

    @Test
    void testChecking_EmptyEmail() {
        assertFalse(UserAuthenticator.checking("", "password", 0));
    }

    @Test
    void testChecking_EmptyPassword() {
        assertFalse(UserAuthenticator.checking("test@example.com", "", 0));
    }

    @Test
    void testChecking_EmptyEmailAndPassword() {
        assertFalse(UserAuthenticator.checking("", "", 0));
    }

    @Test
    void testChecking_InvalidCredentials() {
        assertFalse(UserAuthenticator.checking("test@example.com", "invalidpassword", 0));
    }
}
