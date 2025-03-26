package online_class;

public class T1_Time {
    private int hours;
    private int minutes;
    private int seconds;

    //default
    public T1_Time(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // parameterized
    public T1_Time(int h, int m, int s){
        if(h>=0 && h<=23 && m >=0 && m <= 60 && s >=0 && s <= 60  ){
            this.hours = h;
            this.minutes = m;
            this.seconds = s;
        } else {
            System.out.print("\nInvalid values!! time is set to 00:00:00");
        }

    }

    public void displayTime(){
        System.out.printf("\nCurrent time is: %02d:%02d:%02d", hours, minutes,seconds);
    }


}
