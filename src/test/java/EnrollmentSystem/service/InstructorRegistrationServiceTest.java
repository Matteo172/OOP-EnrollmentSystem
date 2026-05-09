package EnrollmentSystem.service;

import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Course;
import EnrollmentSystem.model.Section;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstructorRegistrationServiceTest {

    private InstructorRegistrationService instructorService;
    private Instructor instructor1, instructor2;
    private Section testSection;

    @BeforeEach
    void setup() {
        instructorService = new InstructorRegistrationService();
        instructor1 = new Instructor(1, "Mr. Santos", "Project Management");
        instructor2 = new Instructor(2, "Ms. Reyes", "Data Structures and Algorithms");
        Course course = new Course("C01", "System Analysis and Design", "BSIT");
        testSection = new Section("IT2C", course, null, 30);
    }


    @Test
    void shouldAddInstructorSuccessfully() {
        instructorService.addInstructor(instructor1);
        assertEquals(1, instructorService.instructors.size());
    }


    @Test
    void shouldRejectDuplicateInstructorID() {
        Instructor duplicate = new Instructor(1, "Mr. Bayek", "Math");
        instructorService.addInstructor(instructor1);
        instructorService.addInstructor(duplicate);
        assertEquals(1, instructorService.instructors.size());
    }


    @Test
    void shouldAssignInstructorToSection() {
        instructorService.assignInstructorToSection(instructor1, testSection);
        assertEquals(instructor1, testSection.getInstructor());
    }


    @Test
    void shouldGetInstructorDetails() {
        instructorService.addInstructor(instructor1);
        instructorService.getInstructorDetails(1);
        assertEquals(1, instructorService.instructors.size());
    }

    @Test
    void shouldPrintNotFoundForMissingInstructor() {
        instructorService.getInstructorDetails(99);
        assertEquals(0, instructorService.instructors.size());
    }

    @Test
    void shouldDisplayNoInstructorsWhenEmpty() {
        instructorService.displayAllInstructors();
        assertEquals(0, instructorService.instructors.size());
    }

    @Test
    void shouldDisplayAllInstructors() {
        instructorService.addInstructor(instructor1);
        instructorService.addInstructor(instructor2);
        instructorService.displayAllInstructors();
        assertEquals(2, instructorService.instructors.size());
    }
}