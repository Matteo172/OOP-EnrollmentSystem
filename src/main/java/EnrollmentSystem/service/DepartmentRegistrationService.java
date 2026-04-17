package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Department;
import EnrollmentSystem.model.Instructor;

public class DepartmentRegistrationService implements DepartmentReg {

    Scanner scanner = new Scanner(System.in);
    public List<Department> departments = new ArrayList<>();

    @Override
    public void addDepartment(String departmentID, String departmentName, List<Instructor> InstructorList) {
        Department newDepartment = new Department(departmentID, departmentName, InstructorList);
        departments.add(newDepartment);
    }

    @Override
    public void DisplayDepartments(){
        if(departments.isEmpty()){
            System.out.println("No Department/s Found.");
        }else{
            System.out.println(departments);
        }
    }

    @Override
    public void UpdateDepartment(Department department) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getDepartmentID().equals(department.getDepartmentID())) {
                System.out.print("Enter new Department Name: ");
                String name = scanner.nextLine();
                departments.get(i).setDepartmentName(name);
                System.out.println("Department updated.");
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
