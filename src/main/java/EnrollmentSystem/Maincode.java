package EnrollmentSystem;

import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Student;
import EnrollmentSystem.service.CampusRegistrar;
import EnrollmentSystem.service.CourseRegistrationImpl;
import EnrollmentSystem.service.StudentRegistration;
import EnrollmentSystem.service.StudentRegistrationImpl;

public class Maincode {

    public static void main(String[] args){



        Student student = new Student();
        Instructor instructor = new Instructor();

        student.mainTask();
        instructor.mainTask();

        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();

        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();

        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistration, courseRegistration);

        System.out.println("Welcome to Enrollment System");





//        StudentRegistration studentRegistration = new StudentRegistration();
//        CourseRegistration courseRegistration = new CourseRegistration();
//        TuitionFeePayment tuitionFeePayment = new TuitionFeePayment();
//
//        studentRegistration.addStudent(new Student("Justine Betito",1));
//        studentRegistration.addStudent(new Student("Paul Bathan", 2));
//        studentRegistration.addStudent(new Student("Gab Barrion", 3));
//
//
//        courseRegistration.addCourse(new Course("1","ITPROMA", "BSIT"));
//        courseRegistration.addCourse(new Course("2","INFOMAN", "BSIT"));
//        courseRegistration.addCourse(new Course("3","SYSDE", "BSIT"));
//
//
//
//

        //update
//        studentRegistration.updateStudent(new Student("Sam Abjelina", 3));
//        studentRegistration.DisplayStudent();
//
//        tuitionFeePayment.calculateTuitionFee(16, .10);



        //remove
//        studentRegistration.delete(new Student("Aryl Manalo", 1));
//        courseRegistration.DisplayCourse();


















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
