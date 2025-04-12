package Lab_7;

public class Activity_1_B extends Activity_1_A{

    int k;

    Activity_1_B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k – this overrides show() in A
    @Override
    void show() {
        System.out.println("k: " + k);
    }
}
