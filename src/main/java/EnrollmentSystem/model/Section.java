package EnrollmentSystem.model;
import java.util.*;

public class Section {

    private String sectionID;
    private Course course;
    private Instructor instructor;
    private List<Student> studentList;
    private int maxCapacity;

    public Section(String sectionID, Course course, Instructor instructor, int maxCapacity){
        this.sectionID = sectionID;
        this.course = course;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.studentList = new ArrayList<>();
    }

    public void setSectionID(String sectionID){
        this.sectionID = sectionID;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public String getSectionID(){
        return sectionID;
    }

    public Course getCourse(){
        return course;
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public List<Student> getEnrolledStudents(){
        return studentList;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionID='" + sectionID + '\'' +
                ", course=" + course +
                ", instructor=" + instructor +
                ", studentList=" + studentList +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
