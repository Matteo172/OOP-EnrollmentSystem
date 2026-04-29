package EnrollmentSystem.service;
import EnrollmentSystem.model.Section;
import EnrollmentSystem.model.Student;
import EnrollmentSystem.model.Department;
import java.util.*;

public class SectionRegistrationService implements SectionReg{

    public List<Section> sections = new ArrayList<>();

    @Override
    public void addSection(Section section) {
        for (Section s : sections) {
            if (s.getSectionID().equals(section.getSectionID())) {
                System.out.println("Error: Section ID " + section.getSectionID() + " already exists.");
                return;
            }
        }
        sections.add(section);
    }

    @Override
    public void enrollStudentInSection(Student student, Section section) throws SectionFullException {
        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException("Enrollment failed: Section " + section.getSectionID() + " is full. (Max: "
                     + section.getMaxCapacity() + ")");
        }
        section.getEnrolledStudents().add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + section.getSectionID());
    }

    @Override
    public void displaySectionDetails(Section section) {
        System.out.println("\n====== SECTION DETAILS ======");
        System.out.println("Section ID  : " + section.getSectionID());
        System.out.println("Course      : " + section.getCourse().getCourseName());
        if (section.getInstructor() != null) {
            System.out.println("Instructor  : " + section.getInstructor().getName());
        } else {
            System.out.println("Instructor  : Not Assigned");
        }
        System.out.println("Capacity    : " + section.getEnrolledStudents().size() + "/" + section.getMaxCapacity());
        System.out.println("Students    :");
        if (section.getEnrolledStudents().isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student s : section.getEnrolledStudents()) {
                System.out.println("  - " + s);
            }
        }
    }

    @Override
    public void displayAllSectionsWithDetails() {
        if (sections.isEmpty()) {
            System.out.println("No Sections Found.");
            return;
        }

        System.out.println("\n====== ALL SECTIONS WITH DETAILS ======");
        for (Section s : sections) {
            System.out.println("\nSection ID  : " + s.getSectionID());
            System.out.println("Course      : " + s.getCourse().getCourseName());
            if (s.getInstructor() != null) {
                System.out.println("Instructor  : " + s.getInstructor().getName());
            } else {
                System.out.println("Instructor  : Not Assigned");
            }
            System.out.println("Capacity    : " + s.getEnrolledStudents().size()
                    + "/" + s.getMaxCapacity());
            System.out.println("Students    :");
            if (s.getEnrolledStudents().isEmpty()) {
                System.out.println("  No students enrolled.");
            } else {
                for (Student st : s.getEnrolledStudents()) {
                    System.out.println("  - " + st);
                }
            }
            System.out.println("==============================");
        }
    }


}
