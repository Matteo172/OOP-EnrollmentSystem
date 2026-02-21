package EnrollmentSystem.model;

public class Student {

    private String studentName, Sprogram;
    private int studentID;

    public Student(int studentID, String studentName, String program){
        this.studentID = studentID;
        this.studentName = studentName;
        this.Sprogram = program;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getSProgram(){
        return Sprogram;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setSProgram(String Sprogram){
        this.Sprogram = Sprogram;
    }

    public void display(){
        System.out.printf("\nStudent Name: %s\nStudent ID: %s\nProgram: %s",getStudentName(),getStudentID(),getSProgram());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", Sprogram='" + Sprogram + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
