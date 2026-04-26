package EnrollmentSystem;
import java.util.*;
import EnrollmentSystem.model.*;
import EnrollmentSystem.service.CampusRegistrar;
import EnrollmentSystem.service.CourseRegistrationService;
import EnrollmentSystem.service.DepartmentRegistrationService;
import EnrollmentSystem.service.StudentRegistrationService;

public class Maincode {

    public static void clearscreen(){
        System.out.print("\033[H\033[2J");
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
            System.out.println("\n╔══════════════════════════════════════════════════╗");
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
                scanner.nextLine();

                switch(choice){

                    case 1:
                        boolean studentMenu = true;
                        while (studentMenu) {
                            clearscreen();
                            System.out.println("\n╔══════════════════════════════════════════════════╗");
                            System.out.println("║               STUDENT REGISTRATION               ║");
                            System.out.println("╠══════════════════════════════════════════════════╣");
                            System.out.println("║   1. Save Student                                ║");
                            System.out.println("║   2. Display Student                             ║");
                            System.out.println("║   3. Update Student                              ║");
                            System.out.println("║   4. Remove Student                              ║");
                            System.out.println("║   5. Exit                                        ║");
                            System.out.println("╚══════════════════════════════════════════════════╝");

                            try {
                                System.out.print("\nEnter your choice: ");
                                int choice2 = scanner.nextInt();

                                switch (choice2) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== Register New Student ======");
                                        System.out.print("Enter Student ID Number: ");
                                        int sID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Enter Name: ");
                                        String sName = scanner.nextLine();

                                        System.out.print("Enter Program: ");
                                        String sProgram = scanner.nextLine();

                                        String sResult = campusRegistrar.saveStudent(new Student(sID, sName, sProgram));
                                        System.out.println("\n" + sResult);

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
                                        System.out.println("\n====== Update Student Information ======");
                                        System.out.print("Enter the ID of the student to update: ");
                                        int updateID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Enter New Name: ");
                                        String newName = scanner.nextLine();
                                        System.out.print("Enter New Program: ");
                                        String newProgram = scanner.nextLine();

                                        Student updatedStudent = new Student(updateID, newName, newProgram);

                                        System.out.println("\n" + campusRegistrar.updateStudent(updatedStudent));

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;
                                    case 4:
                                        clearscreen();
                                        System.out.println("\n====== Remove Student ======");
                                        System.out.print("Enter the ID of the student to remove: ");
                                        int removeID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Are you sure you want to remove student " + removeID + "? (Y/N): ");
                                        String confirm = scanner.nextLine();

                                        if (confirm.equalsIgnoreCase("Y")) {
                                            Student dummy = new Student(removeID, "", "");
                                            System.out.println("\n" + campusRegistrar.removeStudent(dummy));
                                        } else {
                                            System.out.println("Removal Cancelled.");
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;
                                    case 5:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        studentMenu = false;
                                        break;
                                    default:
                                        System.out.println("\nInvalid Choice (1-5 only). Please Try again.");
                                        System.out.println("Press Enter to continue...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        clearscreen();
                                        break;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("\nInvalid input. Please enter a number.\n");
                                System.out.println("Press Enter to continue.");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearscreen();
                            }
                        }
                    break;


                    case 2:
                        boolean courseMenu = true;
                        while (courseMenu) {
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

                            try {
                                System.out.print("\n Enter your choice: ");
                                int choice3 = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice3) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== Register New Course ======");
                                        System.out.print("Enter Course ID: ");
                                        String cId = scanner.nextLine();

                                        System.out.print("Enter Course Name: ");
                                        String cName = scanner.nextLine();

                                        System.out.print("Enter Program: ");
                                        String cProg = scanner.nextLine();

                                        String result = campusRegistrar.saveCourse(new Course(cId, cName, cProg));
                                        System.out.println("\n" + result);

                                        System.out.println("\nPress Enter to continue...");
                                        scanner.nextLine();
                                        break;
                                    case 2:
                                        clearscreen();
                                        campusRegistrar.displayAllCourse();
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;
                                    case 3:
                                        clearscreen();
                                        System.out.println("\n====== Update Course Information ======");
                                        System.out.print("Enter the ID of the course to update: ");
                                        String updateCID = scanner.nextLine();

                                        System.out.print("Enter New Course Name: ");
                                        String newCName = scanner.nextLine();
                                        System.out.print("Enter New Program: ");
                                        String newCProg = scanner.nextLine();

                                        System.out.println("\n" + campusRegistrar.updateCourse(new Course(updateCID, newCName, newCProg)));
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;
                                    case 4:
                                        clearscreen();
                                        System.out.println("\n====== Remove Course ======");
                                        System.out.print("Enter the ID of the course to remove: ");
                                        String removeCID = scanner.nextLine();

                                        System.out.print("Are you sure? (Y/N): ");
                                        if (scanner.nextLine().equalsIgnoreCase("Y")) {
                                            System.out.println("\n" + campusRegistrar.removeCourse(new Course(removeCID, "", "")));
                                        } else {
                                            System.out.println("Action cancelled.");
                                        }
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;
                                    case 5:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        courseMenu = false;
                                        break;
                                    default:
                                        System.out.println("\nInvalid Choice (1-5 only). Please Try again.");
                                        System.out.println("Press Enter to continue...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        clearscreen();
                                        break;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("\nInvalid input. Please enter a number .\n");
                                System.out.println("Press Enter to continue.");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearscreen();

                            }
                        }

                    break;


                    case 3:
                        clearscreen();
                        System.out.println("╔══════════════════════════════════════════════════╗");
                        System.out.println("║             DEPARTMENT REGISTRATION              ║");
                        System.out.println("╠══════════════════════════════════════════════════╣");
                        System.out.println("║   1. Save Department                             ║");
                        System.out.println("║   2. Display Department                          ║");
                        System.out.println("║   3. Update Department                           ║");
                        System.out.println("║   4. Remove Department                           ║");
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
