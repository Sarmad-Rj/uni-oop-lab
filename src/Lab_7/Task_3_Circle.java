package Lab_7;

public class Task_3_Circle extends Task_3_Shape{
    public Task_3_Circle(String penColor, String fillColor) {
        super(0, penColor, fillColor); // A circle has no straight lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with Pen Color: " + penColor + " and Fill Color: " + fillColor);
    }
}
