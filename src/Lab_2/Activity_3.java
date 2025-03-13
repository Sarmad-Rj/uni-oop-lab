package Lab_2;

public class Activity_3 {
    public static void main (String[] args){
        Point p1 = new Point();
        System.out.println("Default value: ");
        p1.display();

        System.out.println("Set value: ");
        p1.setx(4);
        p1.sety(2);
        p1.display();

        System.out.println("After Move value: ");
        p1.movePoint(5,5);

    }
}
