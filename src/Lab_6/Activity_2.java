package Lab_6;

public class Activity_2 {
    public static void main(String []args){
        Activity_2_Regular regularObj = new Activity_2_Regular("Ahmed","090078601","Islamabad",15000,60000);
        regularObj.Display();
        Activity_2_Adhoc adhocObj = new Activity_2_Adhoc("Ali","03333333333","Rawalpindi",500,23,1500);
        adhocObj.Display();
    }

}
