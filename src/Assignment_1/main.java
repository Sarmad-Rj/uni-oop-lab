package Assignment_1;

public class main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Mouse", 25.0);
        Product product3 = new Product("Keyboard", 50.0);

        // Create a customer
        Customer customer1 = new Customer(1, "Alice");

        // Create a purchase
        Purchase purchase1 = new Purchase();
        purchase1.addProduct(product1);
        purchase1.addProduct(product2);
        purchase1.addProduct(product3);

        // Create an invoice
        Invoice invoice1 = new Invoice(101, customer1, purchase1, 20.0); // $20 discount

        // Generate the invoice
        invoice1.generateInvoice();
    }
}
