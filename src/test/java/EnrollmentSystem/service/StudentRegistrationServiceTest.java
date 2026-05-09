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
        assertEquals("Alice Updated", studentService.students.getFirst().getName());
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
        Student student = new Student(99, "Karen", "BSIT");
        studentService.RemoveStudent(student);
        assertEquals(0, studentService.students.size());
    }
}