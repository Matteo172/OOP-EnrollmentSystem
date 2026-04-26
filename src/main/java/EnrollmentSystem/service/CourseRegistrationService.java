package EnrollmentSystem.service;
import java.util.*;
import EnrollmentSystem.model.Course;

public class CourseRegistrationService implements CourseReg {

    public List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course){
        for(Course c : courses) {
            if(c.getCourseID().equals(course.getCourseID())){
                System.out.println("Error: Course ID " + course.getCourseID() + " already exists.");
                return;
            }
        }
        courses.add(course);
    }

    @Override
    public void DisplayCourse(){
        if(courses.isEmpty()){
            System.out.println("No Course/s Found.");
        }else{
            System.out.println("\n====== LIST OF COURSE ======");
            System.out.println(courses);
        }
    }

    //Update
    @Override
    public void UpdateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseID().equals(course.getCourseID())) {
                courses.set(i, course);
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
