package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Course;

public class CourseRegistrationImpl implements CourseRegistration {

    Scanner scanner = new Scanner(System.in);

    public ArrayList<Course> courses = new ArrayList();

    @Override
    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public void DisplayCourse(){
        System.out.println(courses);
    }

    //Update
    @Override
    public void UpdateCourse(Course course) {
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
    @Override
    public void RemoveCourse(Course course){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseID() == (course.getCourseID())){
                courses.remove(i);
                break;
            }
        }
    }


}
