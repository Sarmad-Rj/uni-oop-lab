package Lab_4;

public class Activity_2 {
    public static void main(String args[]) {
        Activity_2_Complex C1 = new Activity_2_Complex(11, 2.3);
        Activity_2_Complex C2 = new Activity_2_Complex(9, 2.3);
        Activity_2_Complex C3 = new Activity_2_Complex();
        C3 = C1.Add(C2);
        C3.Show();
    }

}
