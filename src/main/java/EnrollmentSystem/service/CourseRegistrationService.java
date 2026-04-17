package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Course;

public class CourseRegistrationService implements CourseReg {

    Scanner scanner = new Scanner(System.in);

    public List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public void DisplayCourse(){
        if(courses.isEmpty()){
            System.out.println("No Course/s Found.");
        }else{
            System.out.println(courses);
        }
    }

    //Update
    @Override
    public void UpdateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseID().equals(course.getCourseID())) {
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Program: ");
                String program = scanner.nextLine();

                courses.set(i, new Course(course.getCourseID(), name, program));
                break;
            }
        }
    }

    //Remove
    @Override
    public void RemoveCourse(Course course){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseID().equals(course.getCourseID())){
                courses.remove(i);
                break;
            }
        }
    }

}
