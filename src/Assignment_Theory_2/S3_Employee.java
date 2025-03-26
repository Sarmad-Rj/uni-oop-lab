package Assignment_Theory_2;

public class S3_Employee {
    private int employeeId;
    private String name;
    private S3_Address address; // Composition

    // Constructor for Employee
    public S3_Employee(int employeeId, String name, S3_Address address) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Address: ");
        System.out.println("  Street: " + address.getStreet());
        System.out.println("  City: " + address.getCity());
        System.out.println("  Zip Code: " + address.getZipCode());
    }
}
