package EnrollmentSystem.model;

public class Student extends Person{

    private String Sprogram;

    public Student(){

    }

    public Student(String Name, int ID) {
        super(Name, ID);
    }

    public Student(int ID, String Name, String Sprogram) {
        super(Name, ID);
        this.Sprogram = Sprogram;
    }

    public String getSprogram(){
        return Sprogram;
    }

    public void setSprogram(String Sprogram){
        this.Sprogram = Sprogram;
    }

    public void mainTask(){
        System.out.println("Studies");
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sprogram='" + Sprogram + '\'' +
                '}';
    }


}
