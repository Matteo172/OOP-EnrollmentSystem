package EnrollmentSystem.model;

public class Student extends Person {

    private String studentProgram;
    private double totalTuition;
    private double tuitionBalance;

    public Student() {
    }

    public Student(int ID, String Name) {
        super(ID, Name);
    }

    public Student(int ID, String Name, String studentProgram) {
        super(ID, Name);
        this.studentProgram = studentProgram;
    }

    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }

    public double getTotalTuition() {
        return totalTuition;
    }

    public void setTotalTuition(double totalTuition) {
        this.totalTuition = totalTuition;
    }

    public double getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(double tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    public void mainTask() {
        System.out.println("Studies");
    }

    @Override
    public String toString() {
        return "ID: " + getID() + " | Name: " + getName() + " | Program: " + getStudentProgram();
    }
}