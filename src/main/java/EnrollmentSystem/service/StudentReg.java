package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;

public interface StudentReg {
    void addStudent(Student student);
    void DisplayStudent();
    void UpdateStudent(Student student);
    void RemoveStudent(Student student);
    Student findStudentByID(int studentID);
    Student findStudentByName(String name);
    void displayStudentTuitionStatus();
}