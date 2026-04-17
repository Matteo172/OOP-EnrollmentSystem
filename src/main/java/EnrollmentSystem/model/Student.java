package EnrollmentSystem.model;

public class Student extends Person{

    private String studentProgram;

    public Student(){

    }

    public Student(int ID, String Name) {
        super(ID, Name);
    }

    public Student(int ID, String Name, String studentProgram) {
        super(ID, Name);
        this.studentProgram = studentProgram;
    }

    public String getstudentProgram(){
        return studentProgram;
    }

    public void setstudentProgram(String studentProgram){
        this.studentProgram = studentProgram;
    }

    public void mainTask(){
        System.out.println("Studies");
    }

    @Override
    public String toString() {
        return "ID: " + getID() + " | Name: " + getName() + " | Program: " + getstudentProgram();
    }
}