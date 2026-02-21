package EnrollmentSystem;

import EnrollmentSystem.model.Course;
import EnrollmentSystem.model.Student;
import EnrollmentSystem.service.CourseRegistration;
import EnrollmentSystem.service.StudentRegistration;

public class Maincode {

    public static void main(String[] args){

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();


        studentRegistration.addStudent(new Student(1,"John Doe", "BSIT"));
        studentRegistration.addStudent(new Student(2,"BOB", "BSIT"));
        studentRegistration.addStudent(new Student(3,"Charlie", "BSIT"));


        courseRegistration.addCourse(new Course(1,"ITPROMA", "BSIT"));
        courseRegistration.addCourse(new Course(2,"INFOMAN", "BSIT"));
        courseRegistration.addCourse(new Course(3,"SYSDE", "BSIT"));





        //update

        studentRegistration.DisplayStudent();

        //remove

        courseRegistration.DisplayCourse();
























//        Student s = new Student();
//        s.setStudentID("000123");
//        s.setStudentName("John Doe");
//        s.setSProgram("Information Technology");
//
//        Student s1 = new Student();
//        s1.setStudentID("000124");
//        s1.setStudentName("Jane Doe");
//        s1.setSProgram("Information Technology");
//
//        Course c = new Course();
//        c.setCourseID("00001");
//        c.setCourseName("Integrative Programming");
//        c.setCProgram("Information Technology");
//
//        s.display();
//        System.out.println("\n\n-----------------------------------------------");
//        s1.display();
//        System.out.println("\n\n-----------------------------------------------");
//        c.cDisplay();

//        System.out.printf("\nStudent Name: %s\nStudent ID: %s\nProgram: %s",s.getStudentName(),s.getStudentID(),s.getSProgram());
//        System.out.println("\n\n-----------------------------------------------");
//        System.out.printf("\nStudent Name: %s\nStudent ID: %s\nProgram: %s",s1.getStudentName(),s1.getStudentID(),s1.getSProgram());
//        System.out.println("\n\n-----------------------------------------------");
//        System.out.printf("\nCourse Name: %s\nCourse ID: %s\nProgram: %s",c.getCourseName(), c.getCourseID(), c.getProgram());












    }
}
