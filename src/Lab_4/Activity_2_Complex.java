package Lab_4;

public class Activity_2_Complex {
    private double real;
    private double imag;
    public Activity_2_Complex() {
        real = 0.0;
        imag = 0.0;
    }
    public Activity_2_Complex(double r, double im) {
        real = r;
        imag = im;
    }
    public Activity_2_Complex Add(Activity_2_Complex b) {
        Activity_2_Complex c_new = new Activity_2_Complex(real + b.real, imag + b.imag);
        return c_new;
    }
    public void Show() {
        System.out.println(real + imag);
    }

}
