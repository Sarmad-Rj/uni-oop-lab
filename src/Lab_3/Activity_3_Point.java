package Lab_3;

public class Activity_3_Point {
    private int x;
    private int y;

    public Activity_3_Point() {
        x = 0;
        y = 0;
    }

    public Activity_3_Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }
    public void setY(int b) {
        y = b;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void display() {
        System.out.println("x coordinate = " + x
                + " y coordinate = " + y);
    }
    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }
}