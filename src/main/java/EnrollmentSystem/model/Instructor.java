package EnrollmentSystem.model;

public class Instructor extends Person {


    private String Course;

    public Instructor(){

    }

    public Instructor(String Name, int ID){
        super(Name, ID);
    }

    public String getCourse(){
        return Course;
    }

    public void setCourse(String Course){
        this.Course = Course;
    }

    public void mainTask(){
        System.out.println("Teaches");
    }

}
