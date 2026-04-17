package EnrollmentSystem;
import java.util.*;
import EnrollmentSystem.model.*;
import EnrollmentSystem.service.CampusRegistrar;
import EnrollmentSystem.service.CourseRegistrationService;
import EnrollmentSystem.service.DepartmentRegistrationService;
import EnrollmentSystem.service.StudentRegistrationService;

public class Maincode {

    public static void clearscreen() {
        System.out.print("\n".repeat(50));
        System.out.flush();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        StudentRegistrationService studentRegistration = new StudentRegistrationService();
        CourseRegistrationService courseRegistration = new CourseRegistrationService();
        DepartmentRegistrationService  departmentRegistration = new DepartmentRegistrationService();

        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistration, courseRegistration, departmentRegistration);

        boolean running = true;

        clearscreen();
        System.out.println("██     ██ ▄▄▄▄▄ ▄▄     ▄▄▄▄  ▄▄▄  ▄▄   ▄▄ ▄▄▄▄▄   ▄▄▄▄▄▄ ▄▄▄    ██████ ▄▄  ▄▄ ▄▄▄▄  " +
                " ▄▄▄  ▄▄    ▄▄    ▄▄   ▄▄ ▄▄▄▄▄ ▄▄  ▄▄ ▄▄▄▄▄▄   ▄█████ ▄▄ ▄▄  ▄▄▄▄ ▄▄▄▄▄▄ ▄▄▄▄▄ ▄▄   ▄▄ ");
        System.out.println("██ ▄█▄ ██ ██▄▄  ██    ██▀▀▀ ██▀██ ██▀▄▀██ ██▄▄      ██  ██▀██   ██▄▄   ███▄██ ██▄█▄ " +
                "██▀██ ██    ██    ██▀▄▀██ ██▄▄  ███▄██   ██     ▀▀▀▄▄▄ ▀███▀ ███▄▄   ██   ██▄▄  ██▀▄▀██ ");
        System.out.println(" ▀██▀██▀  ██▄▄▄ ██▄▄▄ ▀████ ▀███▀ ██   ██ ██▄▄▄     ██  ▀███▀   ██▄▄▄▄ ██ ▀██ ██ ██ " +
                "▀███▀ ██▄▄▄ ██▄▄▄ ██   ██ ██▄▄▄ ██ ▀██   ██     █████▀   █   ▄▄██▀   ██   ██▄▄▄ ██   ██ \n\n");



        while(running){
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("║              CAMPUS REGISTRAR MENU               ║");
            System.out.println("╠══════════════════════════════════════════════════╣");
            System.out.println("║   1. Student Registration                        ║");
            System.out.println("║   2. Course Registration                         ║");
            System.out.println("║   3. Department Registration                     ║");
            System.out.println("║   4. Exit                                        ║");
            System.out.println("╚══════════════════════════════════════════════════╝");

            try{
                System.out.print("\n Enter your choice: ");
                int choice = scanner.nextInt();

                switch(choice){

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

                            switch (choice2){
                                case 1:
                                    clearscreen();
                                    System.out.println("\n====== Register New Student ======");
                                    System.out.print("Enter ID Number: ");
                                    int id = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Enter Name: ");
                                    String name = scanner.nextLine();

                                    System.out.print("Enter Program: ");
                                    String program = scanner.nextLine();

                                    String result = campusRegistrar.saveStudent(new Student(id, name, program));
                                    System.out.println("\n" + result);

                                    System.out.println("Press Enter to continue");
                                    scanner.nextLine();
                                    break;
                                case 2:
                                    clearscreen();
                                    campusRegistrar.displayAllStudent();
                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                    break;
                                case 3:
                                    clearscreen();
                                    break;
                                case 4:
                                    clearscreen();
                                    break;
                                case 5:
                                    clearscreen();
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
                            int choice3 = scanner.nextInt();

                            switch (choice3){
                                case 1:
                                    clearscreen();
                                    break;
                                case 2:
                                    clearscreen();
                                    break;
                                case 3:
                                    clearscreen();
                                    break;
                                case 4:
                                    clearscreen();
                                    break;
                                case 5:
                                    clearscreen();
                                    break;
                                default:
                                    System.out.println("Invalid Choice. Please Try again");
                            }

                        }catch(InputMismatchException e){
                            System.out.println("\nInvalid input.\n");
                            System.out.println("Type Anything to continue.");
                            scanner.nextLine();
                            scanner.next();
                            clearscreen();

                        }


                        break;


                    case 3:
                        clearscreen();
                        System.out.println("╔══════════════════════════════════════════════════╗");
                        System.out.println("║             DEPARTMENT REGISTRATION              ║");
                        System.out.println("╠══════════════════════════════════════════════════╣");
                        System.out.println("║   1. Save Course                                 ║");
                        System.out.println("║   2. Display Course                              ║");
                        System.out.println("║   3. Update Course                               ║");
                        System.out.println("║   4. Remove Course                               ║");
                        System.out.println("║   5. Exit                                        ║");
                        System.out.println("╚══════════════════════════════════════════════════╝");

                        try{
                            System.out.print("\n Enter your choice: ");
                            int choice4 = scanner.nextInt();

                            switch (choice4){
                                case 1:
                                    clearscreen();
                                    break;
                                case 2:
                                    clearscreen();
                                    break;
                                case 3:
                                    clearscreen();
                                    break;
                                case 4:
                                    clearscreen();
                                    break;
                                case 5:
                                    clearscreen();
                                    break;
                                default:
                                    System.out.println("Invalid Choice. Please Try again");
                            }

                        }catch(InputMismatchException e){
                            System.out.println("\nInvalid input.\n");
                            System.out.println("Type Anything to continue.");
                            scanner.nextLine();
                            scanner.next();
                            clearscreen();

                        }


                        break;


                    case 4:
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
