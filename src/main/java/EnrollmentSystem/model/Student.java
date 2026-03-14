package EnrollmentSystem.model;

public class Student extends Person{


    private String Sprogram;

    public Student(String Name, int ID) {
        super(Name, ID);
    }

    public Student(String Name, int ID, String Sprogram) {
        super(Name, ID);
    }

    public String getSprogram(){
        return Sprogram;
    }

    public void setSprogram(String Sprogram){
        this.Sprogram = Sprogram;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sprogram='" + Sprogram + '\'' +
                '}';
    }


}
