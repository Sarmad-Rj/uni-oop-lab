package Lab_1;
class CourseResult {
    public String studentname;
    public String coursename;
    public String grade;
    public void display() {
        System.out.println("Student Name is: " +
                studentname + "\n Course Name is: " + coursename
                + "\n Grade is:" + grade);
    }
}


public class b_lab_1 {
    public static void main(String[] args) {
        CourseResult c1 = new CourseResult();
        c1.studentname = "Ahmad";
        c1.coursename = "OOP";
        c1.grade = "A";
        c1.display();
        CourseResult c2 = new CourseResult();
        c2.studentname = "Sara";
        c2.coursename = "ICP";
        c2.grade = "A+";
        c2.display();

    }
}
