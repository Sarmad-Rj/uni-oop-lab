package Lab_7;

public class Task_3_Square extends Task_3_Shape{
    public Task_3_Square(String penColor, String fillColor) {
        super(4, penColor, fillColor); // A square has 4 lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with Pen Color: " + penColor + " and Fill Color: " + fillColor);
    }
}
