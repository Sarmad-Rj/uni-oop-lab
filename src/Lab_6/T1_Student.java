package Lab_6;

public class T1_Student extends T1_Person {
    public void studentStatus(){
        System.out.println("Status of the Student!");
        System.out.println("Student Name: " + getName() );
        System.out.println("Student Address: " + getAddress() );
        System.out.println("Student Phone Number: " + getPhoneNO() );
        System.out.println("Student Email: " + getEmail() );
    }
}


