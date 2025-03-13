package Assignment_1;

class Invoice {
    int invoiceId;
    Customer customer;
    Purchase purchase;
    double totalBill;
    double appliedDiscounts;

    Invoice(int invoiceId, Customer customer, Purchase purchase, double appliedDiscounts) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.purchase = purchase;
        this.appliedDiscounts = appliedDiscounts;
    }
    void generateInvoice() {
        totalBill = purchase.calculateTotal() - appliedDiscounts;
        int loyaltyPointsEarned = (int) (totalBill / 10); // 1 point per $10
        customer.addLoyaltyPoints(loyaltyPointsEarned);

        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products: ");
        for (Product product : purchase.getProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Applied Discounts: $" + appliedDiscounts);
        System.out.println("Loyalty Points Earned: " + loyaltyPointsEarned);
        System.out.println("Total Loyalty Points: " + customer.getLoyaltyPoints());
    }
    int getInvoiceId(){return invoiceId;}
    Customer getCustomer(){return customer;}
    Purchase getPurchase(){return purchase;}
    double getTotalBill(){return totalBill;}
    double getAppliedDiscounts(){return appliedDiscounts;}
}


