package Assignment_Theory_2;


public class S3_Runner {// EmployeeManagementSystem

    public static void main(String[] args) {
        System.out.println("ROLL NO: SP24-BCS-069\nNAME: SARMAD\n ");

        // Create an Address Object
        S3_Address address1 = new S3_Address("123", "238 E/B", "12345");

        // Create an Employee Object with the Address
        S3_Employee employee1 = new S3_Employee(130, "MAZHAR", address1);

        // Display Employee Details
        System.out.println("Employee Details:");
        employee1.displayInfo();
    }
}
