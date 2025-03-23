//Scenario 01: Time Management System
// A digital clock application requires a Time Management System that ensures valid time input and provides time display functionality.
//Problem Statement:
//         Define a Time class with three private attributes: hours, minutes, and seconds.
//         Implement two constructors:
//                    o One to initialize the time with default values (00:00:00).
//                     o Another to allow user-defined values with validation checks to ensure valid time input (hours: 0-23, minutes: 0-59, seconds: 0-59).
//         Provide a displayTime() method to print the current time.
//         Implement a main method to create multiple Time objects with valid and invalid values, ensuring proper validation.


package Assignment_2;

public class P1 {
    public static void main(String[] args) {

        P1_Time time1 = new P1_Time();
        time1.displayTime();

        P1_Time time2 = new P1_Time(12, 30, 45);
        time2.displayTime();

        P1_Time time3 = new P1_Time(25, 65, 70);
        time3.displayTime();
    }
}
