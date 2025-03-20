package Lab_5;

public class Activity_2 {
    public static void main(String[] args) {
        Activity_2_Date b = new Activity_2_Date(1, 12, 1990);
        Activity_2_Date h = new Activity_2_Date(5, 6, 2016);
        Activity_2_employee e1 = new Activity_2_employee("xxx", "yyyy", b, h);
        e1.display();
    }
}
