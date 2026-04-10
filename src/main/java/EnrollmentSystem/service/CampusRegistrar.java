package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;
import EnrollmentSystem.model.Course;

public class CampusRegistrar {
    private StudentRegistration studentRegistration;
    private CourseRegistration courseRegistration;

    public CampusRegistrar(StudentRegistration studentRegistration, CourseRegistration courseRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
    }

    public String saveCourse(Course course){
        courseRegistration.addCourse(course);
        return "Success";
    }

    public void displayAllStudent(){
        studentRegistration.DisplayStudent();
    }

    public String saveStudent(Student student){
        studentRegistration.addStudent(student);
        return "Success";
    }

    public void displayAllCourse(){
        courseRegistration.DisplayCourse();
    }
}
