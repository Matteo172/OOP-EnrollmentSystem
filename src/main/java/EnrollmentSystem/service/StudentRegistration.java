package EnrollmentSystem.service;
import EnrollmentSystem.model.Student;
import EnrollmentSystem.Maincode;
import org.w3c.dom.ls.LSOutput;


import java.util.*;

public class StudentRegistration {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList();

    public void addStudent(Student student){
        students.add(student);
    }

    public void DisplayStudent(){
        System.out.println(students);
    }

    //Update
    public void UpdateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == (student.getStudentID())) {
                System.out.print("Enter Name: ");
                String name = scanner.next();

                System.out.print("Enter Program: ");
                String program = scanner.next();

                students.set(i, new Student(student.getStudentID(), name, program));
                break;
            }
        }
    }

    //Remove
    public void RemoveStudent(Student student){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStudentID() == (student.getStudentID())){
                students.remove(i);
            }
        }
    }



}
