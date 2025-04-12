package Lab_7;

public class Task_3_Triangle extends Task_3_Shape{
    public Task_3_Triangle(String penColor, String fillColor) {
        super(3, penColor, fillColor); // A triangle has 3 lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with Pen Color: " + penColor + " and Fill Color: " + fillColor);
    }
}
