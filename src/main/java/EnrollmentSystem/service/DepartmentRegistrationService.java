package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Department;
import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Section;

public class DepartmentRegistrationService implements DepartmentReg {

    public List<Department> departments = new ArrayList<>();

    @Override
    public void addDepartment(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList) {
        for (Department d : departments) {
            if (d.getDepartmentID().equals(departmentID)) {
                System.out.println("Error: Department ID " + departmentID + " already exists.");
                return;
            }
        }
        Department newDepartment = new Department(departmentID, departmentName, instructorList, sectionList);
        departments.add(newDepartment);
    }

    @Override
    public void DisplayDepartments(){
        if(departments.isEmpty()){
            System.out.println("No Department/s Found.");
        }else{
            System.out.println("\n====== LIST OF DEPARTMENTS ======");
            System.out.println(departments);
        }
    }

    @Override
    public void UpdateDepartment(Department department) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getDepartmentID().equals(department.getDepartmentID())) {
                departments.set(i, department);
                return;
            }
        }
        System.out.println("Department ID not found.");
    }

    @Override
    public void RemoveDepartment(Department department) {
        for(int i = 0; i < departments.size(); i++){
            if (departments.get(i).getDepartmentID().equals(department.getDepartmentID())) {
                departments.remove(i);
                return;
            }
        }
        System.out.println("Cannot remove: Department not found.");
    }

}
