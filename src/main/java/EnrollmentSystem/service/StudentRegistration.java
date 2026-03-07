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
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getID() == (student.getID())) {
                students.set(i, student);
                break;
            }
        }

    }

    //Remove
    public void RemoveStudent(Student student){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getID() == (student.getID())){
                students.remove(i);
            }
        }
    }



}
