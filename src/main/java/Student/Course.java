package Student;

public class Course {

    private String courseID, courseName, program;


//    public Course(String courseID, String courseName, String program){
//        this.courseID = courseID;
//        this.courseName = courseName;
//        this.program = program;
//    }

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

    public void setCProgram(String program){
        this.program = program;
    }

    public void cDisplay(){
        System.out.printf("\nCourse Name: %s\nCourse ID: %s\nProgram: %s",getCourseName(), getCourseID(), getProgram());
    }

//    @Override
//    public String toString() {
//        return "Course{" +
//                "courseID='" + courseID + '\'' +
//                ", courseName='" + courseName + '\'' +
//                ", program='" + program + '\'' +
//                '}';

}
