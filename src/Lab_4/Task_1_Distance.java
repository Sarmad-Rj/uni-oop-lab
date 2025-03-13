package Lab_4;

public class Task_1_Distance {
    private int feet;
    private int inches;
    public Task_1_Distance(){
        this.feet = 0;
        this.inches = 0;
    }
    public Task_1_Distance(int a, int b){
        this.feet = a;
        this.inches = b;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public Task_1_Distance add(Task_1_Distance d) {
        int tf = this.feet + d.feet;
        int ti = this.inches + d.inches;
        if (ti >= 12) {
            tf += ti / 12;
            ti %= 12;
        }
        return new Task_1_Distance(tf, ti);
    }
}
