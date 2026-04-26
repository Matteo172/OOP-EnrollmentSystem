package EnrollmentSystem.model;

public class Course {

    private String courseID, courseName, program;

    public Course(String courseID, String courseName, String Program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = Program;
    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getProgram(){
        return program;
    }

    public void setCourseID(String courseID){
        this.courseID = courseID;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void courseDisplay(){
        System.out.printf("\nCourse Name: %s\nCourse ID: %s\nProgram: %s",getCourseName(), getCourseID(), getProgram());
    }

    @Override
    public String toString() {
        return "ID: " + getCourseID() + " | Name: " + getCourseName() + " | Program: " + getProgram();
    }
}
