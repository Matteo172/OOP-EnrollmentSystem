package EnrollmentSystem.model;

public class Instructor extends Person {

    private String Course;

    public Instructor(){

    }

    public Instructor(int ID, String Name){
        super(ID, Name);
    }

    public Instructor(int ID, String Name, String Course){
        super(ID, Name);
        this.Course = Course;
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

    @Override
    public String toString() {
        return "Instructor{" +
                "Course='" + Course + '\'' +
                '}';
    }
}