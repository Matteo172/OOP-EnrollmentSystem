package EnrollmentSystem.service;

import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Section;
import java.util.*;

public class InstructorRegistrationService implements InstructorReg {

    public List<Instructor> instructors = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) {
        for (Instructor i : instructors) {
            if (i.getID() == instructor.getID()) {
                System.out.println("Error: Instructor ID " + instructor.getID() + " already exists.");
                return;
            }
        }
        instructors.add(instructor);
    }

    @Override
    public void assignInstructorToSection(Instructor instructor, Section section) {
        section.setInstructor(instructor);
        System.out.println("Instructor " + instructor.getName() + " assigned to " + section.getSectionID());
    }

    @Override
    public void getInstructorDetails(int instructorID) {
        for (Instructor i : instructors) {
            if (i.getID() == instructorID) {
                System.out.println("\n====== INSTRUCTOR DETAILS ======");
                System.out.println("ID      : " + i.getID());
                System.out.println("Name    : " + i.getName());
                System.out.println("Course  : " + i.getCourse());
                return;
            }
        }
        System.out.println("Instructor not found.");
    }

    @Override
    public void displayAllInstructors() {
        if (instructors.isEmpty()) {
            System.out.println("No Instructors Found.");
        } else {
            System.out.println("\n====== LIST OF INSTRUCTORS ======");
            for (Instructor i : instructors) {
                System.out.println("ID: " + i.getID() + " | Name: " + i.getName() + " | Course: " + i.getCourse());
            }
        }
    }
}