//Scenario 1: Course Registration System
//A university wants to develop a Course Registration System where students can register for courses.
//The system should have the following:
//           A Student class with attributes studentId, name, and a list of registered courses.
//           A Course class with attributes courseId, courseName, and creditHours.
//           A Registration class that associates students with courses (use Aggregation).
//Problem Statement:
//           Draw a class diagram representing the system.
//           Implement the Student, Course, and Registration classes in Java.
//           Demonstrate object creation and interaction in a main method.

package Assignment_Theory_2;

public class S1_Runner {
    public static void main(String[] args) {
        // Create Students
        S1_Student student1 = new S1_Student(1, "Alice");
        S1_Student student2 = new S1_Student(2, "Bob");

        // Create Courses
        S1_Course course1 = new S1_Course(101, "Data Structures", 3);
        S1_Course course2 = new S1_Course(102, "Operating Systems", 4);

        // Students Registering for Courses
        student1.registerCourse(course1);
        student2.registerCourse(course2);

        // Registration Details
        S1_Registration reg1 = new S1_Registration(student1, course1);
        S1_Registration reg2 = new S1_Registration(student2, course2);

        System.out.println("\nRegistration Details:");
        reg1.showRegistrationDetails();
        reg2.showRegistrationDetails();
    }
}
