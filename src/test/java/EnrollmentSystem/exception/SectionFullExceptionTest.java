package EnrollmentSystem.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SectionFullExceptionTest {


    @Test
    void shouldCreateExceptionWithMessage() {
        SectionFullException exception = new SectionFullException("Section is full!");
        assertEquals("Section is full!", exception.getMessage());
    }


    @Test
    void shouldBeInstanceOfException() {
        SectionFullException exception = new SectionFullException("Section is full!");
        assertTrue(exception instanceof Exception);
    }
}