package EnrollmentSystem.service;
import EnrollmentSystem.model.Student;
import java.util.*;

public class StudentRegistrationService implements StudentReg {

    Scanner scanner = new Scanner(System.in);
    public List<Student> students = new ArrayList<>();

    //Add
    @Override
    public void addStudent(Student student){
        students.add(student);
    }

    //Display
    @Override
    public void DisplayStudent(){
        if(students.isEmpty()){
            System.out.println("No Student/s Found.");
        }else{
            System.out.println("\n====== ENROLLED STUDENTS ======");
            System.out.println(students);
        }
    }

    //Update
    @Override
    public void UpdateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Program: ");
                String program = scanner.nextLine();

                students.set(i, new Student(student.getID(), name, program));
                break;
            }
        }
    }

    //Remove
    @Override
    public void RemoveStudent(Student student){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getID() == (student.getID())){
                students.remove(i);
                break;
            }
        }
    }

}
