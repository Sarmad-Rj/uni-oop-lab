package Lab_4;

public class Activity_3 {
    public static void main(String[] args) {
        Activty_3_Point p1 = new Activty_3_Point(10, 20);
        Activty_3_Point p2 = new Activty_3_Point(30, 40);
        Activty_3_Point p3 = new Activty_3_Point();
        Activty_3_Point p4 = p1.Add(p2, p3);
        p4.display();
    }
}
