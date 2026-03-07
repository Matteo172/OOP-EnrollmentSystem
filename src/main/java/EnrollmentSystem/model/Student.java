package EnrollmentSystem.model;

public class Student extends Person{


    private String Sprogram;

    public Student(String Name, int ID) {
        super(Name, ID);
    }

    public String getSprogram(){
        return Sprogram;
    }

    public void setSprogram(String Sprogram){
        this.Sprogram = Sprogram;
    }

}
