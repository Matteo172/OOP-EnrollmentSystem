package EnrollmentSystem.service;
import EnrollmentSystem.model.Student;
import java.util.*;

public class StudentRegistrationService implements StudentReg {

    public List<Student> students = new ArrayList<>();

    //Add
    @Override
    public void addStudent(Student student){
        for (Student s : students) {
            if (s.getID() == student.getID()) {
                System.out.println("Error: Student ID " + student.getID() + " already exists.");
                return;
            }
        }
        students.add(student);
    }

    //Display
    @Override
    public void DisplayStudent(){
        if(students.isEmpty()){
            System.out.println("No Student/s Found.");
        }else{
            System.out.println("\n====== LIST OF STUDENTS ======");
            System.out.println(students);
        }
    }

    //Update
    @Override
    public void UpdateStudent(Student student) {
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
                break;
            }
        }
    }

}
