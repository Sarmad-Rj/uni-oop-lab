package Lab_3;

public class Activity_1_Circle {
    private int radius;

    public Activity_1_Circle() {
        radius = 10;
    }
    public Activity_1_Circle(int r) {
        radius = r;
    }
    public void setRadius(int r) {
        radius = r;
    }
    public int getRadius() {
        return radius;
    }

    public void display() {
        System.out.println("radius = " + radius);
    }
    public double CalculateCircumference() {
        double a = 3.14 * radius * radius;
        return a;
    }



}
