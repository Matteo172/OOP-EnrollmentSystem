package EnrollmentSystem;
import java.util.*;

import EnrollmentSystem.model.Course;
import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Student;
import EnrollmentSystem.service.CampusRegistrar;
import EnrollmentSystem.service.CourseRegistrationImpl;
import EnrollmentSystem.service.StudentRegistration;
import EnrollmentSystem.service.StudentRegistrationImpl;

public class Maincode {

    public static void clearscreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        Student student = new Student();
//        student.mainTask();
//
//        Instructor instructor = new Instructor();
//        instructor.mainTask();


        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();

        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistration, courseRegistration);

        boolean checker = false;

        clearscreen();
        System.out.println("██     ██ ▄▄▄▄▄ ▄▄     ▄▄▄▄  ▄▄▄  ▄▄   ▄▄ ▄▄▄▄▄   ▄▄▄▄▄▄ ▄▄▄    ██████ ▄▄  ▄▄ ▄▄▄▄   ▄▄▄  ▄▄    ▄▄    ▄▄   ▄▄ ▄▄▄▄▄ ▄▄  ▄▄ ▄▄▄▄▄▄   ▄█████ ▄▄ ▄▄  ▄▄▄▄ ▄▄▄▄▄▄ ▄▄▄▄▄ ▄▄   ▄▄ ");
        System.out.println("██ ▄█▄ ██ ██▄▄  ██    ██▀▀▀ ██▀██ ██▀▄▀██ ██▄▄      ██  ██▀██   ██▄▄   ███▄██ ██▄█▄ ██▀██ ██    ██    ██▀▄▀██ ██▄▄  ███▄██   ██     ▀▀▀▄▄▄ ▀███▀ ███▄▄   ██   ██▄▄  ██▀▄▀██ ");
        System.out.println(" ▀██▀██▀  ██▄▄▄ ██▄▄▄ ▀████ ▀███▀ ██   ██ ██▄▄▄     ██  ▀███▀   ██▄▄▄▄ ██ ▀██ ██ ██ ▀███▀ ██▄▄▄ ██▄▄▄ ██   ██ ██▄▄▄ ██ ▀██   ██     █████▀   █   ▄▄██▀   ██   ██▄▄▄ ██   ██ \n\n");

        while(!checker){
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("║                USER ACCESS MENU                  ║");
            System.out.println("╠══════════════════════════════════════════════════╣");
            System.out.println("║   1. Student Registration                        ║");
            System.out.println("║   2. Course Registration                         ║");
            System.out.println("║   3. Exit                                        ║");
            System.out.println("╚══════════════════════════════════════════════════╝");

            try{
                System.out.print("\n Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice){

                    case 1:
                        clearscreen();
                        clearscreen();
                        System.out.println("╔══════════════════════════════════════════════════╗");
                        System.out.println("║               STUDENT REGISTRATION               ║");
                        System.out.println("╠══════════════════════════════════════════════════╣");
                        System.out.println("║   1. Save Student                                ║");
                        System.out.println("║   2. Display Student                             ║");
                        System.out.println("║   3. Update Student                              ║");
                        System.out.println("║   4. Remove Student                              ║");
                        System.out.println("║   5. Exit                                        ║");
                        System.out.println("╚══════════════════════════════════════════════════╝");

                        try{
                            System.out.print("\n Enter your choice: ");
                            int choice2 = scanner.nextInt();

                            switch (choice){
                                case 1:
                            }

                        }catch(InputMismatchException e){
                            System.out.println("\nInvalid input. Please enter your ID number.\n");
                            System.out.println("Type Anything to continue.");
                            scanner.nextLine();
                            scanner.next();
                            clearscreen();

                        }


                        break;



                    case 2:
                        clearscreen();
                        System.out.println("╔══════════════════════════════════════════════════╗");
                        System.out.println("║               COURSE REGISTRATION                ║");
                        System.out.println("╠══════════════════════════════════════════════════╣");
                        System.out.println("║   1. Save Course                                 ║");
                        System.out.println("║   2. Display Course                              ║");
                        System.out.println("║   3. Update Course                               ║");
                        System.out.println("║   4. Remove Course                               ║");
                        System.out.println("║   5. Exit                                        ║");
                        System.out.println("╚══════════════════════════════════════════════════╝");

                        try{
                            System.out.print("\n Enter your choice: ");
                            int choice2 = scanner.nextInt();

                            switch (choice){
                                case 1:
                            }

                        }catch(InputMismatchException e){
                            System.out.println("\nInvalid input.\n");
                            System.out.println("Type Anything to continue.");
                            scanner.nextLine();
                            scanner.next();
                            clearscreen();

                        }


                        break;


                    case 3: clearscreen();
                        clearscreen();
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.out.println("                     ▄████  ▄▄▄▄   ▄▄▄   ▄▄▄▄ ▄▄  ▄▄▄   ▄▄▄▄  ▄▄        ");
                        System.out.println("                    ██  ▄▄▄ ██▄█▄ ██▀██ ██▀▀▀ ██ ██▀██ ███▄▄  ██        ");
                        System.out.println("                     ▀███▀  ██ ██ ██▀██ ▀████ ██ ██▀██ ▄▄██▀  ██        ");
                        System.out.println("                                                              ▄▄        ");
                        System.out.println("                                                                        ");
                        System.out.println("              ▄█████  ▄▄▄  ▄▄   ▄▄ ▄▄▄▄▄   ▄████▄  ▄▄▄▄  ▄▄▄  ▄▄ ▄▄  ▄▄ ");
                        System.out.println("              ██     ██▀██ ██▀▄▀██ ██▄▄    ██▄▄██ ██ ▄▄ ██▀██ ██ ███▄██ ");
                        System.out.println("              ▀█████ ▀███▀ ██   ██ ██▄▄▄   ██  ██ ▀███▀ ██▀██ ██ ██ ▀██ ");
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Choice. Please Try again");
                }


            }catch(InputMismatchException e){
                System.out.println("\nInvalid input. Please enter your ID number.\n");
                System.out.println("Type Anything to continue.");
                scanner.nextLine();
                scanner.next();
                clearscreen();

            }


        }




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
