package EnrollmentSystem.service;

import EnrollmentSystem.model.*;

import java.util.List;

public class CampusRegistrar {
    private StudentReg studentRegistration;
    private CourseReg courseRegistration;
    private DepartmentReg departmentRegistration;
    private SectionReg sectionRegistration;
    private TuitionReg tuitionRegistration;

    public CampusRegistrar(StudentReg studentRegistration, CourseReg courseRegistration, DepartmentReg departmentRegistration, SectionReg sectionRegistration, TuitionReg tuitionRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.departmentRegistration = departmentRegistration;
        this.sectionRegistration = sectionRegistration;
        this.tuitionRegistration = tuitionRegistration;
    }


    //Student
    public void displayAllStudent(){
        studentRegistration.DisplayStudent();
    }

    public String saveStudent(Student student){
        studentRegistration.addStudent(student);
        return "Student Saved Successfully";
    }

    public String updateStudent(Student student){
        studentRegistration.UpdateStudent(student);
        return "Update Complete";
    }

    public String removeStudent(Student student){
        studentRegistration.RemoveStudent(student);
        return "Remove Success";
    }


    //Course
    public void displayAllCourse(){
        courseRegistration.DisplayCourse();
    }

    public String saveCourse(Course course){
        courseRegistration.addCourse(course);
        return "Course Saved Successfully";
    }

    public String updateCourse(Course course){
        courseRegistration.UpdateCourse(course);
        return "Update Complete";
    }

    public String removeCourse(Course course){
        courseRegistration.RemoveCourse(course);
        return "Remove Success";
    }



    //Department
    public void displayAllDepartment(){
        departmentRegistration.DisplayDepartments();
    }

    public String saveDepartment(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList){
        departmentRegistration.addDepartment(departmentID, departmentName, instructorList, sectionList);
        return "Department Saved Successfully";
    }

    public String updateDepartment(Department department){
        departmentRegistration.UpdateDepartment(department);
        return "Update Complete";
    }

    public String removeDepartment(Department department){
        departmentRegistration.RemoveDepartment(department);
        return "Remove Success";
    }


    //Section



    //Tuition



}
