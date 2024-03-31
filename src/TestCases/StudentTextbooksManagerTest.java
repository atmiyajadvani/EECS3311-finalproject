package TestCases;

import Backend.StudentTextbooksManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTextbooksManagerTest {

    @Test
    public void testIsCourseCodeValid() {
        StudentTextbooksManager manager = new StudentTextbooksManager(1);
        // Valid course code
        Assertions.assertTrue(manager.isCourseCodeValid("ECON 1000"));
        // Invalid course code
        Assertions.assertFalse(manager.isCourseCodeValid("INVALID"));
    }

    @Test
    public void testGetTextbookForCourse() {
        StudentTextbooksManager manager = new StudentTextbooksManager(1);
        // Existing course code
        Assertions.assertEquals("Principles of Modern Economics", manager.getTextbookForCourse("ECON 1000"));
        // Non-existing course code
        Assertions.assertEquals("N/A", manager.getTextbookForCourse("INVALID"));
    }

    @Test
    public void testAddCourse() {
        StudentTextbooksManager manager = new StudentTextbooksManager(1);
        // Valid course code
        Assertions.assertEquals("Course added successfully!", manager.addCourse("ECON 1000"));
        // Invalid course code
        Assertions.assertEquals("Invalid course code.", manager.addCourse(null));
        // Non-existing course code
        Assertions.assertEquals("Course code does not exist.", manager.addCourse("INVALID"));
    }
}

