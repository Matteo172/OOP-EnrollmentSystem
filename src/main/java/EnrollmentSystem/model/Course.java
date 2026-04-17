package EnrollmentSystem.model;

public class Course {

    private String courseID, courseName, Program;

    public Course(String courseID, String courseName, String Program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.Program = Program;
    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getProgram(){
        return Program;
    }

    public void setCourseID(String courseID){
        this.courseID = courseID;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setCProgram(String program){
        this.Program = program;
    }

    public void courseDisplay(){
        System.out.printf("\nCourse Name: %s\nCourse ID: %s\nProgram: %s",getCourseName(), getCourseID(), getProgram());
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", Program='" + Program + '\'' +
                '}';
    }
}
