package EnrollmentSystem.service;
import EnrollmentSystem.model.Student;


import java.util.*;

public class StudentRegistrationImpl implements StudentRegistration {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList();

    @Override
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public void DisplayStudent(){
        System.out.println(students);
    }

    //Update
    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getID() == (student.getID())) {
                students.set(i, student);
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
            }
        }
    }



}
