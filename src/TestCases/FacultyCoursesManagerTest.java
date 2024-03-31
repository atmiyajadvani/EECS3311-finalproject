package TestCases;

import Backend.FacultyCoursesManager;
import Frontend.FacultyCourses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacultyCoursesManagerTest {

    @Test
    public void testIsCourseCodeValid() {
        FacultyCoursesManager manager = new FacultyCoursesManager(1);
        // Valid course code
        Assertions.assertTrue(manager.isCourseCodeValid("ECON 1000"));
        // Invalid course code
        Assertions.assertFalse(manager.isCourseCodeValid("INVALID"));
    }

    @Test
    public void testGetTextbookForCourse() {
        FacultyCoursesManager manager = new FacultyCoursesManager(1);
        // Existing course code
        Assertions.assertEquals("Principles of Modern Economics", manager.getTextbookForCourse("ECON 1000"));
        // Non-existing course code
        Assertions.assertEquals("N/A", manager.getTextbookForCourse("INVALID"));
    }

    @Test
    public void testAddCourse() {
        FacultyCoursesManager manager = new FacultyCoursesManager(1);
        // Valid course code
        Assertions.assertEquals("Course added successfully!", manager.addCourse("ECON 1000"));
        // Invalid course code
        Assertions.assertEquals("Invalid course code.", manager.addCourse(null));
        // Non-existing course code
        Assertions.assertEquals("Course code does not exist.", manager.addCourse("INVALID"));
    }
}


