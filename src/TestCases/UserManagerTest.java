package TestCases;
import Backend.UserManager;
import Backend.RegistrationException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {

    @Test
    void isEmailUniqueNo(){
        String email = "casey.dawn@example.com";
        assertFalse(UserManager.isEmailUnique(email));
    }

    @Test
    void isEmailUniqueYes(){
        String email = "casey.dawn23@example.com";
        assertTrue(UserManager.isEmailUnique(email));
    }

    @Test
    void isEmailUniqueNull(){
        String email = "";
        assertTrue(UserManager.isEmailUnique(email));
    }

    @Test
    void testIsValidEmailFormatNo(){
        assertFalse(UserManager.isValidEmailFormat("this should not work"));
    }

    @Test
    void testIsValidEmailFormatYes(){
        assertTrue(UserManager.isValidEmailFormat("thisshould@work.com"));
    }

    @Test
    void testIsValidEmailFormatNull(){
        assertFalse(UserManager.isValidEmailFormat(""));
    }

    @Test
    void testGetNextUserIdFaculty(){
        assertEquals(UserManager.getNextUserId("src/TestCases/CSV/UserInfoSpreadsheet2.csv", "Faculty"), 3001);
    }

    @Test
    void testGetNextUserIdStudent(){
        assertEquals(UserManager.getNextUserId("src/TestCases/CSV/UserInfoSpreadsheet2.csv", "Student"), 1002);
    }

    @Test
    void testGetNextUserIdManager(){
        assertEquals(UserManager.getNextUserId("src/TestCases/CSV/UserInfoSpreadsheet2.csv", "Manager"), 4001);
    }

    @Test
    void testGetNextUserIdVisitor(){
        assertEquals(UserManager.getNextUserId("src/TestCases/CSV/UserInfoSpreadsheet2.csv", "Visitor"), 5001);
    }

    @Test
    void testRegisterUser_ValidInputs() {
        try {
            assertTrue(UserManager.registerUser("test1@example.com", "password", "password", "Visitor"));
        } catch (RegistrationException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    void testRegisterUser_InvalidEmailFormat() {
        assertThrows(RegistrationException.class, () -> UserManager.registerUser("invalid_email", "password", "password", "Visitor"));
    }

    @Test
    void testRegisterUser_EmailAlreadyInUse() {
        assertThrows(RegistrationException.class, () -> UserManager.registerUser("test1@example.com", "password", "password", "Student"));
    }

    @Test
    void testRegisterUser_PasswordsDoNotMatch() {
        assertThrows(RegistrationException.class, () -> UserManager.registerUser("test2@example.com", "password1", "password2", "Visitor"));
    }

    @Test
    void testRegisterUser_DataWrittenToUserInfoSpreadsheet() throws IOException {
        // Check if data is written to UserInfoSpreadsheet2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TestCases/CSV/UserInfoSpreadsheet2.csv"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("test5@example.com")) {
                    found = true;
                    break;
                }
            }
            assertTrue(found, "Data for test5@example.com not found in UserInfoSpreadsheet2.csv");
        }
    }

    @Test
    void testRegisterUser_DataWrittenToUserToTextbook() throws IOException {
        // Check if data is written to userToTextbook2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TestCases/CSV/userToTextbook2.csv"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("1001")) { // Assuming the user ID for test5@example.com is 5
                    found = true;
                    break;
                }
            }
            assertTrue(found, "User ID for test5@example.com not found in userToTextbook2.csv");
        }
    }

    @Test
    void testRegisterUser_DataWrittenToUserSubs() throws IOException {
        // Check if data is written to userSubs2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TestCases/CSV/userSubs2.csv"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("1001")) { // Assuming the user ID for test5@example.com is 5
                    found = true;
                    break;
                }
            }
            assertTrue(found, "User ID for test5@example.com not found in userSubs2.csv");
        }
    }

    @Test
    void testRegisterUser_DataWrittenToFacultyUsers() throws IOException {
        // Check if data is written to FacultyUsers2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TestCases/CSV/FacultyUsers2.csv"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("2000")) { // Assuming the user ID for faculty@test.com
                    found = true;
                    break;
                }
            }
            assertTrue(found, "User ID for faculty@test.com not found in FacultyUsers2.csv");
        }
    }

    @Test
    void testRegisterUser_DataWrittenToVirtualCopies() throws IOException {
        // Check if data is written to VirtualCopies2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TestCases/CSV/VirtualCopies2.csv"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("1001")) { // Assuming the user ID for test5@example.com is 5
                    found = true;
                    break;
                }
            }
            assertTrue(found, "User ID for test5@example.com not found in VirtualCopies2.csv");
        }
    }

    @AfterAll
    static void resetCSVFiles() throws IOException {
        rewriteCSVFile("src/TestCases/CSV/UserInfoSpreadsheet2.csv", getUserInfoSpreadsheetContent());
        rewriteCSVFile("src/TestCases/CSV/userSubs2.csv", getUserSubsContent());
        rewriteCSVFile("src/TestCases/CSV/userToTextbook2.csv", getUserToTextbookContent());
    }

    private static void rewriteCSVFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    private static String getUserInfoSpreadsheetContent() {
        return "UserID,Email,Password,UserType,RegisteredDate,CanBorrow,ItemsBorrowed,ItemsOverdue\n" +
                "4000,casey.dawn@example.com,pass123!,Manager,29/01/24,yes,0,0\n" +
                "1000,student@test.com,test,Student,22/03/24,yes,0,0\n" +
                "2000,faculty@test.com,test,Faculty,22/03/24,yes,2,0\n" +
                "3000,staff@test.com,test,Staff,22/03/24,yes,0,0\n" +
                "5000,visitor@gmail.com,test,Visitor,22/03/24,yes,0,0\n" +
                "1001,test5@example.com,test,Student,22/03/24,yes,0,0\n";
    }

    private static String getUserSubsContent() {
        return "4000,0,0,0,0\n" +
                "1000,0,0,0,0\n" +
                "2000,0,0,0,0\n" +
                "3000,0,0,0,0\n" +
                "5000,0,0,0,0\n" +
                "1001,0,0,0,0\n";
    }

    private static String getUserToTextbookContent() {
        return "4000\n" +
                "2000\n" +
                "1000\n" +
                "5000\n" +
                "3000\n" +
                "1001\n";
    }
}
