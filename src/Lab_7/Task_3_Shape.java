package Lab_7;

public abstract class Task_3_Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    // Constructor
    public Task_3_Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    // Abstract method
    public abstract void draw();
}
