package Student;

public class Student {

    private String studentID, studentName, Sprogram;

//    public Student(String studentID, String studentName, String program){
//        this.studentID = studentID;
//        this.studentName = studentName;
//        this.program = program;
//    }

    public String getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getSProgram(){
        return Sprogram;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setSProgram(String Sprogram){
        this.Sprogram = Sprogram;
    }
}
