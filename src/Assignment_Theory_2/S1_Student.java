package Assignment_Theory_2;
import java.util.ArrayList;
import java.util.List;

public class S1_Student {
    private int studentId;
    private String name;
    private List<S1_Course> registeredCourses;

    public S1_Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public List<S1_Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(S1_Course course) {
        registeredCourses.add(course);
        System.out.println(name + " has registered for: " + course.getCourseName());
    }

}