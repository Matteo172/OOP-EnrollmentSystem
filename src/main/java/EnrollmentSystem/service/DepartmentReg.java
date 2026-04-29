package EnrollmentSystem.service;
import EnrollmentSystem.model.Department;
import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Section;

import java.util.List;

public interface DepartmentReg {
    void addDepartment(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList);
    void DisplayDepartments();
    void viewAllDepartmentsWithSections();
    void UpdateDepartment(Department department);
    void RemoveDepartment(Department department);
}
