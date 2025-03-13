package Lab_3;

public class Activity_2 {
    public static void main(String[] args) {

        Activity_2_Rectangle rect = new Activity_2_Rectangle();
        rect.Activity_2_setLength(5);
        rect.Activity_2_setWidth(10);
        System.out.println("Area of Rectangle is: " + rect.area());
        System.out.println("Width of Rectangle is: " + rect.getWidth());


    }
}
