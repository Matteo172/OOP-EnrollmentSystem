package EnrollmentSystem.service;

import EnrollmentSystem.exception.SectionFullException;
import EnrollmentSystem.model.*;
import java.util.List;

public class CampusRegistrar {
    private StudentReg studentRegistration;
    private CourseReg courseRegistration;
    private DepartmentReg departmentRegistration;
    private SectionReg sectionRegistration;
    private TuitionReg tuitionRegistration;
    private InstructorReg instructorRegistration;

    public CampusRegistrar(StudentReg studentRegistration, CourseReg courseRegistration,
                           DepartmentReg departmentRegistration, SectionReg sectionRegistration,
                           TuitionReg tuitionRegistration, InstructorReg instructorRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.departmentRegistration = departmentRegistration;
        this.sectionRegistration = sectionRegistration;
        this.tuitionRegistration = tuitionRegistration;
        this.instructorRegistration = instructorRegistration;
    }

    // Student
    public void displayAllStudent() {
        studentRegistration.DisplayStudent();
    }

    public String saveStudent(Student student) {
        studentRegistration.addStudent(student);
        return "Student Saved Successfully";
    }

    public String updateStudent(Student student) {
        studentRegistration.UpdateStudent(student);
        return "Update Complete";
    }

    public String removeStudent(Student student) {
        studentRegistration.RemoveStudent(student);
        return "Remove Success";
    }

    public Student findStudentByID(int studentID) {
        return studentRegistration.findStudentByID(studentID);
    }

    public Student findStudentByName(String name) {
        return studentRegistration.findStudentByName(name);
    }

    public void displayStudentTuitionStatus() {
        studentRegistration.displayStudentTuitionStatus();
    }





    // Course
    public void displayAllCourse() {
        courseRegistration.DisplayCourse();
    }

    public String saveCourse(Course course) {
        courseRegistration.addCourse(course);
        return "Course Saved Successfully";
    }

    public String updateCourse(Course course) {
        courseRegistration.UpdateCourse(course);
        return "Update Complete";
    }

    public String removeCourse(Course course) {
        courseRegistration.RemoveCourse(course);
        return "Remove Success";
    }




    // Department
    public void displayAllDepartment() {
        departmentRegistration.DisplayDepartments();
    }

    public void displayAllDepartmentwithSections() {
        departmentRegistration.viewAllDepartmentsWithSections();
    }



    public String saveDepartment(String departmentID, String departmentName,
                                 List<Instructor> instructorList, List<Section> sectionList) {
        departmentRegistration.addDepartment(departmentID, departmentName, instructorList, sectionList);
        return "Department Saved Successfully";
    }

    public String updateDepartment(Department department) {
        departmentRegistration.UpdateDepartment(department);
        return "Update Complete";
    }

    public String removeDepartment(Department department) {
        departmentRegistration.RemoveDepartment(department);
        return "Remove Success";
    }



    // Section
    public void displaySectionDetails(Section section) {
        sectionRegistration.displaySectionDetails(section);
    }

    public void displayAllSectionsWithDetails() {
        sectionRegistration.displayAllSectionsWithDetails();
    }

    public void addSection(Section section) {
        sectionRegistration.addSection(section);
    }

    public void enrollStudent(Student student, Section section) throws SectionFullException {
        sectionRegistration.enrollStudentInSection(student, section);
    }

    public Section findSectionByID(String sectionID) {
        return sectionRegistration.findSectionByID(sectionID);
    }




    // Tuition
    public double calculateFee(Student student, int units, double discountRate) {
        return tuitionRegistration.calculateTuitionFee(student, units, discountRate);
    }

    public void makePayment(Student student, double amount) {
        tuitionRegistration.makePayment(student, amount);
    }

    public double getRemainingBalance(Student student) {
        return tuitionRegistration.getRemainingBalance(student);
    }

    public boolean isFullyPaid(Student student) {
        return tuitionRegistration.isFullyPaid(student);
    }

    public double applyScholarshipDiscount(Student student, String scholarshipType) {
        return tuitionRegistration.applyScholarshipDiscount(student, scholarshipType);
    }




    // Instructor
    public void addInstructor(Instructor instructor) {
        instructorRegistration.addInstructor(instructor);
    }

    public void assignInstructorToSection(Instructor instructor, Section section) {
        instructorRegistration.assignInstructorToSection(instructor, section);
    }

    public void getInstructorDetails(int instructorID) {
        instructorRegistration.getInstructorDetails(instructorID);
    }

    public void displayAllInstructors() {
        instructorRegistration.displayAllInstructors();
    }
}