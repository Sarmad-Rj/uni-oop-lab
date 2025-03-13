package Lab_4;

public class Activty_3_Point {
    private int X;
    private int Y;

    public Activty_3_Point() {
        X = 5;
        Y = 6;
    }
    public Activty_3_Point(int a, int c) {
        X = a;
        Y = c;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Activty_3_Point Add(Activty_3_Point Pa, Activty_3_Point Pb) {
        Activty_3_Point p_new = new Activty_3_Point(X + Pa.X + Pb.X, Y + Pa.Y + Pb.Y);
        return p_new;
    }
    public void display() {
        System.out.println(X);
        System.out.println(Y);
    }


}
