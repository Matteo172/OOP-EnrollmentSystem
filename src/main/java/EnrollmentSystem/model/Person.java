package EnrollmentSystem.model;

public abstract class Person {

    private int ID;
    private String Name;

    public Person(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }

    public Person() {
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public abstract void mainTask();


}
