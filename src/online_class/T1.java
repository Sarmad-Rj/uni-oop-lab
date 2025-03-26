package online_class;

public class T1 {
    public static void main(String[] args) {
        T1_Time t1 = new T1_Time();
        t1.displayTime();

        T1_Time t2 = new T1_Time(12, 25, 60);
        t2.displayTime();

        T1_Time t3 = new T1_Time(12, 710, 60);
        t3.displayTime();

    }
}
