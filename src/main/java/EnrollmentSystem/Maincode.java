package EnrollmentSystem;
import java.util.*;
import EnrollmentSystem.model.*;
import EnrollmentSystem.service.*;
import EnrollmentSystem.exception.SectionFullException;

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
        SectionRegistrationService sectionRegistration = new SectionRegistrationService();
        TuitionFeePayment tuitionRegistration = new TuitionFeePayment();
        InstructorRegistrationService instructorRegistration = new InstructorRegistrationService();

        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistration, courseRegistration,
                departmentRegistration, sectionRegistration, tuitionRegistration, instructorRegistration);

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
            System.out.println("║   1. Student Menu                                ║");
            System.out.println("║   2. Course Menu                                 ║");
            System.out.println("║   3. Instructor Menu                             ║");
            System.out.println("║   4. Department Menu                             ║");
            System.out.println("║   5. Section Menu                                ║");
            System.out.println("║   6. Tuition Menu                                ║");
            System.out.println("║   7. Exit                                        ║");
            System.out.println("╚══════════════════════════════════════════════════╝");

            try{
                System.out.print("\n Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice) {

//Student Menu
                    case 1:
                        boolean studentMenu = true;
                        while (studentMenu) {
                            clearscreen();
                            System.out.println("\n╔══════════════════════════════════════════════════╗");
                            System.out.println("║                   STUDENT MENU                   ║");
                            System.out.println("╠══════════════════════════════════════════════════╣");
                            System.out.println("║   1. Save Student                                ║");
                            System.out.println("║   2. Display Student                             ║");
                            System.out.println("║   3. Update Student                              ║");
                            System.out.println("║   4. Remove Student                              ║");
                            System.out.println("║   5. Find Student                                ║");
                            System.out.println("║   6. Exit                                        ║");
                            System.out.println("╚══════════════════════════════════════════════════╝");

                            try {
                                System.out.print("\nEnter your choice: ");
                                int choice2 = scanner.nextInt();

                                switch (choice2) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== ADD New Student ======");
                                        System.out.print("Enter Student ID Number: ");
                                        int sID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Enter Student Name: ");
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

                                        System.out.print("Are you sure you want to remove student " + removeID +
                                                "? (Y/N): ");
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
                                        System.out.println("\n====== Find Student ======");
                                        System.out.println("1. Find by ID");
                                        System.out.println("2. Find by Name");
                                        System.out.print("Enter your choice: ");
                                        int findChoice = scanner.nextInt();
                                        scanner.nextLine();

                                        if (findChoice == 1) {
                                            System.out.print("Enter Student ID: ");
                                            int findID = scanner.nextInt();
                                            scanner.nextLine();

                                            Student found = campusRegistrar.findStudentByID(findID);
                                            if (found != null) {
                                                System.out.println("\nStudent Found!");
                                                System.out.println(found);
                                            }

                                        } else if (findChoice == 2) {
                                            System.out.print("Enter Student Name: ");
                                            String findName = scanner.nextLine();

                                            Student found = campusRegistrar.findStudentByName(findName);
                                            if (found != null) {
                                                System.out.println("\nStudent Found!");
                                                System.out.println(found);
                                            }
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 6:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        studentMenu = false;
                                        break;
                                    default:
                                        System.out.println("\nInvalid Choice (1-6 only). Please Try again.");
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


//Course Menu
                    case 2:
                        boolean courseMenu = true;
                        while (courseMenu) {
                            clearscreen();
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║                   COURSE MENU                    ║");
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
                                        System.out.println("\n====== ADD New Course ======");
                                        System.out.print("Enter Course ID: ");
                                        String courseId = scanner.nextLine();

                                        System.out.print("Enter Course Name: ");
                                        String courseName = scanner.nextLine();

                                        System.out.print("Enter Program: ");
                                        String Program = scanner.nextLine();

                                        String result = campusRegistrar.saveCourse(new Course(courseId, courseName,
                                                Program));
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

                                        System.out.println("\n" + campusRegistrar.updateCourse(new Course(updateCID,
                                                newCName, newCProg)));
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
                                            System.out.println("\n" + campusRegistrar.removeCourse(new Course(removeCID,
                                                    "", "")));
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

//Instructor Menu

                    case 3:
                        boolean instructorMenu = true;
                        while(instructorMenu){
                        clearscreen();
                        System.out.println("╔══════════════════════════════════════════════════╗");
                        System.out.println("║                 INSTRUCTOR MENU                  ║");
                        System.out.println("╠══════════════════════════════════════════════════╣");
                        System.out.println("║   1. Save Instructor                             ║");
                        System.out.println("║   2. Display Instructors                         ║");
                        System.out.println("║   3. View Instructor Details                     ║");
                        System.out.println("║   4. Assign Instructor to Section                ║");
                        System.out.println("║   5. Update Instructor                           ║");
                        System.out.println("║   6. Remove Instructor                           ║");
                        System.out.println("║   7. Exit                                        ║");
                        System.out.println("╚══════════════════════════════════════════════════╝");

                        try {
                            System.out.print("\n Enter your choice: ");
                            int choice4 = scanner.nextInt();

                            switch (choice4) {
                                case 1:
                                    clearscreen();
                                    System.out.println("\n====== ADD New Instructor ======");
                                    System.out.print("Enter Instructor ID Number: ");
                                    int ID = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Enter Instructor Name: ");
                                    String name = scanner.nextLine();

                                    System.out.print("Enter Course: ");
                                    String course = scanner.nextLine();

                                    String iResult = campusRegistrar.addInstructor(new Instructor(ID, name, course));
                                    System.out.println("\n" + iResult);

                                    System.out.println("Press Enter to continue");
                                    scanner.nextLine();
                                    break;

                                case 2:
                                    clearscreen();
                                    System.out.println("\n====== Display Instructors ======");
                                    campusRegistrar.displayAllInstructors();
                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    break;

                                case 3:
                                    clearscreen();
                                    System.out.println("\n====== View Instructor Details ======");
                                    System.out.print("Enter Instructor ID: ");
                                    int detailID = scanner.nextInt();
                                    scanner.nextLine();

                                    campusRegistrar.getInstructorDetails(detailID);

                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    break;


                                case 4:
                                    clearscreen();
                                    System.out.println("\n====== Assign Instructor to Section ======");

                                    campusRegistrar.displayAllInstructors();
                                    System.out.print("\nEnter Instructor ID: ");
                                    int assignID = scanner.nextInt();
                                    scanner.nextLine();

                                    campusRegistrar.displayAllSectionsWithDetails();
                                    System.out.print("\nEnter Section ID: ");
                                    String assignSectionID = scanner.nextLine();

                                    Instructor assignInstructor = campusRegistrar.findInstructorByID(assignID);
                                    Section assignSection = campusRegistrar.findSectionByID(assignSectionID);

                                    if (assignInstructor != null && assignSection != null) {
                                        campusRegistrar.assignInstructorToSection(assignInstructor, assignSection);
                                        System.out.println("Instructor assigned successfully!");
                                    } else {
                                        System.out.println("Instructor or Section not found.");
                                    }

                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    break;


                                case 5:
                                    clearscreen();
                                    System.out.println("\n====== Update Instructor ======");
                                    System.out.print("Enter Instructor ID to update: ");
                                    int updateID = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Enter New Name: ");
                                    String updateName = scanner.nextLine();

                                    System.out.print("Enter New Course: ");
                                    String updateCourse = scanner.nextLine();

                                    String updateResult = campusRegistrar.updateInstructor(new Instructor(updateID,
                                            updateName, updateCourse));
                                    System.out.println("\n" + updateResult);

                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    break;

                                case 6:
                                    clearscreen();
                                    System.out.println("\n====== Remove Instructor ======");

                                    campusRegistrar.displayAllInstructors();

                                    System.out.print("\nEnter Instructor ID to remove: ");
                                    int removeID = scanner.nextInt();
                                    scanner.nextLine();

                                    Instructor toRemove = campusRegistrar.findInstructorByID(removeID);

                                    if (toRemove != null) {
                                        System.out.println("\nFound: ID: " + toRemove.getID() + " | Name: " +
                                                toRemove.getName());
                                        System.out.print("Are you sure you want to remove this instructor? (Y/N): ");
                                        String confirm = scanner.nextLine();

                                        if (confirm.equalsIgnoreCase("Y")) {
                                            String removeResult = campusRegistrar.removeInstructor(toRemove);
                                            System.out.println("\n" + removeResult);
                                        } else {
                                            System.out.println("Removal Cancelled.");
                                        }
                                    }

                                    System.out.println("\nPress Enter to return...");
                                    scanner.nextLine();
                                    break;

                                case 7:
                                    clearscreen();
                                    System.out.println("Returning to Main Menu...");
                                    instructorMenu = false;
                                    break;
                                default:
                                    System.out.println("Invalid Choice (1-7 only). Please Try again");
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


// Department Menu

                    case 4:
                        boolean departmentMenu = true;
                        while(departmentMenu) {
                            clearscreen();
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║                 DEPARTMENT MENU                  ║");
                            System.out.println("╠══════════════════════════════════════════════════╣");
                            System.out.println("║   1. Save Department                             ║");
                            System.out.println("║   2. Display Departments                         ║");
                            System.out.println("║   3. Display Departments with Sections           ║");
                            System.out.println("║   4. Update Department                           ║");
                            System.out.println("║   5. Remove Department                           ║");
                            System.out.println("║   6. Exit                                        ║");
                            System.out.println("╚══════════════════════════════════════════════════╝");

                            try {
                                System.out.print("\n Enter your choice: ");
                                int choice5 = scanner.nextInt();

                                switch (choice5) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== Add New Department ======");
                                        System.out.print("Enter Department ID: ");
                                        String dID = scanner.next();
                                        scanner.nextLine();

                                        System.out.print("Enter Department Name: ");
                                        String dName = scanner.nextLine();

                                        String dResult = campusRegistrar.saveDepartment(dID, dName,
                                                new ArrayList<>(), new ArrayList<>());
                                        System.out.println("\n" + dResult);

                                        System.out.println("Press Enter to continue");
                                        scanner.nextLine();
                                        break;

                                    case 2:
                                        clearscreen();
                                        campusRegistrar.displayAllDepartment();
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        break;

                                    case 3:
                                        clearscreen();
                                        campusRegistrar.displayAllDepartmentwithSections();
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        break;

                                    case 4:
                                        clearscreen();
                                        System.out.println("\n====== Update Department ======");
                                        campusRegistrar.displayAllDepartment();

                                        System.out.print("\nEnter Department ID to update: ");
                                        String updateDID = scanner.next();
                                        scanner.nextLine();

                                        System.out.print("Enter New Department Name: ");
                                        String updateDName = scanner.nextLine();

                                        Department updatedDept = new Department(updateDID, updateDName,
                                                new ArrayList<>(), new ArrayList<>());
                                        String updateDResult = campusRegistrar.updateDepartment(updatedDept);
                                        System.out.println("\n" + updateDResult);

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 5:
                                        clearscreen();
                                        System.out.println("\n====== Remove Department ======");
                                        campusRegistrar.displayAllDepartment();

                                        System.out.print("\nEnter Department ID to remove: ");
                                        String removeDID = scanner.next();
                                        scanner.nextLine();

                                        Department deptToRemove = new Department(removeDID, "",
                                                new ArrayList<>(), new ArrayList<>());

                                        System.out.print("Are you sure you want to remove Department " + removeDID +
                                                "? (Y/N): ");
                                        String dConfirm = scanner.nextLine();

                                        if (dConfirm.equalsIgnoreCase("Y")) {
                                            String removeDResult = campusRegistrar.removeDepartment(deptToRemove);
                                            System.out.println("\n" + removeDResult);
                                        } else {
                                            System.out.println("Removal Cancelled.");
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 6:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        departmentMenu = false;
                                        break;

                                    default:
                                        System.out.println("Invalid Choice (1-6 only). Please Try again");
                                        System.out.println("Press Enter to continue...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        clearscreen();
                                        break;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("\nInvalid input.\n");
                                System.out.println("Type Anything to continue.");
                                scanner.nextLine();
                                scanner.next();
                                clearscreen();

                            }
                        }

                        break;

// Section Menu
                    case 5:
                        boolean sectionMenu = true;
                        while(sectionMenu) {
                            clearscreen();
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║                   SECTION MENU                   ║");
                            System.out.println("╠══════════════════════════════════════════════════╣");
                            System.out.println("║   1. Add Section                                 ║");
                            System.out.println("║   2. Display All Sections                        ║");
                            System.out.println("║   3. Update Section                              ║");
                            System.out.println("║   4. Remove Section                              ║");
                            System.out.println("║   5. Enroll Student in Section                   ║");
                            System.out.println("║   6. Find Section by ID                          ║");
                            System.out.println("║   7. Exit                                        ║");
                            System.out.println("╚══════════════════════════════════════════════════╝");

                            try {
                                System.out.print("\n Enter your choice: ");
                                int choice6 = scanner.nextInt();

                                switch (choice6) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== Add New Section ======");
                                        System.out.print("Enter Section ID: ");
                                        String secID = scanner.next();
                                        scanner.nextLine();

                                        System.out.print("Enter Course ID: ");
                                        String secCourseID = scanner.nextLine();

                                        System.out.print("Enter Instructor ID: ");
                                        int secInstructorID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Enter Max Capacity: ");
                                        int secCapacity = scanner.nextInt();
                                        scanner.nextLine();

                                        Course secCourse = new Course(secCourseID, "", "");
                                        Instructor secInstructor = campusRegistrar.findInstructorByID(secInstructorID);
                                        Section newSection = new Section(secID, secCourse, secInstructor, secCapacity);

                                        String secResult = campusRegistrar.addSection(newSection);
                                        System.out.println("\n" + secResult);

                                        System.out.println("Press Enter to continue");
                                        scanner.nextLine();
                                        break;

                                    case 2:
                                        clearscreen();
                                        campusRegistrar.displayAllSectionsWithDetails();
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        break;

                                    case 3:
                                        clearscreen();
                                        System.out.println("\n====== Update Section ======");
                                        campusRegistrar.displayAllSectionsWithDetails();

                                        System.out.print("\nEnter Section ID to update: ");
                                        String updateSecID = scanner.next();
                                        scanner.nextLine();

                                        System.out.print("Enter New Course ID: ");
                                        String updateSecCourseID = scanner.nextLine();

                                        System.out.print("Enter New Instructor ID: ");
                                        int updateSecInstructorID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Enter New Max Capacity: ");
                                        int updateSecCapacity = scanner.nextInt();
                                        scanner.nextLine();

                                        Course updateSecCourse = new Course(updateSecCourseID, "", "");
                                        Instructor updateSecInstructor =
                                                campusRegistrar.findInstructorByID(updateSecInstructorID);
                                        Section updatedSection = new Section(updateSecID, updateSecCourse,
                                                updateSecInstructor, updateSecCapacity);

                                        String updateSecResult = campusRegistrar.updateSection(updatedSection);
                                        System.out.println("\n" + updateSecResult);

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 4:
                                        clearscreen();
                                        System.out.println("\n====== Remove Section ======");
                                        campusRegistrar.displayAllSectionsWithDetails();

                                        System.out.print("\nEnter Section ID to remove: ");
                                        String removeSecID = scanner.next();
                                        scanner.nextLine();

                                        Section secToRemove = campusRegistrar.findSectionByID(removeSecID);

                                        if (secToRemove != null) {
                                            System.out.println("\nFound: " + secToRemove.getSectionID());
                                            System.out.print("Are you sure you want to remove this section? (Y/N): ");
                                            String secConfirm = scanner.nextLine();

                                            if (secConfirm.equalsIgnoreCase("Y")) {
                                                String removeSecResult = campusRegistrar.removeSection(secToRemove);
                                                System.out.println("\n" + removeSecResult);
                                            } else {
                                                System.out.println("Removal Cancelled.");
                                            }
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 5:
                                        clearscreen();
                                        System.out.println("\n====== Enroll Student in Section ======");

                                        campusRegistrar.displayAllStudent();
                                        System.out.print("\nEnter Student ID: ");
                                        int enrollStudentID = scanner.nextInt();
                                        scanner.nextLine();

                                        campusRegistrar.displayAllSectionsWithDetails();
                                        System.out.print("\nEnter Section ID: ");
                                        String enrollSectionID = scanner.nextLine();

                                        Student enrollStudent = campusRegistrar.findStudentByID(enrollStudentID);
                                        Section enrollSection = campusRegistrar.findSectionByID(enrollSectionID);

                                        if (enrollStudent != null && enrollSection != null) {
                                            try {
                                                campusRegistrar.enrollStudent(enrollStudent, enrollSection);
                                                System.out.println("Student enrolled successfully!");
                                            } catch (SectionFullException e) {
                                                System.out.println("ERROR: " + e.getMessage());
                                            }
                                        } else {
                                            System.out.println("Student or Section not found.");
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 6:
                                        clearscreen();
                                        System.out.println("\n====== Find Section by ID ======");
                                        System.out.print("Enter Section ID: ");
                                        String findSecID = scanner.next();
                                        scanner.nextLine();

                                        Section foundSection = campusRegistrar.findSectionByID(findSecID);
                                        if (foundSection != null) {
                                            campusRegistrar.displaySectionDetails(foundSection);
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 7:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        sectionMenu = false;
                                        break;

                                    default:
                                        System.out.println("Invalid Choice (1-7 only). Please Try again");
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

// Tuition Menu
                    case 6:
                        boolean tuitionMenu = true;
                        while(tuitionMenu) {
                            clearscreen();
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║                   TUITION MENU                   ║");
                            System.out.println("╠══════════════════════════════════════════════════╣");
                            System.out.println("║   1. Calculate Tuition Fee                       ║");
                            System.out.println("║   2. Make Payment                                ║");
                            System.out.println("║   3. View Remaining Balance                      ║");
                            System.out.println("║   4. Apply Scholarship Discount                  ║");
                            System.out.println("║   5. View All Tuition Status                     ║");
                            System.out.println("║   6. Exit                                        ║");
                            System.out.println("╚══════════════════════════════════════════════════╝");

                            try {
                                System.out.print("\n Enter your choice: ");
                                int choice7 = scanner.nextInt();

                                switch (choice7) {
                                    case 1:
                                        clearscreen();
                                        System.out.println("\n====== Calculate Tuition Fee ======");

                                        campusRegistrar.displayAllStudent();
                                        System.out.print("\nEnter Student ID: ");
                                        int calcStudentID = scanner.nextInt();
                                        scanner.nextLine();

                                        Student calcStudent = campusRegistrar.findStudentByID(calcStudentID);

                                        if (calcStudent != null) {
                                            System.out.print("Enter Number of Units: ");
                                            int units = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("Enter Discount Rate (0 if none): ");
                                            double discountRate = scanner.nextDouble();
                                            scanner.nextLine();

                                            double total = campusRegistrar.calculateFee(calcStudent, units,
                                                    discountRate);
                                            System.out.println("\nStudent  : " + calcStudent.getName());
                                            System.out.println("Total Fee: " + total);
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 2:
                                        clearscreen();
                                        System.out.println("\n====== Make Payment ======");

                                        campusRegistrar.displayAllStudent();
                                        System.out.print("\nEnter Student ID: ");
                                        int payStudentID = scanner.nextInt();
                                        scanner.nextLine();

                                        Student payStudent = campusRegistrar.findStudentByID(payStudentID);

                                        if (payStudent != null) {
                                            System.out.println("Current Balance: " + payStudent.getTuitionBalance());
                                            System.out.print("Enter Payment Amount: ");
                                            double payAmount = scanner.nextDouble();
                                            scanner.nextLine();

                                            campusRegistrar.makePayment(payStudent, payAmount);
                                            System.out.println("Remaining Balance: " +
                                                    campusRegistrar.getRemainingBalance(payStudent));
                                            System.out.println("Status: " + (campusRegistrar.isFullyPaid(payStudent)
                                                    ? "FULLY PAID" : "PENDING"));
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 3:
                                        clearscreen();
                                        System.out.println("\n====== View Remaining Balance ======");

                                        campusRegistrar.displayAllStudent();
                                        System.out.print("\nEnter Student ID: ");
                                        int balStudentID = scanner.nextInt();
                                        scanner.nextLine();

                                        Student balStudent = campusRegistrar.findStudentByID(balStudentID);

                                        if (balStudent != null) {
                                            System.out.println("\nStudent  : " + balStudent.getName());
                                            System.out.println("Total    : " + balStudent.getTotalTuition());
                                            System.out.println("Balance  : " + campusRegistrar.getRemainingBalance
                                                    (balStudent));
                                            System.out.println("Status   : " + (campusRegistrar.isFullyPaid(balStudent)
                                                    ? "FULLY PAID" : "PENDING"));
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 4:
                                        clearscreen();
                                        System.out.println("\n====== Apply Scholarship Discount ======");

                                        campusRegistrar.displayAllStudent();
                                        System.out.print("\nEnter Student ID: ");
                                        int scholStudentID = scanner.nextInt();
                                        scanner.nextLine();

                                        Student scholStudent = campusRegistrar.findStudentByID(scholStudentID);

                                        if (scholStudent != null) {
                                            System.out.println("\nScholarship Types:");
                                            System.out.println("  full     - 100% discount");
                                            System.out.println("  partial  - 50% discount");
                                            System.out.println("  academic - 25% discount");
                                            System.out.print("\nEnter Scholarship Type: ");
                                            String scholType = scanner.nextLine();

                                            double newBalance = campusRegistrar.applyScholarshipDiscount(scholStudent,
                                                    scholType);
                                            System.out.println("New Balance: " + newBalance);
                                        }

                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        break;

                                    case 5:
                                        clearscreen();
                                        campusRegistrar.displayStudentTuitionStatus();
                                        System.out.println("\nPress Enter to return...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        break;

                                    case 6:
                                        clearscreen();
                                        System.out.println("Returning to Main Menu...");
                                        tuitionMenu = false;
                                        break;

                                    default:
                                        System.out.println("Invalid Choice (1-6 only). Please Try again");
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


                    case 7:
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
    }
}
