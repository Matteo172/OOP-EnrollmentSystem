package EnrollmentSystem.service;

import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Section;
import java.util.List;

public interface InstructorReg {
    void addInstructor(Instructor instructor);
    void assignInstructorToSection(Instructor instructor, Section section);
    void getInstructorDetails(int instructorID);
    void displayAllInstructors();
    void removeInstructor(Instructor instructor);
    void updateInstructor(Instructor instructor);
    Instructor findInstructorByID(int instructorID);

}

