package EnrollmentSystem.model;
import java.util.*;

public class Instructor extends Person {


    private String Course;

    public Instructor(String Name, int ID){
        super(Name, ID);
    }

    public String getCourse(){
        return Course;
    }

    public void setCourse(String Course){
        this.Course = Course;
    }

}
