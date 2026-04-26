package EnrollmentSystem.service;
import EnrollmentSystem.model.Course;
import EnrollmentSystem.model.Department;
import EnrollmentSystem.model.Instructor;
import EnrollmentSystem.model.Section;

import java.util.List;

public interface DepartmentReg {
    void addDepartment(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList);
    void DisplayDepartments();
    void UpdateDepartment(Department department);
    void RemoveDepartment(Department department);
}
