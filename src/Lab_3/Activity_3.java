package Lab_3;

public class Activity_3 {
    public static void main(String[] args) {
        Activity_3_Point p1 = new Activity_3_Point();
        p1.setX(10);
        p1.setY(7);
        p1.display();

        Activity_3_Point p2 = new Activity_3_Point(10, 11);
        p2.movePoint(2, 3);
        p2.display();
    }
}
