package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;

public interface StudentRegistration {
    void addStudent(Student student);
    void DisplayStudent();
    void updateStudent(Student student);
    void RemoveStudent(Student student);

}
