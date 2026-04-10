package EnrollmentSystem.service;

import EnrollmentSystem.model.Course;


public interface CourseRegistration {
    void addCourse(Course course);
    void DisplayCourse();
    void UpdateCourse(Course course);
    void RemoveCourse(Course course);


}
