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
            for(Student s : students){
                System.out.println(s);
            }
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

    //finding Student by their ID
    @Override
    public Student findStudentByID(int studentID) {
        for (Student s : students) {
            if (s.getID() == studentID) {
                return s;
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    //finding Student by their Name
    @Override
    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    //Display Student Tuition Status
    @Override
    public void displayStudentTuitionStatus() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }
        System.out.println("\n====== STUDENT TUITION STATUS ======");
        for (Student s : students) {
            System.out.println("ID      : " + s.getID());
            System.out.println("Name    : " + s.getName());
            System.out.println("Total   : " + s.getTotalTuition());
            System.out.println("Balance : " + s.getTuitionBalance());
            System.out.println("Status  : " + (s.isFullyPaid() ? "FULLY PAID" : "PENDING"));
            System.out.println("------------------------------");
        }
    }

}
