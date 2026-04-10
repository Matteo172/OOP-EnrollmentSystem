package EnrollmentSystem.service;
import EnrollmentSystem.model.Course;
import EnrollmentSystem.model.Student;


import java.util.*;

public class StudentRegistrationImpl implements StudentRegistration {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList();

    @Override
    public void addStudent(Student student){
        students.add(student);
    }

    //Display
    @Override
    public void DisplayStudent(){
        System.out.println(students);
    }

    //Update
    @Override
    public void UpdateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                System.out.print("Enter Name: ");
                String name = scanner.next();

                System.out.print("Enter Program: ");
                String program = scanner.next();

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
