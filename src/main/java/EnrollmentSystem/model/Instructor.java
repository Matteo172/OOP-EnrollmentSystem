package EnrollmentSystem.model;

public class Instructor extends Person {

    private String course;

    public Instructor(){

    }

    public Instructor(int ID, String Name){
        super(ID, Name);
    }

    public Instructor(int ID, String Name, String course){
        super(ID, Name);
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void mainTask(){
        System.out.println("Teaches");
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "Course='" + course + '\'' +
                '}';
    }
}