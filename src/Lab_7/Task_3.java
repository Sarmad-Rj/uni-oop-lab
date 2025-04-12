package Lab_7;

public class Task_3 {
    public static void main(String[] args) {
        Task_3_Shape circle = new Task_3_Circle("Blue", "Red");
        Task_3_Shape square = new Task_3_Square("Black", "Yellow");
        Task_3_Shape triangle = new Task_3_Triangle("Green", "White");

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
