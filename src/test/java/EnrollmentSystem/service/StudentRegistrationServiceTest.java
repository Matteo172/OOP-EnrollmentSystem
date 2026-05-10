package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistrationServiceTest {

    private StudentRegistrationService studentService;

    @BeforeEach
    void setup() {
        studentService = new StudentRegistrationService();
    }

    @Test
    void shouldAddStudentSuccessfully() {
        Student student = new Student(1, "Alice", "BSIT");
        studentService.addStudent(student);
        assertEquals(1, studentService.students.size());
    }

    @Test
    void shouldRejectDuplicateStudentID() {
        Student student1 = new Student(1, "Alice", "BSIT");
        Student student2 = new Student(1, "Bob", "BSCS");
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        assertEquals(1, studentService.students.size());
    }

    @Test
    void shouldRemoveStudentSuccessfully() {
        Student student = new Student(1, "Alice", "BSIT");
        studentService.addStudent(student);
        studentService.RemoveStudent(student);
        assertEquals(0, studentService.students.size());
    }

    @Test
    void shouldUpdateStudentSuccessfully() {
        studentService.addStudent(new Student(1, "Alice", "BSIT"));
        studentService.UpdateStudent(new Student(1, "Alice Updated", "BSCS"));
        assertEquals("Alice Updated", studentService.students.get(0).getName());
    }

    @Test
    void shouldDisplayNoStudentsWhenEmpty() {
        assertEquals(0, studentService.students.size());
        studentService.DisplayStudent();
    }

    @Test
    void shouldDisplayStudentsWhenNotEmpty() {
        studentService.addStudent(new Student(1, "Alice", "BSIT"));
        studentService.addStudent(new Student(2, "Bob", "BSCS"));
        assertEquals(2, studentService.students.size());
        studentService.DisplayStudent();
    }

    @Test
    void shouldNotCrashWhenRemovingNonExistentStudent() {
        Student student = new Student(99, "Ghost", "BSIT");
        studentService.RemoveStudent(student);
        assertEquals(0, studentService.students.size());
    }

    @Test
    void shouldFindStudentByID() {
        studentService.addStudent(new Student(1, "Alice", "BSIT"));
        Student found = studentService.findStudentByID(1);
        assertNotNull(found);
        assertEquals("Alice", found.getName());
    }

    @Test
    void shouldReturnNullWhenStudentIDNotFound() {
        Student found = studentService.findStudentByID(99);
        assertNull(found);
    }

    @Test
    void shouldFindStudentByName() {
        studentService.addStudent(new Student(1, "Alice", "BSIT"));
        Student found = studentService.findStudentByName("alice");
        assertNotNull(found);
        assertEquals(1, found.getID());
    }

    @Test
    void shouldReturnNullWhenStudentNameNotFound() {
        Student found = studentService.findStudentByName("Ghost");
        assertNull(found);
    }

    @Test
    void shouldDisplayNoTuitionStatusWhenEmpty() {
        studentService.displayStudentTuitionStatus();
        assertEquals(0, studentService.students.size());
    }

    @Test
    void shouldDisplayTuitionStatusWhenNotEmpty() {
        Student student = new Student(1, "Alice", "BSIT");
        student.setTotalTuition(3000);
        student.setTuitionBalance(1000);
        studentService.addStudent(student);
        studentService.displayStudentTuitionStatus();
        assertEquals(1, studentService.students.size());
    }
}