package Lab_5;

public class Activity_1_Manager {
    private String title;
    private double dues;
    private Activity_1_employeeRecord emp;
    private Activity_1_studentRecord stu;
    public Activity_1_Manager(String t, double d, Activity_1_employeeRecord e, Activity_1_studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is : " +
                title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:");
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : " + stu.getDegree());
    }

}
