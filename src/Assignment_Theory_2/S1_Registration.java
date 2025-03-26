package Assignment_Theory_2;

public class S1_Registration {

    private S1_Student student;
    private S1_Course course;

    public S1_Registration(S1_Student student, S1_Course course) {
        this.student = student;
        this.course = course;
    }

    public void showRegistrationDetails() {
        System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        System.out.println("Registered Course: " + course.getCourseName() + " (Credits: " + course.getCreditHours() + ")");
    }
}
