package Lab_3;

public class Activity_2_Rectangle {
    private int length, width;
    public Activity_2_Rectangle() {
        length = 5;
        width = 2;
    }
    public Activity_2_Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public void Activity_2_setLength(int l) {
        length = l;
    }

    public void Activity_2_setWidth(int w) {
        width = w;
    }
    public int Activity_2_getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int area() {
        return (length * width);
    }

}
