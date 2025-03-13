package Lab_3;

public class Activity_1 {
    public static void main(String[] args) {

        // using default Constructor
        Activity_1_Circle ca = new Activity_1_Circle();
        System.out.println("Circumference of Circle 0 is: " + ca.CalculateCircumference());

        // using parametrized Constructor
        Activity_1_Circle cb = new Activity_1_Circle(1);
        System.out.println("Circumference of Circle 0 is: " + cb.CalculateCircumference());

        // using setter
        Activity_1_Circle c1 = new Activity_1_Circle();
        c1.setRadius(15);
        System.out.println("Circumference of Circle 1 is: " + c1.CalculateCircumference());

        // using getter
        int r = c1.getRadius();
        System.out.println("Rechecking the radius value: " + r);


        Activity_1_Circle c2 = new Activity_1_Circle();
        c2.setRadius(25);
        System.out.println("Circumference of Circle 2 is: " + c2.CalculateCircumference());

    }
}
