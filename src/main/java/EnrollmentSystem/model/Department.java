package EnrollmentSystem.model;
import java.util.*;

public class Department {

    private String departmentID, departmentName;
    private List<Instructor> instructorList;
    private List<Section> sectionList;

    public Department(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = instructorList;
        this.sectionList = sectionList;
    }

    public void setDepartmentID(String departmentID){
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setInstructorList(List<Instructor> instructorList){
        this.instructorList = instructorList;
    }

    public String getDepartmentID(){
        return departmentID;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public List<Instructor> getInstructorList(){
        return instructorList;
    }

    public List<Section> getSectionList(){
        return sectionList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", InstructorList=" + instructorList +
                ", SectionList=" +sectionList +
                '}';
    }
}
