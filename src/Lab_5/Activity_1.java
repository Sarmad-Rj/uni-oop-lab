package Lab_5;

public class Activity_1 {

    public static void main(String args[]) {
        Activity_1_studentRecord s = new Activity_1_studentRecord();
        s.setDegree("MBA");
        Activity_1_employeeRecord e = new Activity_1_employeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Activity_1_Manager m1 = new Activity_1_Manager("financeManager", 5000, e, s);
        m1.display();
    }
}
