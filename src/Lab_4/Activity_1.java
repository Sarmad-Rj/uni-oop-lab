package Lab_4;

public class Activity_1 {
    public static void main(String[]args) {
        Activity_1_ObjectPass p = new Activity_1_ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value); // output is 5 ObjectPass.increment(p);
        Activity_1_ObjectPass.increment(p);
        System.out.println("After calling: " + p.value); // output is 6
    }
}
