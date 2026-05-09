package EnrollmentSystem.service;

import EnrollmentSystem.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class DepartmentRegistrationServiceTest {

    private DepartmentRegistrationService departmentService;
    private Department department1, department2;
    private List<Instructor> instructorList;
    private List<Section> sectionList;
    private Section section1;
    private Course course;

    @BeforeEach
    void setup() {
        departmentService = new DepartmentRegistrationService();
        instructorList = new ArrayList<>();
        sectionList = new ArrayList<>();
        course = new Course("C01", "Programming", "BSIT");
        Instructor instructor = new Instructor(1, "Mr. Santos", "Programming");
        section1 = new Section("BSIT-1A", course, instructor, 30);
        department1 = new Department("D01", "College of Computer Studies", instructorList, sectionList);
        department2 = new Department("D02", "College of Engineering", new ArrayList<>(), new ArrayList<>());
    }

    @Test
    void shouldAddDepartmentSuccessfully() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        assertEquals(1, departmentService.departments.size());
    }

    @Test
    void shouldRejectDuplicateDepartmentID() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        departmentService.addDepartment("D01", "Duplicate", new ArrayList<>(), new ArrayList<>());
        assertEquals(1, departmentService.departments.size());
    }

    @Test
    void shouldDisplayNoDepartmentsWhenEmpty() {
        departmentService.DisplayDepartments();
        assertEquals(0, departmentService.departments.size());
    }

    @Test
    void shouldDisplayDepartmentsWhenNotEmpty() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        departmentService.DisplayDepartments();
        assertEquals(1, departmentService.departments.size());
    }

    @Test
    void shouldDisplayNoSectionsWhenDepartmentsEmpty() {
        departmentService.viewAllDepartmentsWithSections();
        assertEquals(0, departmentService.departments.size());
    }

    @Test
    void shouldDisplayDepartmentsWithSections() {
        sectionList.add(section1);
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        departmentService.viewAllDepartmentsWithSections();
        assertEquals(1, departmentService.departments.size());
    }

    @Test
    void shouldDisplayDepartmentWithNoSections() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, new ArrayList<>());
        departmentService.viewAllDepartmentsWithSections();
        assertEquals(1, departmentService.departments.size());
    }

    @Test
    void shouldUpdateDepartmentSuccessfully() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        Department updated = new Department("D01", "CCS Updated", instructorList, sectionList);
        departmentService.UpdateDepartment(updated);
        assertEquals("CCS Updated", departmentService.departments.get(0).getDepartmentName());
    }

    @Test
    void shouldNotCrashWhenUpdatingNonExistentDepartment() {
        Department nonExistent = new Department("D99", "Ghost", instructorList, sectionList);
        departmentService.UpdateDepartment(nonExistent);
        assertEquals(0, departmentService.departments.size());
    }

    @Test
    void shouldRemoveDepartmentSuccessfully() {
        departmentService.addDepartment("D01", "College of Computer Studies", instructorList, sectionList);
        departmentService.RemoveDepartment(department1);
        assertEquals(0, departmentService.departments.size());
    }

    @Test
    void shouldNotCrashWhenRemovingNonExistentDepartment() {
        Department nonExistent = new Department("D99", "Ghost", instructorList, sectionList);
        departmentService.RemoveDepartment(nonExistent);
        assertEquals(0, departmentService.departments.size());
    }
}