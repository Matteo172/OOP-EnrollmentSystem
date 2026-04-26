package EnrollmentSystem.service;

import EnrollmentSystem.model.Section;
import EnrollmentSystem.model.Student;
import java.util.List;

public interface SectionReg {
    void addSection(Section section);
    void enrollStudentInSection(Student student, Section section) throws SectionFullException;
    void displaySectionDetails(Section section);
    void displayAllSections();

}
