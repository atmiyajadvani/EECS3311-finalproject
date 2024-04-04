package TestCases;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Backend.RequestBookBackend;
import Frontend.RequestBookScreen;

public class RequestBackendTest {
    private RequestBookBackend backend;

    @BeforeEach
    void setUp() {
        backend = new RequestBookBackend();
    }

    @Test
    void testRequestBook_BookFound() {
        String bookName = "Principles of Modern Economics";
        String purpose = "Course Teaching";
        int userId = 1002;

        assertTrue(backend.requestBook(bookName, purpose, userId));
    }

    @Test
    void testRequestBook_BookNotFound() {
        String bookName = "Nonexistent Book";
        String purpose = "Self Improvement";
        int userId = 1002;

        assertFalse(backend.requestBook(bookName, purpose, userId));
    }

    @Test
    void testRequestBook_NullBookName() {
        String purpose = "Self Improvement";
        int userId = 1002;

        assertFalse(backend.requestBook(null, purpose, userId));
    }


}
