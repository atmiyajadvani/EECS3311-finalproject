package TestCases;

import Backend.Faculty;
import Backend.FacultyCoursesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacultyCoursesManagerTest {
    FacultyCoursesManager manager;
    Faculty faculty;

    @BeforeEach
    public void setUp() {
        faculty = new Faculty("testfa@test.com", "test", "Faculty", 1000);
        int facultyId = faculty.getFacultyId();
        manager = new FacultyCoursesManager(facultyId);
    }

    @Test
    public void testIsCourseCodeValid1() {
        // Valid course code
        Assertions.assertTrue(manager.isCourseCodeValid("ECON 1000"));
    }

    @Test
    public void testIsCourseCodeValid2() {
        // Invalid course code
        Assertions.assertFalse(manager.isCourseCodeValid("INVALID"));
    }

    @Test
    public void testIsCourseValid3() {
        // Misspelled course code
        Assertions.assertFalse(manager.isCourseCodeValid("ECON 100"));
    }

    @Test
    public void testGetTextbookForCourse1() {
        // Existing course code
        Assertions.assertEquals("Principles of Modern Economics", manager.getTextbookForCourse("ECON 1000"));
    }

    @Test
    public void testGetTextbookForCourse2() {
        // Non-existing course code
        Assertions.assertEquals("N/A", manager.getTextbookForCourse("INVALID"));
    }

    @Test
    public void testGetTextbookForCourse3() {
        // Misspelled course code
        Assertions.assertEquals("N/A", manager.getTextbookForCourse("ECON 100"));
    }

    @Test
    public void testAddCourse1() {
        // Valid course code
        Assertions.assertEquals("Course added successfully!", manager.addCourse("ECON 1000"));
    }

    @Test
    public void testAddCourse2() {
        // Empty course code
        Assertions.assertEquals("Invalid course code.", manager.addCourse(null));
    }

    @Test
    public void testAddCourse3() {
        // Non-existing course code
        Assertions.assertEquals("Course code does not exist.", manager.addCourse("INVALID"));
    }

    @Test
    public void testAddCourse4() {
        Assertions.assertEquals("Course code does not exist.", manager.addCourse("ECON 100"));
    }
}


