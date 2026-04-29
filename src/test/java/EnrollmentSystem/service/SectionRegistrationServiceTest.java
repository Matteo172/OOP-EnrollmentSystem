package EnrollmentSystem.service;

import EnrollmentSystem.model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SectionRegistrationServiceTest {

    private SectionRegistrationService sectionService;
    private Section testSection;
    private Student student1, student2, student3;

    @BeforeEach
    void setup() {
        sectionService = new SectionRegistrationService();
        Course course = new Course("C01", "Programming", "BSIT");
        Instructor instructor = new Instructor(1, "Mr. Santos");
        testSection = new Section("BSIT-1A", course, instructor, 2);
        student1 = new Student(1, "Alice", "BSIT");
        student2 = new Student(2, "Bob", "BSIT");
        student3 = new Student(3, "Charlie", "BSIT");
    }

    @Test
    void shouldEnrollStudentSuccessfully() throws SectionFullException {
        sectionService.enrollStudentInSection(student1, testSection);
        assertEquals(1, testSection.getEnrolledStudents().size());
    }

    @Test
    void shouldThrowExceptionWhenSectionIsFull() throws SectionFullException {
        sectionService.enrollStudentInSection(student1, testSection);
        sectionService.enrollStudentInSection(student2, testSection);

        boolean exception = false;

        try {
            sectionService.enrollStudentInSection(student3, testSection);
        } catch (SectionFullException e) {
            exception = true;
        }

        assertTrue(exception, "Expected SectionFullException but it was not thrown!");

    }

    @Test
    void shouldNotIncreaseCapacityWhenFull() throws SectionFullException {
        sectionService.enrollStudentInSection(student1, testSection);
        sectionService.enrollStudentInSection(student2, testSection);

        try {
            sectionService.enrollStudentInSection(student3, testSection);
        }
        catch (SectionFullException e) {
        }

        assertEquals(2, testSection.getEnrolledStudents().size());
    }

}