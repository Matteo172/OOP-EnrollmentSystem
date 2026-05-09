package EnrollmentSystem.service;

import EnrollmentSystem.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseRegistrationServiceTest {

    private CourseRegistrationService courseService;
    private Course course1, course2;

    @BeforeEach
    void setup() {
        courseService = new CourseRegistrationService();
        course1 = new Course("C01", "System Analysis and Design", "BSIT");
        course2 = new Course("C02", "IT Project Management", "BSIT");
    }

    @Test
    void shouldAddCourseSuccessfully() {
        courseService.addCourse(course1);
        assertEquals(1, courseService.courses.size());
    }

    @Test
    void shouldRejectDuplicateCourseID() {
        Course duplicate = new Course("C01", "Duplicate", "BSCS");
        courseService.addCourse(course1);
        courseService.addCourse(duplicate);
        assertEquals(1, courseService.courses.size());
    }

    @Test
    void shouldDisplayNoCoursesWhenEmpty() {
        courseService.DisplayCourse();
        assertEquals(0, courseService.courses.size());
    }

    @Test
    void shouldDisplayCoursesWhenNotEmpty() {
        courseService.addCourse(course1);
        courseService.addCourse(course2);
        courseService.DisplayCourse();
        assertEquals(2, courseService.courses.size());
    }

    @Test
    void shouldUpdateCourseSuccessfully() {
        courseService.addCourse(course1);
        Course updated = new Course("C01", "Advanced Programming", "BSCS");
        courseService.UpdateCourse(updated);
        assertEquals("Advanced Programming", courseService.courses.get(0).getCourseName());
    }

    @Test
    void shouldNotCrashWhenUpdatingNonExistentCourse() {
        Course nonExistent = new Course("C99", "Not Existing Course", "BSIT");
        courseService.UpdateCourse(nonExistent);
        assertEquals(0, courseService.courses.size());
    }

    @Test
    void shouldRemoveCourseSuccessfully() {
        courseService.addCourse(course1);
        courseService.RemoveCourse(course1);
        assertEquals(0, courseService.courses.size());
    }

    @Test
    void shouldNotCrashWhenRemovingNonExistentCourse() {
        Course nonExistent = new Course("C99", "Not Existing Course", "BSIT");
        courseService.RemoveCourse(nonExistent);
        assertEquals(0, courseService.courses.size());
    }
}