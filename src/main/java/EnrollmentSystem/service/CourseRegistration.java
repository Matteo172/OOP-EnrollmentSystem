package EnrollmentSystem.service;

import EnrollmentSystem.model.Course;


public interface CourseRegistration {
    void addCourse(Course course);
    void DisplayCourse();
    void UpdateStudent(Course course);
    void RemoveStudent(Course course);


}
