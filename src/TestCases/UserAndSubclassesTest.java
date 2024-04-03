
package TestCases;

import Backend.*;
import org.junit.Test;
import static org.junit.Assert.*;
//User class test cases
public class UserAndSubclassesTest {

    @Test // user #1
    public void testConstructorAndGetters() {
        User user = new User("test@example.com", "password123", "Student");
        assertEquals("test@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Student", user.getUserType());
    }

    @Test // user #2
    public void testSetEmail() {
        User user = new User("test@example.com", "password123", "Manager");
        user.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", user.getEmail());
    }

    @Test // user #3
    public void testSetPassword() {
        User user = new User("test@example.com", "password123", "Faculty");
        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());
    }

    @Test // user #4
    public void testSetUserType() {
        User user = new User("test@example.com", "password123", "Visitor");
        user.setUserType("Manager");
        assertEquals("Manager", user.getUserType());
    }

    @Test // user #5
    public void testGettersAndSettersCombined() {
        User user = new User("test@example.com", "password123", "Student");
        user.setEmail("newemail@example.com");
        user.setPassword("newpassword");
        user.setUserType("Manager");
        assertEquals("newemail@example.com", user.getEmail());
        assertEquals("newpassword", user.getPassword());
        assertEquals("Manager", user.getUserType());
    }

    @Test // user #6
    public void testStudentEmptyConstructorAndSetters() {
        User user = new User("", "", "");
        user.setEmail("test@example.com");
        user.setPassword("password123");
        user.setUserType("Student");
        assertEquals("test@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Student", user.getUserType());
    }

    @Test // user #7
    public void testStudentEmptyConstructorAndGetters() {
        User user = new User("", "", "");
        assertEquals("", user.getEmail());
        assertEquals("", user.getPassword());
        assertEquals("", user.getUserType());
    }

    @Test // user #8
    public void testStudentNullConstructorAndGetters() {
        User user = new User(null, null, null);
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getUserType());
    }

    @Test // User #9
    public void testUserNullSetters() {
        User user = new User("test@example.com", "password123", "Student");
        user.setEmail(null);
        user.setPassword(null);
        user.setUserType(null);
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getUserType());
    }

    @Test // user #10
    public void testVisitorUnderUserConstructorAndGetters() {
        User user = new User("visitor@example.com", "password456", "Visitor");
        assertEquals("visitor@example.com", user.getEmail());
        assertEquals("password456", user.getPassword());
        assertEquals("Visitor", user.getUserType());
    }

    //Student IDs
    @Test  // student #1
    public void testStudentConstructorAndGetters() {
        Student student = new Student("test@example.com", "password123", "Student", 123);
        assertEquals("test@example.com", student.getEmail());
        assertEquals("password123", student.getPassword());
        assertEquals("Student", student.getUserType());
        assertEquals(123, student.getStudentId());
    }

    @Test  // student #2
    public void testGetNextStudentId() {
        // Assuming the CSV file has some records initially
        int nextId = Student.getNextStudentId();
        assertTrue(nextId > 0);
    }

    @Test  // student #3
    public void testSetStudentId() {
        Student student = new Student("test@example.com", "password123", "Student", 123);
        student.setStudentId(456);
        assertEquals(456, student.getStudentId());
    }

    @Test  // student #4
    public void testSetStudentIdNegative() {
        Student student = new Student("test@example.com", "password123", "Student", 123);
        student.setStudentId(-1); // Attempt to set negative ID
        assertEquals(123, student.getStudentId()); // Ensure ID remains unchanged
    }

    @Test  // student #5
    public void testGetNextStudentIdNoRecords() {
        // Assuming the CSV file initially has no records
        int nextId = Student.getNextStudentId();
        assertEquals(1005, nextId); // The next ID should be 1005 - according to the current UserInfoSpreadsheet.csv
    }

    //manager
    @Test  // student #6
    public void testManagerEmptyConstructorAndGetters() {
        Student student = new Student("", "", "", 0);
        assertEquals("", student.getEmail());
        assertEquals("", student.getPassword());
        assertEquals("", student.getUserType());
        assertEquals(0, student.getStudentId());
    }

    @Test  // student #7
    public void testManagerNullConstructorAndGetters() {
        Student student = new Student(null, null, null, 0);
        assertNull(student.getEmail());
        assertNull(student.getPassword());
        assertNull(student.getUserType());
        assertEquals(0, student.getStudentId());
    }

    @Test  // student #8
    public void testManagerEmptyConstructorAndSetters() {
        Student student = new Student("", "", "", 0);
        student.setEmail("test@example.com");
        student.setPassword("password123");
        student.setUserType("Student");
        student.setStudentId(123);
        assertEquals("test@example.com", student.getEmail());
        assertEquals("password123", student.getPassword());
        assertEquals("Student", student.getUserType());
        assertEquals(123, student.getStudentId());
    }

    @Test  // student #9
    public void testManagerNullSetters() {
        Student student = new Student("test@example.com", "password123", "Student", 123);
        student.setEmail(null);
        student.setPassword(null);
        student.setUserType(null);
        student.setStudentId(0);
        assertNull(student.getEmail());
        assertNull(student.getPassword());
        assertNull(student.getUserType());
        assertEquals(123, student.getStudentId());
    }

    @Test  // student 10
    public void testSetStudentIdToZero() {
        Student student = new Student("test@example.com", "password123", "Student", 123);
        student.setStudentId(0); // Attempt to set negative ID
        assertEquals(123, student.getStudentId()); // Ensure ID remains unchanged
    }

    @Test // manager #1
    public void testManagerConstructorAndGetters() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        assertEquals("manager@example.com", manager.getEmail());
        assertEquals("password123", manager.getPassword());
        assertEquals("Manager", manager.getUserType());
        assertEquals(456, manager.getManagerId());
    }

    @Test // manager #2
    public void testGetNextManagerId() {
        // Assuming the CSV file has some records initially
        int nextId = Manager.getNextManagerId();
        assertTrue(nextId > 0);
    }

    @Test // manager #3
    public void testSetManagerId() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        manager.setManagerRole(789);
        assertEquals(789, manager.getManagerId());
    }

    @Test // manager #4
    public void testSetManagerIdNegative() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        manager.setManagerRole(-1); // Attempt to set negative ID
        assertEquals(456, manager.getManagerId()); // Ensure ID remains unchanged
    }

    @Test // manager #5
    public void testGetNextManagerIdNoRecords() {
        // Assuming the CSV file initially has no records
        int nextId = Manager.getNextManagerId();
        assertEquals(4001, nextId); // The next ID should be 4001 - according to the current csv
    }

    @Test // manager #6
    public void testEmptyConstructorAndGetters() {
        Manager manager = new Manager("", "", "", 0);
        assertEquals("", manager.getEmail());
        assertEquals("", manager.getPassword());
        assertEquals("", manager.getUserType());
        assertEquals(0, manager.getManagerId());
    }

    @Test // manager #7
    public void testNullConstructorAndGetters() {
        Manager manager = new Manager(null, null, null, 0);
        assertNull(manager.getEmail());
        assertNull(manager.getPassword());
        assertNull(manager.getUserType());
        assertEquals(0, manager.getManagerId());
    }

    @Test // manager #8
    public void testEmptyConstructorAndSetters() {
        Manager manager = new Manager("", "", "", 0);
        manager.setEmail("manager@example.com");
        manager.setPassword("password123");
        manager.setUserType("Manager");
        manager.setManagerRole(456);
        assertEquals("manager@example.com", manager.getEmail());
        assertEquals("password123", manager.getPassword());
        assertEquals("Manager", manager.getUserType());
        assertEquals(456, manager.getManagerId());
    }

    @Test // manager #9
    public void testNullSetters() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        manager.setEmail(null);
        manager.setPassword(null);
        manager.setUserType(null);
        manager.setManagerRole(0);
        assertNull(manager.getEmail());
        assertNull(manager.getPassword());
        assertNull(manager.getUserType());
        assertEquals(456, manager.getManagerId());
    }

    @Test // manager #19
    public void testSetManagerIdToZero() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        manager.setManagerRole(0); // Attempt to set negative ID
        assertEquals(456, manager.getManagerId()); // Ensure ID remains unchanged
    }

    //testing faculty
    @Test // faculty #1
    public void testFacultyConstructorAndGetters() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        assertEquals("faculty@example.com", faculty.getEmail());
        assertEquals("password123", faculty.getPassword());
        assertEquals("Faculty", faculty.getUserType());
        assertEquals(789, faculty.getFacultyId());
    }

    @Test// faculty #2
    public void testGetNextFacultyId() {
        // Assuming the CSV file has some records initially
        int nextId = Faculty.getNextFacultyId();
        assertTrue(nextId > 0);
    }

    @Test// faculty #3
    public void testSetFacultyId() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        faculty.setFacultyId(101112);
        assertEquals(101112, faculty.getFacultyId());
    }

    @Test// faculty #4
    public void testSetFacultyIdNegative() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        faculty.setFacultyId(-1); // Attempt to set negative ID
        assertEquals(789, faculty.getFacultyId()); // Ensure ID remains unchanged
    }

    @Test// faculty #5
    public void testFacultyGetNextFacultyIdNoRecords() {
        // Assuming the CSV file initially has no records
        int nextId = Faculty.getNextFacultyId();
        assertEquals(3002, nextId); // The next ID should be 3002 according to csv
    }

    @Test// faculty #6
    public void testFacultyEmptyConstructorAndGetters() {
        Faculty faculty = new Faculty("", "", "", 0);
        assertEquals("", faculty.getEmail());
        assertEquals("", faculty.getPassword());
        assertEquals("", faculty.getUserType());
        assertEquals(0, faculty.getFacultyId());
    }

    @Test// faculty #7
    public void testFacultyNullConstructorAndGetters() {
        Faculty faculty = new Faculty(null, null, null, 0);
        assertNull(faculty.getEmail());
        assertNull(faculty.getPassword());
        assertNull(faculty.getUserType());
        assertEquals(0, faculty.getFacultyId());
    }

    @Test// faculty #8
    public void testFacultyEmptyConstructorAndSetters() {
        Faculty faculty = new Faculty("", "", "", 0);
        faculty.setEmail("faculty@example.com");
        faculty.setPassword("password123");
        faculty.setUserType("Faculty");
        faculty.setFacultyId(789);
        assertEquals("faculty@example.com", faculty.getEmail());
        assertEquals("password123", faculty.getPassword());
        assertEquals("Faculty", faculty.getUserType());
        assertEquals(789, faculty.getFacultyId());
    }

    @Test// faculty #9
    public void testFacultyNullSetters() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        faculty.setEmail(null);
        faculty.setPassword(null);
        faculty.setUserType(null);
        faculty.setFacultyId(0);
        assertNull(faculty.getEmail());
        assertNull(faculty.getPassword());
        assertNull(faculty.getUserType());
        assertEquals(789, faculty.getFacultyId());
    }

    @Test // faculty #10
    public void testSetFacultyIdToZero() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        faculty.setFacultyId(0); // Attempt to set negative ID
        assertEquals(789, faculty.getFacultyId()); // Ensure ID remains unchanged
    }


    //Visitor
    @Test
    public void testVisitorConstructorAndGetters() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 123);
        assertEquals("visitor@example.com", visitor.getEmail());
        assertEquals("password123", visitor.getPassword());
        assertEquals("Visitor", visitor.getUserType());
        assertEquals(123, visitor.getVisitorId());
    }

    @Test
    public void testGetNextVisitorId() {
        // Assuming the CSV file has some records initially
        int nextId = Visitor.getNextVisitorId();
        assertTrue(nextId > 0);
    }

    @Test
    public void testSetVisitorId() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 123);
        visitor.setVisitorId(456);
        assertEquals(456, visitor.getVisitorId());
    }

    @Test
    public void testSetVisitorIdNegative() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 123);
        visitor.setVisitorId(-1); // Attempt to set negative ID
        assertEquals(123, visitor.getVisitorId()); // Ensure ID remains unchanged
    }

    @Test
    public void testSetVisitorIdToZero() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 123);
        visitor.setVisitorId(0); // Attempt to set negative ID
        assertEquals(123, visitor.getVisitorId()); // Ensure ID remains unchanged
    }

    @Test
    public void testGetNextVisitorIdNoRecords() {
        // Assuming the CSV file initially has no records
        int nextId = Visitor.getNextVisitorId();
        assertEquals(5001, nextId); // The next ID should be 5001 as visitor ids start as 5000
    }

    @Test
    public void testVisitorEmptyConstructorAndGetters() {
        Visitor visitor = new Visitor("", "", "", 0);
        assertEquals("", visitor.getEmail());
        assertEquals("", visitor.getPassword());
        assertEquals("", visitor.getUserType());
        assertEquals(0, visitor.getVisitorId());
    }

    @Test
    public void testVisitorNullConstructorAndGetters() {
        Visitor visitor = new Visitor(null, null, null, 0);
        assertNull(visitor.getEmail());
        assertNull(visitor.getPassword());
        assertNull(visitor.getUserType());
        assertEquals(0, visitor.getVisitorId());
    }

    @Test
    public void testVisitorEmptyConstructorAndSetters() {
        Visitor visitor = new Visitor("", "", "", 0);
        visitor.setEmail("visitor@example.com");
        visitor.setPassword("password123");
        visitor.setUserType("Visitor");
        visitor.setVisitorId(123);
        assertEquals("visitor@example.com", visitor.getEmail());
        assertEquals("password123", visitor.getPassword());
        assertEquals("Visitor", visitor.getUserType());
        assertEquals(123, visitor.getVisitorId());
    }

    // Typecasting tests
    @Test
    public void testVisitorNullSetters() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 123);
        visitor.setEmail(null);
        visitor.setPassword(null);
        visitor.setUserType(null);
        visitor.setVisitorId(0);
        assertNull(visitor.getEmail());
        assertNull(visitor.getPassword());
        assertNull(visitor.getUserType());
        assertEquals(123, visitor.getVisitorId());
    }

    // Type-Casting Tests
    @Test
    public void testUserToManagerTypecasting() {
        User user = new Manager("manager@example.com", "password123", "Manager", 456);
        assertTrue(user instanceof Manager);
    }

    @Test
    public void testUserToFacultyTypecasting() {
        User user = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void testUserToStudentTypecasting() {
        User user = new Student("student@example.com", "password123", "Student", 101112);
        assertTrue(user instanceof Student);
    }

    @Test
    public void testUserToVisitorTypecasting() {
        User user = new Visitor("visitor@example.com", "password123", "Visitor", 131415);
        assertTrue(user instanceof Visitor);
    }

    @Test
    public void testManagerToUserTypecasting() {
        Manager manager = new Manager("manager@example.com", "password123", "Manager", 456);
        User user = (User) manager;
        assertNotNull(user);
        assertEquals("manager@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Manager", user.getUserType());
    }

    @Test
    public void testFacultyToUserTypecasting() {
        Faculty faculty = new Faculty("faculty@example.com", "password123", "Faculty", 789);
        User user = (User) faculty;
        assertNotNull(user);
        assertEquals("faculty@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Faculty", user.getUserType());
    }

    @Test
    public void testStudentToUserTypecasting() {
        Student student = new Student("student@example.com", "password123", "Student", 101112);
        User user = (User) student;
        assertNotNull(user);
        assertEquals("student@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Student", user.getUserType());
    }

    @Test
    public void testVisitorToUserTypecasting() {
        Visitor visitor = new Visitor("visitor@example.com", "password123", "Visitor", 131415);
        User user = (User) visitor;
        assertNotNull(user);
        assertEquals("visitor@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("Visitor", user.getUserType());
    }

    @Test
    public void testUserTypecastingNull() {
        User user = null;
        assertNull(user);
    }

    @Test
    public void testUserToManagerTypecasting2() {
        User user = new Manager("manager@example.com", "password123", "Manager", 456);
        Manager manager = (Manager) user;
        assertNotNull(manager);
        assertEquals("manager@example.com", manager.getEmail());
        assertEquals("password123", manager.getPassword());
        assertEquals("Manager", manager.getUserType());
        assertEquals(456, manager.getManagerId());
    }
}
