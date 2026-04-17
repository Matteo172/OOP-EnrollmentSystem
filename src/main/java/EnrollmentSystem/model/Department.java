package EnrollmentSystem.model;
import java.util.*;

public class Department {

    private String departmentID, departmentName;
    private List<Instructor> InstructorList;

    public Department(String departmentID, String departmentName, List<Instructor> InstructorList) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.InstructorList = InstructorList;
    }

    public void setdepartmentID(String departmentID){
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setInstructorList(List<Instructor> InstructorList){
        this.InstructorList = InstructorList;
    }

    public String getDepartmentID(){
        return departmentID;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public List<Instructor> InstructorList(){
        return InstructorList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", InstructorList=" + InstructorList +
                '}';
    }
}
