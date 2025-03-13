package Assignment_1;

class Customer {
    public int customerId;
    public String name;
    public int loyaltyPoints;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.loyaltyPoints = 0;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void addLoyaltyPoints(int points) { loyaltyPoints += points; }
}