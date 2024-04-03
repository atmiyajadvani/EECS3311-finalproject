package TestCases;
import Backend.UserManager;
import Backend.RegistrationException;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {

    @AfterAll
    static void eraseAllAdded() {
        eraseLastLine("src/TestCases/CSV/UserInfoSpreadsheet2.csv");
        eraseLastLine("src/TestCases/CSV/userSubs2.csv");
        eraseLastLine("src/TestCases/CSV/userToTextbook2.csv");
    }

    public static void eraseLastLine(String filePath) {
        try {
            File file = new File(filePath);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            long length = file.length();
            if (length == 0) {
                randomAccessFile.close();
                return; // Empty file, nothing to erase
            }
            long position = length - 1;
            while (position > 0) {
                position--;
                randomAccessFile.seek(position);
                if (randomAccessFile.readByte() == '\n') {
                    break;
                }
            }
            if (position == 0) {
                randomAccessFile.setLength(0);
            } else {
                randomAccessFile.setLength(position);
            }
            randomAccessFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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
}
