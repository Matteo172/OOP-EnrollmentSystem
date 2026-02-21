package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Course;
import EnrollmentSystem.Maincode;
import EnrollmentSystem.model.Student;

public class CourseRegistration {

    Scanner scanner = new Scanner(System.in);

    public ArrayList<Course> courses = new ArrayList();

    public void addCourse(Course course){
        courses.add(course);
    }

    public void DisplayCourse(){
        System.out.println(courses);
    }

    //Update
    public void UpdateStudent(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseID() == (course.getCourseID())) {
                System.out.print("Enter Name: ");
                String name = scanner.next();

                System.out.print("Enter Program: ");
                String program = scanner.next();

                courses.set(i, new Course(course.getCourseID(), name, program));
                break;
            }
        }
    }

    //Remove
    public void RemoveStudent(Course course){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseID() == (course.getCourseID())){
                courses.remove(i);
            }
        }
    }


}
