package Lab_2;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 1;
        y = 2;
    }

    public Point (int a, int b) {
        x = a;
        y = b;
    }

    public void setx ( int a) {
        x = a;
    }

    public void sety ( int b) {
        y = b;
    }

    public void display () {
        System.out.println("X coordinate: " + x + "\nY coordinate: " + y + "\n");
    }

    public void movePoint(int a, int b){
        x += a;
        y += b;
        System.out.println("X coordinate after moving: " + x + "\nY coordinate after moving: " + y + "\n");
    }
}
