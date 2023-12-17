import java.util.ArrayList;

public class Student extends User{
    protected ArrayList<String> enrolledCourse;

    public Student (String name, int id) {
        super(name, id);
        this.enrolledCourse = new ArrayList<>();
    }

    public void enrollInCourse(String courses) {
        String[] courseArray = courses.split(", ");
        for (String course : courseArray) {
            enrolledCourse.add(course);
        }
    }

    @Override
    public String getUserDetail() {
        return "Student - " + super.getUserDetail() + "\n" +
               "Enrolled Courses: " + enrolledCourse;
    } 
}